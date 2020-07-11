package com.atguigu.exercise;

public class TriangleTest {
	
	public static void main(String[] args) {
		
		Triangle t1 = new Triangle();
		t1.setBase(2.0);
		t1.setHeight(2.4);
		System.out.println("base : " + t1.getBase() + ", height : " + t1.getHeight());
	
		Triangle t2 = new Triangle(5.1, 5.6);
		System.out.println("base : " + t2.getBase() + ", height : " + t2.getHeight());
	}
}
