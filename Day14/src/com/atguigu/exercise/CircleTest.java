package com.atguigu.exercise;
/**
 * 
 * @Description static关键字的应用
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月18日下午6:09:58
 *
 */
public class CircleTest {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		
		Circle c2 = new Circle();
		Circle c3 = new Circle(3.4);
		System.out.println("c1的id: " + c1.getId());
		System.out.println("c2的id: " + c2.getId());
		System.out.println("c3的id: " + c3.getId());
		
		System.out.println("创建圆的个数为：" + Circle.getTotal());
	}
}

class Circle{
	private double radius;
	private int id;//自动赋值
	
	private static int total;//记录创建的圆的个数
	private static int init = 1001;//static声明的属性被所有对象所共享
	
	public Circle() {
		id = init++; //因为init是static修饰的， 所以可以做到每个对象id每次加1
		total++;//所有对象所共有的， 每创建一个对象， 就记录下来
	}
	
	public Circle(double radius) {
		this();
		this.radius = radius;
	}
	
	public double findArea() {
		return 3.14 * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public int getId() {
		return id;
	}

	public static int getTotal() {
		return total;
	}

	
}