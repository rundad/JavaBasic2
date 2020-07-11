package com.atguigu.exercise5;
/**
 * 
 * @Description 重写toString() + equals() 练习
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月18日上午10:27:45
 *
 */
/**
 * @Description 
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月18日上午10:32:57
 * 
 */
public class Circle extends GeometricObject{
	private double radius;
	
	public Circle() {
		super();
		radius = 1.0;
//		color = "white";
//		weight = 1.0;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius, String color, double weight) {
		super(color, weight);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//求圆的面积
	public double findArea() {
		return 3.14 * radius * radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof Circle) {
			Circle other = (Circle)obj;
			
			return this.radius == other.radius;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
