/**
 * 
 */
package com.ss.java.one;

/**
 * @author ethan
 *
 */
public class Patterns {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solutions to assignment 1
		
		// Part 1
		System.out.println("1)");
		String output = "";
		for(int i = 1; i <= 4; i++){
			int j = 1;
			while(j <= i) {
				output += "*";
				j++;
			}
			output += "\n";
		}
		output += ".........";
		System.out.println(output);
		
		// Part 2
		System.out.println("2)");
		output = "..........\n";
		for(int i = 4; i >= 1; i--) {
			int j = 1;
			while(j <= i) {
				output += "*";
				j++;
			}
			output += "\n";
		}
		System.out.print(output);
		
		// Part 3
		System.out.println("3)");
		output = "";
		for(int i = 1; i <= 4; i++) {
			int spaces = 6 - i;
			int j = (2 * i) - 1;
			while(spaces > 0) {
				output += " ";
				spaces--;
			}
			while(j > 0) {
				output += "*";
				j--;
			}
			output += "\n";
		}
		output += "...........";
		System.out.println(output);
		
		// Part 4
		System.out.println("4)");
		output = "............\n";
		for(int i = 4; i >= 1; i--) {
			int spaces = 6 - i;
			int j = (2 * i) - 1; 
			while(spaces > 0) {
				output += " ";
				spaces--;
			}
			while(j > 0) {
				output += "*";
				j--;
			}
			output += "\n";
		}
		System.out.print(output);
	}

}
