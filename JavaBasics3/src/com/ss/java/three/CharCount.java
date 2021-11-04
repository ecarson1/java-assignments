/**
 * 
 */
package com.ss.java.three;

import java.io.FileInputStream;

/**
 * @author ethan
 *
 */
public class CharCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "test/example1.txt"; // feel free to change to test whatever
		
		if(args.length != 1) {
			System.out.println("Expected only one arg but recieved: " + args.length);
		}else if(args[0].length() != 1) {
			System.out.println("Arg was expected to be only one character");
		}else {
			char c = args[0].charAt(0);
			int result = charCount(c, path);
			if(result != -1) {
				System.out.println("Character " + c + " appeared in file " + path + " " + result + " time(s)");
			}
		}
	}
	
	public static int charCount(char c, String path) {
		int count = 0;
		try {
			FileInputStream is = new FileInputStream(path);
			int data = is.read();
			while (data != -1) {
			   if(c == (char) data) {
				   count++;
			   }
			   data = is.read();
			}
			is.close();
		}catch(Exception e) {
			System.out.println("File not found");
			return -1;
		}
		return count;
	}

}
