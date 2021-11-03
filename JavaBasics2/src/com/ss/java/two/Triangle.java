/**
 * 
 */
package com.ss.java.two;

/**
 * @author ethan
 *
 */
public class Triangle implements Shape{
	private double base, height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return this.base * this.height / 2;
	}

	@Override
	public void display() {
		System.out.println("Shape: Triangle\nBase: " + this.base + "\nHeight: " + this.height);
	}
	
	public static void main(String[] args) {
		Triangle tri = new Triangle(5, 4);
		System.out.println("Area is " + tri.calculateArea());
		tri.display();
	}
}
