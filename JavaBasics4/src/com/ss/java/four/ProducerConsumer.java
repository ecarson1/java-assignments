package com.ss.java.four;

public class ProducerConsumer {

	public static void main(String[] args) {
		final BoundedBuffer buf = new BoundedBuffer(3);

		Thread producer = new Thread() {
			public void run() {
				while (true) {
					synchronized (buf) {
						try {
							if(!buf.isFull()) {
								int i = (int) Math.ceil(Math.random() * 10);
								buf.push(Integer.valueOf(i));
								System.out.println("Produced int " + i);
							}
						}catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		};

		Thread consumer = new Thread() {
			public void run() {
				while (true) {
					synchronized (buf) {
						try {
							if(!buf.isEmpty()) {
								int i = buf.pop();
								System.out.println("Consumed int " + i);
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		};

		producer.start();
		consumer.start();

	}

}
