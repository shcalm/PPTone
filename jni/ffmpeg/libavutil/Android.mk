LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

include $(LOCAL_PATH)/../av.mk

LOCAL_SRC_FILES := $(FFFILES)
LOCAL_ARM_MODE := arm
LOCAL_C_INCLUDES :=		\
	$(LOCAL_PATH)		\
	$(LOCAL_PATH)/..

LOCAL_CFLAGS += $(FFCFLAGS)
LOCAL_CFLAGS += -O3 -fstrict-aliasing -fprefetch-loop-arrays
LOCAL_CFLAGS += -D__ARM_HAVE_NEON
LOCAL_MODULE := $(FFNAME)
LOCAL_ARM_NEON := true
LOCAL_PRELINK_MODULE := false
LOCAL_MODULE_TAGS := optional
#include $(BUILD_STATIC_LIBRARY)
include $(BUILD_SHARED_LIBRARY)
