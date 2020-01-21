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
  public class Album {
  	/*
  	 * - the title of the album.
  	 */
 	public String album_Name() {
        
 	    return null;
 	}
 	
 	/*
 	 * - the artist or group name.
 	 */
	public String artist() {
	     
	    return null;
	}
	
	/*
	 * - a collection of Track objects representing the music tracks in the album.
	 */
	public String[] Tracks() {
        
	   return null;
	}
	
	/*
	 * - a string URL to the Last.fm provided image (use the extralarge image url, which is 300x300 pixels).
	 */
	public void Image() {
	    
	}
	
	/*
	 * - an optional collection of genre names. Some Last.fm searches provide tag names in the search results with provide genre information.
	 */
	public String Genre() {
        
	    return null;
	}
	
	/*
	 * - Total the run time for each track in the album to get the album's total run time. Run time should be in the form: hh:mm:ss.
	 */
	public void Run_Time() {
	    
	}
	
	/*
	 * - an optional summary description of the album. Some Last.fm searches provide album summary information in the search results.
	 */
	public void Summary() {
	    
	}
 }
 