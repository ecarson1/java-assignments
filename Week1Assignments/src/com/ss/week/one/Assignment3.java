package com.ss.week.one;

import java.util.List;
import java.util.stream.Collectors;

public class Assignment3 {
	
	public static List<Integer> doubleInts(List<Integer> ints){
		List<Integer> doubledInts = ints.stream().map(i -> i * 2).collect(Collectors.toList());
		return doubledInts;
	}
}
