package com.ss.week.one;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.List;
import java.util.ArrayList;

public class TestAssignment2 {
	
	List<Integer> ints = new ArrayList<Integer>();
	
	@Test
	public void testLastDigits(){
		List<Integer> results = Assignment2.lastDigit(ints);
		assertTrue(results.size() == 0);
		
		ints.add(1); // 1
		ints.add(22); // 2
		ints.add(135); // 5
		ints.add(1317); // 7
		ints.add(20009); // 9
		
		results = Assignment2.lastDigit(ints);
		assertTrue(results.size() == 5);
		assertTrue(results.get(0) == 1);
		assertTrue(results.get(1) == 2);
		assertTrue(results.get(2) == 5);
		assertTrue(results.get(3) == 7);
		assertTrue(results.get(4) == 9);
		assertFalse(results.contains(3));
	}
}
