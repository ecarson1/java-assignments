package com.ss.java.five;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestLambdaFunctions {
	
	@Test
	public void testSortLengthAsc() {
		String[] strings = {"hello", "test", "string", "string ", "a", "long string"};
		
		LambdaFunctions.sortLengthAsc(strings);
		
		assertEquals(strings[0], "a");
		assertEquals(strings[1], "test");
		assertEquals(strings[2], "hello");
		assertEquals(strings[3], "string");
		assertEquals(strings[4], "string ");
		assertEquals(strings[5], "long string");
	}
	
	@Test
	public void testSortLengthAsc2() {
		String[] strings = {"hello", "test", "string", "string ", "a", "long string"};
		
		LambdaFunctions.sortLengthAsc2(strings); 
		
		assertEquals(strings[0], "a");
		assertEquals(strings[1], "test");
		assertEquals(strings[2], "hello");
		assertEquals(strings[3], "string");
		assertEquals(strings[4], "string ");
		assertEquals(strings[5], "long string");
	}
	
	@Test
	public void testSortLengthDesc() {
		String[] strings = {"hello", "test", "string", "string ", "a", "long string"};
		
		LambdaFunctions.sortLengthDesc(strings);
		
		assertEquals(strings[5], "a");
		assertEquals(strings[4], "test");
		assertEquals(strings[3], "hello");
		assertEquals(strings[2], "string");
		assertEquals(strings[1], "string ");
		assertEquals(strings[0], "long string");
	}
	
	@Test
	public void testSortLengthDesc2() {
		String[] strings = {"hello", "test", "string", "string ", "a", "long string"};
		
		LambdaFunctions.sortLengthDesc2(strings);
		
		assertEquals(strings[5], "a");
		assertEquals(strings[4], "test");
		assertEquals(strings[3], "hello");
		assertEquals(strings[2], "string");
		assertEquals(strings[1], "string ");
		assertEquals(strings[0], "long string");
	}
	
	@Test
	public void testSortEFirst() {
		String[] strings = {"hello", "test", "string", "a", "e", "word"};
		
		LambdaFunctions.sortEFirst(strings);
		
		assertEquals(strings[0], "e");
		assertEquals(strings[1], "test");
		assertEquals(strings[2], "hello");
		assertEquals(strings[3], "a");
		assertEquals(strings[4], "word");
		assertEquals(strings[5], "string");
	}
	
	@Test
	public void testSortEFirst2() {
		String[] strings = {"hello", "test", "string", "a", "e", "word"};
		
		LambdaFunctions.sortEFirst2(strings);
		
		assertEquals(strings[0], "e");
		assertEquals(strings[1], "test");
		assertEquals(strings[2], "hello");
		assertEquals(strings[3], "a");
		assertEquals(strings[4], "word");
		assertEquals(strings[5], "string");
	}
	
	@Test
	public void testSortFirstChar() {
		String[] strings = {"always", "Better", "choice", "test", "Example"};
		
		LambdaFunctions.sortFirstChar(strings);
		
		assertEquals(strings[0], "always");
		assertEquals(strings[1], "Better");
		assertEquals(strings[2], "choice");
		assertEquals(strings[3], "Example");
		assertEquals(strings[4], "test");
	}
	
	@Test
	public void testSortFirstChar2() {
		String[] strings = {"always", "Better", "choice", "test", "Example"};
		
		LambdaFunctions.sortFirstChar2(strings);
		
		assertEquals(strings[0], "always");
		assertEquals(strings[1], "Better");
		assertEquals(strings[2], "choice");
		assertEquals(strings[3], "Example");
		assertEquals(strings[4], "test");
	}
}
