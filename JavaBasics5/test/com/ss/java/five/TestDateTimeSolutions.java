package com.ss.java.five;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;


import java.time.LocalDate;

public class TestDateTimeSolutions {
	LocalDate date = LocalDate.of(2020, 3, 13);
	LocalDate date2 = LocalDate.of(2021, 11, 7);
	
	@Test
	public void testIsFriday13() {
		assertTrue(DateTimeSolutions.isFriday13(date));
		assertFalse(DateTimeSolutions.isFriday13(date2));
		assertFalse(DateTimeSolutions.isFriday13(null));
	}
	
}
