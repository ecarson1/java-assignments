package com.ss.week.one;

import java.util.List;
import java.util.stream.Collectors;

public class Assignment2 {
	
	public static List<Integer> lastDigit(List<Integer> ints) {
		List<Integer> lastDigits = ints.stream().map(i -> i % 10).collect(Collectors.toList());
		return lastDigits;
	}

}
