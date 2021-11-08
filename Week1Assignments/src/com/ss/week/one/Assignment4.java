package com.ss.week.one;

import java.util.List;
import java.util.stream.Collectors;

public class Assignment4 {
	
	public static List<String> removeX(List<String> strings){
		List<String> noXStrings = strings.stream().map(s -> s.replace("x", "")).collect(Collectors.toList());
		return noXStrings;
	}

}
