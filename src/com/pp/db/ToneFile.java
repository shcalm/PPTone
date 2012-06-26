package com.pp.db;

import android.net.Uri;

public class ToneFile {
	private String mFilename;
	private int mSize;
	private Uri mUri;
	public String getmFilename() {
		return mFilename;
	}
	public void setmFilename(String mFilename) {
		this.mFilename = mFilename;
	}
	public int getmSize() {
		return mSize;
	}
	public void setmSize(int mSize) {
		this.mSize = mSize;
	}
	public Uri getmUri() {
		return mUri;
	}
	public void setmUri(Uri mUri) {
		this.mUri = mUri;
	}
	
}
