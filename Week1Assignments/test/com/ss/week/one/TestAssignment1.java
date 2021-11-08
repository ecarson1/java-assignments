package com.ss.week.one;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestAssignment1 {
	
	@Test
	public void testIsOdd(){
		Evaluator evaluator = new Evaluator();
		PerformOperation oddOp = evaluator.isOdd();
		
		assertTrue(oddOp.eval(1));
		assertFalse(oddOp.eval(2));
	}
	
	@Test
	public void testIsPalindrome() {
		Evaluator evaluator = new Evaluator();
		PerformOperation palindromeOp = evaluator.isPalindrome();
		
		assertTrue(palindromeOp.eval(1));
		assertTrue(palindromeOp.eval(131));
		assertTrue(palindromeOp.eval(22));
		assertFalse(palindromeOp.eval(13));
		assertFalse(palindromeOp.eval(13312));
	}
	
	@Test
	public void testIsPrime() {
		Evaluator evaluator = new Evaluator();
		PerformOperation primeOp = evaluator.isPrime();
		
		assertTrue(primeOp.eval(0));
		assertTrue(primeOp.eval(1));
		assertTrue(primeOp.eval(2));
		assertFalse(primeOp.eval(4));
		assertTrue(primeOp.eval(7));
		assertFalse(primeOp.eval(9));
		assertTrue(primeOp.eval(11));
	}
	
}
