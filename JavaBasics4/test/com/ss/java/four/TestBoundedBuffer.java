package com.ss.java.four;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBoundedBuffer {
	
	@Test
	public void testIsEmpty(){
		BoundedBuffer buf = new BoundedBuffer(3);
		assertTrue(buf.isEmpty());
		try {
			buf.push(Integer.valueOf(1));
			assertFalse(buf.isEmpty());
		} catch (Exception e) {
			System.out.println("Buffer is full");
		}
		
	}
	
	@Test
	public void testIsFull() {
		BoundedBuffer buf = new BoundedBuffer(2);
		assertFalse(buf.isFull());
		try {
			buf.push(Integer.valueOf(1));
			assertFalse(buf.isFull());
			buf.push(Integer.valueOf(2));
			assertTrue(buf.isFull());
		} catch (Exception e) {
			System.out.println("Buffer is full");
		}
	}
	
	@Test 
	public void testPush() {
		BoundedBuffer buf = new BoundedBuffer(1);
		boolean thrown = false;
		try {
			buf.push(Integer.valueOf(0));
			buf.push(Integer.valueOf(1)); //should try to overflow buffer, throwing exception
		} catch (Exception e) {
			thrown = true;
		}
		assertTrue(thrown);
	}

	@Test
	public void testPop() {
		BoundedBuffer buf = new BoundedBuffer(2);
		boolean thrown = false;
		try {
			buf.pop(); //this will try to remove an element from an empty buffer, throwing exception
		} catch (Exception e1) {
			thrown = true;
		}
		assertTrue(thrown);
		
		try {
			buf.push(Integer.valueOf(0));
			buf.push(Integer.valueOf(1));
			Integer i0 = buf.pop();
			assertEquals(i0.intValue(), 0);
			Integer i1 = buf.pop();
			assertEquals(i1.intValue(), 1);
		} catch (Exception e) {
			System.out.println("Buffer is full");
		}
	}	
}
