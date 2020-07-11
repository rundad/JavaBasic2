package com.atguigu.exercise;
/**
 * 
 * @Description 练习
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月31日下午2:24:48
 *
 *	编写两个类， Triangle和TriangleTest， 其中Triangle类声明私有的底边长base和高height
 *	同时声明公共方法访问私有变量， 此外提供类必要的构造器， 另一个类中使用这些公共方法， 计算三角形的面积
 *
 */
public class Triangle {
	private double base;
	private double height;
	
	public Triangle() {
		
	}
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getBase() {
		return this.base;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
}
