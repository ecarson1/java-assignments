/**
 * 
 */
package com.ss.java.two;

/**
 * @author ethan
 *
 */
public class Circle implements Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return 3.14 * this.radius * this.radius;
	}

	@Override
	public void display() {
		System.out.println("Shape: Circle\nRadius: " + this.radius);
	}
	
	public static void main(String[] args) {
		Circle circ = new Circle(5);
		System.out.println("Area is " + circ.calculateArea());
		circ.display();
	}
}
