package com.ss.java.five;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;

public class TestStringFilter {
	
	List<String> arr = new ArrayList<String>();
	
	@Test
	public void testStringFilter(){
		
		List<String> result = StringFilter.filterA3(arr);
		assertTrue(result.size() == 0);
		
		arr.add(""); // F: doesn't start with a
		arr.add("a"); // F: < 3 letters
		arr.add("a12"); // F: < 3 letters
		arr.add("aaa"); // P
		arr.add("cba"); // F: doesn't start with a
		arr.add("abc123"); //P
		arr.add("abcd123"); //F: > 3 letters
		arr.add("a . ' ; b ..? c 57"); // P
		
		result = StringFilter.filterA3(arr);
		assertTrue(result.size() == 3);
		assertTrue(result.contains("aaa"));
		assertTrue(result.contains("abc123"));
		assertTrue(result.contains("a . ' ; b ..? c 57"));
		assertFalse(result.contains("cba"));
		
	}
}
