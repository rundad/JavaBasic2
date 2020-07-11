package com.atguigu.exercise5;
/**
 * 
 * @Description toString() + equals()练习
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月18日上午10:26:20
 *
 */
public class GeometricObject {
	protected String color;
	protected double weight;
	public GeometricObject() {
		super();
		this.color = "white";
		this.weight = 1.0;
	}
	
	public GeometricObject(String color, double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
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
	
	
}
