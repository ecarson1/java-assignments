/**
 * 
 */
package com.ss.java.one;

import static java.lang.Math.*;
import java.util.Scanner;
/**
 * @author ethan
 *
 */
public class NumberGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Solution to assignment 2
		
		int guess = -10;
		int attempts = 0;
		int number = (int) ceil(random() * 100); // rounds up randomly generated number to range 1-100
		Scanner scanner = new Scanner(System.in);
		
		while((guess >= (number + 10) || guess <= (number - 10)) && attempts < 5) {
			System.out.print("Enter your guess: ");
			guess = scanner.nextInt();
			attempts++;
		}
		
		if(attempts == 5) {
			System.out.println("Sorry, the number was " + number);
		}else {
			System.out.println("Good job. The number was " + number);
		}
		scanner.close();
	}

}
