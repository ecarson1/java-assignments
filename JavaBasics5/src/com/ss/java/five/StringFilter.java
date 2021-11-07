package com.ss.java.five;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {
	
	public static List<String> filterA3(List<String> arr){
		List<String> strings = arr.stream().filter(s -> (s.startsWith("a") && checkLetters(s))).collect(Collectors.toList());
		
		return strings;
	}
	
	// checks that string has exactly three letters
	private static boolean checkLetters(String s) {
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			int intValue = s.charAt(i);
			
			// check to see if char is a letter
			if((intValue >= 65 && intValue <= 90) || (intValue >= 97 && intValue <= 122)) {
				if(count >= 3) {
					return false;
				}
				count++;
			}
		}
		return count == 3;
	}

}
