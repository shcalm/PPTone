package com.pp.pptone;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NewTone extends Activity {

	private Button mImportButton;
	private Button mMakeNewButton;
	private static final int IMPORT_RET = 1;
	private static final int MAKENEW_RET = 2;
	private static final String LOG_TAG = "ppTone_MakeNewTone";
	public void onCreate(Bundle bundle){
		super.onCreate(bundle);

		this.setContentView(R.layout.newtone);			
		mImportButton = (Button)this.findViewById(R.id.importfile);
		mMakeNewButton = (Button)this.findViewById(R.id.makenew);

		mImportButton.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				Intent innerIntent = new Intent(Intent.ACTION_GET_CONTENT);

				innerIntent.setType("audio/*"); //String VIDEO_UNSPECIFIED = "video/*";

				Intent wrapperIntent = Intent.createChooser(innerIntent, null);
				startActivityForResult(wrapperIntent, IMPORT_RET);

			}

		});
		mMakeNewButton.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
	            intent.setType("audio/amr");
	            intent.setClassName("com.android.soundrecorder",
	                    "com.android.soundrecorder.SoundRecorder");
	           // intent.putExtra(android.provider.MediaStore.Audio.Media.EXTRA_MAX_BYTES, sizeLimit);

	            startActivityForResult(intent, MAKENEW_RET);
			}

		});

	}
	public void onActivityResult(int requestCode, int resultCode, Intent data){
		if(data != null){
			Uri uri = data.getData();
			Log.d(LOG_TAG,"uri = "+ uri);
			Intent newintent = new Intent(NewTone.this,RingdroidEditActivity.class);
			newintent.setData(uri);
			startActivity(newintent);
		}
		switch(requestCode){
			case IMPORT_RET:
				
			break;
			case MAKENEW_RET:
				
			break;
			default:
			break;
			
		}
		
	}
	public void onPause(){
		super.onPause();

	}
	public void onResume(){
		super.onResume();

	}





}
