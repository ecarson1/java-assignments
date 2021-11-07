package com.ss.java.five;

import java.util.Arrays;

public class LambdaFunctions {
	
	public static void sortLengthAsc(String[] strings) {
		Arrays.sort(strings, (s1, s2) -> s1.length() - s2.length());
	}
	
	public static void sortLengthDesc(String[] strings) {
		Arrays.sort(strings, (s1, s2) -> s2.length() - s1.length());
	}
	
	public static void sortEFirst(String[] strings) {
		Arrays.sort(strings, (s1, s2) -> {
			if(s1.contains("e") && s2.contains("e")) {
				return s1.length() - s2.length();
			}else if (s1.contains("e")){
				return -1;
			}else if(s2.contains("e")){
				return 1;
			}else {
				return s1.length() - s2.length();
			}
		});
	}
	
	public static void sortFirstChar(String[] strings) {
		Arrays.sort(strings, (s1, s2) -> s1.toLowerCase().charAt(0) - s2.toLowerCase().charAt(0));
	}
	
	// same functions but with static helpers
	
	public static void sortLengthAsc2(String[] strings) {
		Arrays.sort(strings, (s1, s2) -> sortLengthAscHelper(s1, s2));
	}
	
	public static int sortLengthAscHelper(String s1, String s2){
		return s1.length() - s2.length();
	}
	
	public static void sortLengthDesc2(String[] strings) {
		Arrays.sort(strings, (s1, s2) -> sortLengthDescHelper(s1, s2));
	}
	
	public static int sortLengthDescHelper(String s1, String s2){
		return s2.length() - s1.length();
	}
	
	public static void sortEFirst2(String[] strings) {
		Arrays.sort(strings, (s1, s2) -> sortEFirstHelper(s1, s2));
	}
	
	public static int sortEFirstHelper(String s1, String s2){
		if(s1.contains("e") && s2.contains("e")) {
			return s1.length() - s2.length();
		}else if (s1.contains("e")){
			return -1;
		}else if(s2.contains("e")){
			return 1;
		}else {
			return s1.length() - s2.length();
		}
	}
	
	public static void sortFirstChar2(String[] strings) {
		Arrays.sort(strings, (s1, s2) -> sortFirstCharHelper(s1, s2));
	}
	
	public static int sortFirstCharHelper(String s1, String s2){
		return s1.toLowerCase().charAt(0) - s2.toLowerCase().charAt(0);
	}
}
