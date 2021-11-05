package com.ss.java.four;

public class Singleton {
	/* volatile keyword ensures that all threads are reading from and writing to
	 * main memory instead of CPU caches to ensure consistency */
	private volatile static Singleton instance = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}	
		}
		
		return instance;
	}
	
}
