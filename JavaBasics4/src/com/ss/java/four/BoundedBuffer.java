package com.ss.java.four;

import java.util.ArrayList;

public class BoundedBuffer {
	private ArrayList<Integer> arr;
	private int bound;
	
	public BoundedBuffer(int bound) {
		this.bound = bound;
		this.arr = new ArrayList<Integer>();
	}
	
	public Integer pop() throws Exception {
		Integer i;
		if(this.isEmpty()) {
			throw new Exception("Buffer is empty");
		}
		i = arr.get(0);
		arr.remove(0);
		return i;
	}
	
	public void push(Integer i) throws Exception {
		if(this.isFull()) {
			throw new Exception("Buffer is full");
		}
		arr.add(i);
	}
	
	public boolean isEmpty() {
		return arr.size() == 0;
	}
	
	public boolean isFull() {
		return arr.size() >= bound;
	}
	
}
