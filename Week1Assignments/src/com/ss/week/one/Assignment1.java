package com.ss.week.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment1 {

	public static void main(String[] args) throws IOException {
		Evaluator evaluator = new Evaluator();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numLines = -1;
		try {
			numLines = Integer.parseInt(br.readLine());
		}catch(Exception e){
			System.out.println("Correct usage: int");
		} 
		PerformOperation op;
		String result = "";
		
		while (numLines > 0) {
			String s = br.readLine();
			String[] input = s.split(" ");
			try {
				int func = Integer.parseInt(input[0]);
				int val = Integer.parseInt(input[1]);
				if (func == 1) {
					op = evaluator.isOdd();
					result = (op.eval(val)) ? "ODD" : "EVEN";
				} else if (func == 2) {
					op = evaluator.isPrime();
					result = (op.eval(val)) ? "PRIME" : "COMPOSITE";
				} else if (func == 3) {
					op = evaluator.isPalindrome();
					result = (op.eval(val)) ? "PALINDROME" : "NOT PALINDROME";
				}
			}catch(Exception e) {
				System.out.print("Correct usage: int1 int2");
			}
			
			System.out.println(result);
			numLines--;
		}
	}
	
	
}
