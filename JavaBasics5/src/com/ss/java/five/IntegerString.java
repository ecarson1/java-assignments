package com.ss.java.five;

import java.util.List;

public class IntegerString {

	public static String integerString(List<Integer> arr) {
		StringBuilder output = new StringBuilder("");
		arr.forEach(i -> {
			boolean even = i % 2 == 0;
			output.append(even ? "e" + i + "," : "o" + i + ",");
		});

		if (output.length() > 0) {
			output.delete(output.length() - 1, output.length()); // remove extra comma
		}

		return output.toString();
	}

}
