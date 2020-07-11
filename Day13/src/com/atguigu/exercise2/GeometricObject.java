package com.atguigu.exercise2;
/**
 * 
 * @Description 练习
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月17日下午6:08:07
 *
 */
public class GeometricObject {//集合图形
	protected String color;
	protected double weight;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public GeometricObject(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	
	public double findArea() {
		return 0.0;
	}
}
