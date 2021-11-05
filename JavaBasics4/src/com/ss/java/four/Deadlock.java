package com.ss.java.four;

public class Deadlock {

	public static void main(String[] args) {

		Object fork = new Object();
		Object knife = new Object();

		Thread person1 = new Thread() {
			public void run() {
				synchronized (fork) {
					System.out.println("Person 1 is holding the fork");

					try {
						Thread.sleep(10); // ensure t2 has locked knife before t1 tries to grab it
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Person 1 needs knife to eat");

					synchronized (knife) {
						/* this line should never print since person1 needs knife before fork gets unlocked
						 * while person2 needs fork before knife gets unlocked*/
						System.out.println("Person 1 has fork and knife and can now eat");
					}
				}
			}
		};

		Thread person2 = new Thread() {
			public void run() {
				synchronized (knife) {
					System.out.println("Person 2 is holding the knife");

					try {
						Thread.sleep(10); // ensure t1 has locked fork before t2 tries to grab it
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					System.out.println("Person 2 needs fork to eat");

					synchronized (fork) {
						System.out.println("Person 2 has fork and knife and can now eat");
					}

				}
			}
		};
		
		person1.start();
		person2.start();

	}

}
