/*
 * Copyright (C) 2009 Teleca Poland Sp. z o.o. <android@teleca.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.pp.db;

import java.util.ArrayList;

/**

 */
public interface Database {
	
	/**
	 * save tone file to databases
	 * 
	 * @param tonfile
	 * 
	 */
	public void saveToneFile(ToneFile file);
	
	/**
	 * loadToneFile where id know
	 * 
	 * @param ToneFile
	 * 
	 */
	public ToneFile loadToneFile(int _id);
	
	
	/**
	 * loadToneFile where filename know
	 * 
	 * @param ToneFile
	 * 
	 */
	public ToneFile loadToneFile(String filename);
	
	
	/**
	 * Remove toneFile from database where filename knows
	 * 
	 * @param tonefile name
	 */
	public void deleteToneFile(String filename);
	
	/**
	 * Remove toneFile from database where id knows
	 * 
	 * @param tonefile name
	 */
	public void deleteToneFile(int _id);
	
	/**
	 * Get all available ToneFile from the database
	 * 
	 * @return
	 */
	public ArrayList<ToneFile> getToneFiles();
	
	/**
	 * get userInfo ----feature use
	 */
	
	public UserInfo getUserInfo();
	
}
