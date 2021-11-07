package com.ss.java.five;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class TestIntegerString {
	
	List<Integer> arr = new ArrayList<Integer>();
	List<Integer> arr2 = new ArrayList<Integer>();
	
	@Test
	public void testIntegerString() {
		assertEquals(IntegerString.integerString(arr), "");
		arr.add(1);
		assertEquals(IntegerString.integerString(arr), "o1");
		arr.add(2);
		arr.add(44);
		arr.add(23);
		assertEquals(IntegerString.integerString(arr), "o1,e2,e44,o23");
		
		arr2.add(-1);
		assertEquals(IntegerString.integerString(arr2), "o-1");
		arr2.add(-3);
		arr2.add(4);
		arr2.add(-8);
		assertEquals(IntegerString.integerString(arr2), "o-1,o-3,e4,e-8");
	}
}
