package com.pp.db;

import java.io.File;
import java.util.ArrayList;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DataBaseImpl implements Database{

	private Context mContext;
	private static final String DB_NAME = "pptone";
	private static final String FILETABLENAME = "tonefile";
	public DataBaseImpl(Context context){
		mContext = context;
		CreateDatabases();
	}
	@Override
	public void deleteToneFile(String filename) {
		
		File file = new File();
		file.delete();
		
		
	}

	@Override
	public void deleteToneFile(int id) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public ArrayList<ToneFile> getToneFiles() {
		
		return null;
	}

	
	@Override
	public UserInfo getUserInfo() {

		return null;
	}

	
	@Override
	public ToneFile loadToneFile(int id) {

		return null;
	}

	@Override
	public ToneFile loadToneFile(String filename) {

		return null;
	}

	@Override
	public void saveToneFile(ToneFile file) {

		
	}
	private void CreateDatabases(){
		SQLiteDatabase db = mContext.openOrCreateDatabase(DB_NAME, Context.MODE_PRIVATE, null);

		// create tables if necessary
		
		db.execSQL("CREATE TABLE IF NOT EXISTS "
				+ FILETABLENAME
				+ " (filename VARCHAR ,"
				+ " fileid INTEGER PRIMARY KEY AUTOINCREMENT ,size INTEGER, uri VARCHAR);");
		
//		db.execSQL("CREATE TABLE IF NOT EXISTS "
//				+ TABLE_RECENT_RADIOS
//				+ " (radio_id INTEGER UNIQUE, radio_idstr VARCHAR, radio_name VARCHAR, radio_image VARCHAR, radio_date INTEGER);");
//		
//		db.execSQL("CREATE TABLE IF NOT EXISTS "
//				+ TABLE_FAVORITES
//				+ " (track_id INTEGER UNIQUE, track_name VARCHAR," 
//				+ " track_duration INTEGER, track_url VARCHAR, track_stream VARCHAR, track_rating REAL," 
//				+ " album_id INTEGER, album_name VARCHAR, album_image VARCHAR, album_rating REAL, artist_name VARCHAR);");

		db.close();
	}
	private SQLiteDatabase getDb(){
		return ext.openOrCreateDatabase(DB_NAME, Context.MODE_PRIVATE, null);
		
	}

}
