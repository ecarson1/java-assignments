package com.ss.java.four;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestSingleton {
	
	@Test
	public void testGetInstance(){
		
		Singleton s1 = Singleton.getInstance();
		assertTrue(s1 != null);
		
		Singleton s2 = Singleton.getInstance();
		assertEquals(s1, s2); // since they point to the same single object, should be true
		
	}
}
