package client;

/**
 * @class: SER 321
 * @author: Eric Sandlin
 */
/**
 * Copyright 2020 Tim Lindquist,
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Purpose: MediaLibraryImpl is the implementing class for library interface
 *
 * Ser321 Principles of Distributed Software Systems
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 2020
 */
  public class MusicLibrary {
  
 	 /*
 	  * @param
 	  * @return 
 	  * - a method to get the titles of albums stored in the library. It could return an array of string titles. 
 	  */
 	public String getAlbumNames(String []titles) {
        
 	    return null;
 	}
 	
 	/*
     * @param
     * @return 
 	 * - a method to get an Album object based on its title. You can assume that all albums in the library will have a unique title. 
 	 */
	public Album getAlbum() {
        
	    return null;
	}
	
	/*
	 * @param  
	 * - a method to add an album to the library. Used for example when the user wants to add the result of a Last.fm search to the library.
	 */ 
	public void addAlbum(){
	    
	}
	/*
     * @param 
	 * - a method to remove an album from the library.
	 */
	public void removeAlbum() {
	    
	}
	
	/*
	 * 
	 * - a method to serialize the library to a json file.
	 */
	public void saveLibraryToFile() {
	    
	}
	
	/*
	 * 
	 * - a method to (re)initialize the library by de-serializing from a json file.
	 */
	public void restoreLibraryFromFile(){
	    
	}
 }
 
 
 