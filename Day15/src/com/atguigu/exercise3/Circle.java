package com.atguigu.exercise3;
/**
 * 
 * @Description 接口练习
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月20日上午8:53:04
 *
 *	定义一个Circle类， 声明radius属性， 提供getter和setter方法
 */
public class Circle {

	private Double radius;

	public Circle(Double radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	
}
