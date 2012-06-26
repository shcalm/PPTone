package com.pp.pptone;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TabHost;
import android.widget.TextView;

@SuppressWarnings("deprecation")
public class PPToneActivity extends TabActivity {
	
    TabHost mTabHost = null;
    private TextView mTextView;
    private RadioButton mRadioHotTone = null; 
    private RadioButton mRadioMakeNew = null;
    private RadioButton mRadioMytone = null;
    
    
    private LinearLayout mLinerHotTone = null;
    private LinearLayout mLinerMakeNew = null;
    private LinearLayout mLinerMyTone = null;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            
            this.requestWindowFeature(Window.FEATURE_NO_TITLE);
            
            this.setContentView(R.layout.main);

            
            mTabHost = getTabHost();

            mTabHost.addTab(mTabHost.newTabSpec("tab1")
                    .setIndicator("HotTone")
                    .setContent(new Intent(this, HotTone.class)));

            mTabHost.addTab(mTabHost.newTabSpec("tab2")
                    .setIndicator("MakeNew")
                    .setContent(new Intent(this, NewTone.class)));
            
            mTabHost.addTab(mTabHost.newTabSpec("tab3")
                    .setIndicator("MyTone")
                    .setContent(new Intent(this, MyToneList.class)));
            
            init();
            
    }
    private void init() {

	    mRadioHotTone = (RadioButton) findViewById(R.id.main_tab_addExam);
	    mRadioMakeNew = (RadioButton) findViewById(R.id.main_tab_myExam);      
	    mRadioMytone =(RadioButton) findViewById(R.id.main_tab_message);
                     
	    mLinerHotTone=(LinearLayout) findViewById(R.id.main_layout_addExam);
	    mLinerMakeNew=(LinearLayout) findViewById(R.id.main_layout_myExam);
	    mLinerMyTone=(LinearLayout) findViewById(R.id.main_layout_message);
        
      //  main_tab_addExam.setCompoundDrawablesWithIntrinsicBounds(
	  // null, getResources().getDrawable(R.drawable.label_one_one), null, null);
     //   main_layout_addExam.setBackgroundResource(R.drawable.labelbg);
        
	    mTextView=(TextView) findViewById(R.id.main_tab_unread_tv);
       // main_tab_unread_tv.setVisibility(View.VISIBLE);
        //main_tab_unread_tv.setText("3");
        
        mRadioHotTone.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				mTabHost.setCurrentTab(0);
				mRadioHotTone.setBackgroundResource(R.drawable.tab_bg);
				mRadioMakeNew.setChecked(false);
				mRadioMytone.setChecked(false);
				mLinerMakeNew.setBackgroundResource(R.drawable.mm_trans);
				mLinerMyTone.setBackgroundResource(R.drawable.mm_trans);
			}
        	
        	
        });
        
        mRadioMakeNew.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				mTabHost.setCurrentTab(1);
				mRadioMakeNew.setBackgroundResource(R.drawable.tab_bg);
				mRadioHotTone.setChecked(false);
				mRadioMytone.setChecked(false);
				mLinerHotTone.setBackgroundResource(R.drawable.mm_trans);
				mLinerMyTone.setBackgroundResource(R.drawable.mm_trans);
			}
        	
        	
        });
        mRadioMytone.setOnClickListener(new OnClickListener(){

			public void onClick(View v) {
				mTabHost.setCurrentTab(2);
				mRadioMytone.setBackgroundResource(R.drawable.tab_bg);
				mRadioHotTone.setChecked(false);
				mRadioMakeNew.setChecked(false);
				
				mLinerMakeNew.setBackgroundResource(R.drawable.mm_trans);
				mLinerHotTone.setBackgroundResource(R.drawable.mm_trans);
			}
        	
        	
        });
       
}
}