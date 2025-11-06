package com.practice.oop;

public class TestCircle {
	public static void main(String[] args) {
		Circle a1 = new Circle();
		
		
		a1.setColor("BLue Color");
		a1.setBorderwidth(4);
		a1.setRadius(8);
		
		System.out.println("a1 Circle Color: "+a1.getColor());
		System.out.println("a1 Circle Border: "+a1.getBorderwidth());
		System.out.println("a1 Circle Radius: "+a1.getRadius());
		System.out.println("a1 Circle Area: " +a1.area());
	}

}
