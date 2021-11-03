/**
 * 
 */
package com.ss.java.two;

/**
 * @author ethan
 *
 */
public class MaxNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Assignment 2 solution
		
		int arr[][] = {{2, 25, 7}, {1, 19, 12}, {16, 15, 14}};
		String output = MaxNumber.maxNumPosition(arr);
		System.out.println(output);
	}
	
	public static String maxNumPosition(int[][] arr) {
		if(arr.length == 0 || arr[0].length == 0) {
			return "Array is empty";
		}
		
		int max = arr[0][0];
		int col = 0; // position in outer array
		int row = 0; // position in inner array
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
					col = i;
					row = j;
				}
			}
		}
		
		return "Max number is " + max + " in the " + row + " index of subarray " + col;
	}

}
