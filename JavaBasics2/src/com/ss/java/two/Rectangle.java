/**
 * 
 */
package com.ss.java.two;

/**
 * @author ethan
 *
 */
public class Rectangle implements Shape{
	private double base, height;
	
	public Rectangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return this.base * this.height;
	}

	@Override
	public void display() {
		System.out.println("Shape: Rectangle\nBase: " + this.base + "\nHeight: " + this.height);
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5, 4);
		System.out.println("Area is " + rect.calculateArea());
		rect.display();
	}
}
