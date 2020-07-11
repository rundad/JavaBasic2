package com.atguigu.exercise2;
/**
 * 
 * @Description 练习
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月15日上午10:22:43
 *
 */
public class Circle {
	private double radius;//半径
	
	public Circle() {
		radius = 1.0;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//返回圆的面积
	public double findArea() {
		return Math.PI * radius * radius;
	}
}
