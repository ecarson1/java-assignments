/**
 * 
 */
package com.ss.java.three;

import java.io.File;
import java.util.ArrayList;

/**
 * @author ethan
 *  
 */
public class FileNames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> result = FileNames.listFiles("test");
		for(String s: result) {
			System.out.println(s);
		}
	}
	
	public static ArrayList<String> listFiles(String pathArg) {
		ArrayList<String> queue = new ArrayList<>(); // store folders you find to visit later
		ArrayList<String> fileList = new ArrayList<>(); // store files/directories you find
		queue.add(pathArg);
        
        do{
        	try {
        		StringBuilder path = new StringBuilder(queue.get(0));
        		File f = new File(path.toString());
        		
        		for(String s: f.list()) {
        			if(s.endsWith(".txt")) {
        				fileList.add(s);
        			}else {
        				fileList.add(s);
        				queue.add(path.toString() + '/' + s);
        			}
        		}
        		
        		queue.remove(0); // remove visited path from queue
        	}catch(Exception e) { // if path doesn't exist
        		System.out.println("Directory not found");
        		queue.remove(0);
        	}
        }while(queue.size() > 0);
        
        return fileList;
	}

}
