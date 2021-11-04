/**
 * 
 */
package com.ss.java.three;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author ethan
 *
 */
public class AppendText {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppendText.append("This is another sentence ", "test/example1.txt");
	}
	
	public static void append(String text, String path) {
		try {
		    Files.write(Paths.get(path), text.getBytes(), StandardOpenOption.APPEND);
		}catch (Exception e) {
		   System.out.println("File not found");
		}
	}

}
