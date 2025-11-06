package com.practice.oop;

public class TestRectangle {
	public static void main(String[] args) {
		Rectangle a1 = new Rectangle();
		
		a1.setColor("Yellow Color");
		a1.setBorderwidth(6);
		a1.setLength(12);
		a1.setWidth(14);
		
		 
		System.out.println("a1 Rectangle Color: "+a1.getColor());
		System.out.println("a1 Rectangle Border: "+a1.getBorderwidth());
		System.out.println("a1 Rectangle Length: "+a1.getLength());
		System.out.println("a1 Rectangle Width: "+a1.getWidth());
		System.out.println("a1 Rectangle Area: "+a1.area());
		
	}

}
