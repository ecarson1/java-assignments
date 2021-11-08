package com.ss.week.one;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;
import java.util.ArrayList;

public class TestAssignment4 {
	
	List<String> strings = new ArrayList<String>();
	
	@Test
	public void testRemoveX(){
		List<String> results = Assignment4.removeX(strings);
		assertEquals(results.size(), 0);
		
		strings.add(""); // ""
		strings.add("x"); // ""
		strings.add("ax"); // "a"
		strings.add("bb"); // "bb"
		strings.add("xcx"); // "c"
		strings.add(" x x x"); // "   "
		strings.add("xaxbxc"); // "abc"
		
		results = Assignment4.removeX(strings);
		assertEquals(results.size(), 7);
		assertEquals(results.get(0), "");
		assertEquals(results.get(1), "");
		assertEquals(results.get(2), "a");
		assertEquals(results.get(3), "bb");
		assertEquals(results.get(4), "c");
		assertNotEquals(results.get(5), "");
		assertEquals(results.get(5), "   ");
		assertEquals(results.get(6), "abc");
	}
}
