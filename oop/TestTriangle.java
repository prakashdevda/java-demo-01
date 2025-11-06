package com.practice.oop;

public class TestTriangle {
	public static void main(String[] args) {
		Triangle a1 = new Triangle();
		
		a1.setColor("Red Color");
		a1.setBorderwidth(5);
		a1.setBase(10);
		a1.setHight(20);
		
		System.out.println("a1 Triange Color: "+ a1.getColor());
		System.out.println("a1 Triangle Borderwidth: "+a1.getBorderwidth());
		System.out.println("a1 Triangle Base: "+a1.getBase());
		System.out.println("a1 Triangle Hight: "+a1.getHight());
		System.out.println("a1 Triangle Area: "+a1.area());
	}

}
