package com.atguigu.exercise;
/**
 * 
 * @Description 利用面向对象的编程方法， 设计类Circle计算圆的面积
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月26日上午11:21:48
 *
 */
//测试类
public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		
		c1.radius = 2.1;
		
		double area = c1.findArea();
		System.out.println(area);
	}
}

class Circle{
	
	//属性
	double radius;
	
	//方式一 求圆的面积的方法
	public double findArea() {
		double area = Math.PI * radius * radius;
		return area;
	}
	
	//方式二
	public void findArea2() {
		double area = Math.PI * radius * radius;
		System.out.println("面积为：" + area);
	}
}
