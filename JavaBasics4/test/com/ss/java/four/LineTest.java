package com.ss.java.four;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class LineTest {
	Line line1 = new Line(0, 0, 1, 1);
	Line line2 = new Line(0, 0, 0, 0);
	Line line3 = new Line(0, 0, 1, 2);
	Line line4 = new Line(0, 0, 1, 1.000001);
	Line line5 = new Line(0, 0, 3, 4);
	
	@Test
	public void testGetDistance() {
		assertEquals(line1.getDistance(), Math.sqrt(2), .0001); 
		assertEquals(line2.getDistance(), 0, .0001); 
		assertEquals(line3.getDistance(), Math.sqrt(5), .0001);
		assertEquals(line5.getDistance(), 5, .0001);
	}
	
	@Test
	public void testGetSlope() {
		assertEquals(line1.getSlope(), 1, .0001);
		
		// test Arithmetic exception is thrown for dividing by 0 
		boolean thrown = false;
		try {
			line2.getSlope();
		}catch(ArithmeticException e) {
			thrown = true;
		}
		assertTrue(thrown);
		
		assertEquals(line3.getSlope(), 2, .0001);
		assertEquals(line5.getSlope(), (4.0/3.0), .0001);
	}
	
	@Test
	public void testParallelTo() {
		assertTrue(line1.parallelTo(line1)); // a line should be parallel to itself
		assertFalse(line1.parallelTo(line3)); // since the slopes are 2 and 1 this should be false
		assertTrue(line1.parallelTo(line4)); // even though the slopes are slightly different, this should be close enough for parallelTo
	}

}
