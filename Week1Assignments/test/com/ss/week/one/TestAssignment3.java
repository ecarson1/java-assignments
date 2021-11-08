package com.ss.week.one;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.util.List;
import java.util.ArrayList;

public class TestAssignment3 {
	
	List<Integer> ints = new ArrayList<Integer>();
	
	@Test
	public void testDoubleInts(){
		List<Integer> results = Assignment3.doubleInts(ints);
		assertTrue(results.size() == 0);
		
		ints.add(0); // 0
		ints.add(1); // 2
		ints.add(-1); // -2
		ints.add(2); // 4
		ints.add(2000); // 4000
		
		results = Assignment3.doubleInts(ints);
		assertTrue(results.size() == 5);
		assertTrue(results.get(0) == 0);
		assertTrue(results.get(1) == 2);
		assertFalse(results.get(2) == 2);
		assertTrue(results.get(2) == -2);
		assertTrue(results.get(3) == 4);
		assertTrue(results.get(4) == 4000);
	}
}
