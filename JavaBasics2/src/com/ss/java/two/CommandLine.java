/**
 * 
 */
package com.ss.java.two;

/**
 * @author ethan
 *
 */
public class CommandLine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Assignment 1 solution
		
		int total = 0;
		
		for(String s: args) {
			try {
				int argInt = Integer.parseInt(s);
				total += argInt;
			}catch(Exception e){
				System.out.println("Expected only integer arguments, but recieved argument: " + s);
			}
		}
		
		System.out.println("Sum of integer arguments was " + total);
	}

}
