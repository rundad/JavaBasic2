package com.atguigu.exercise;
/**
 * 
 * @Description 练习
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月30日下午12:17:05
 *
 *	定义一个Circle类， 包含一个double型的radius属性代表圆的半径
 *	一个findArea()方法 返回圆的面积
 */
public class Circle {
	double radius;//半径
	
	public double findArea() {
		return Math.PI * radius * radius;
	}
}
