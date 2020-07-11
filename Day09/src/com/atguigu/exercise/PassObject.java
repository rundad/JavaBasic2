package com.atguigu.exercise;
/**
 * 
 * @Description 
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月30日下午12:19:15
 *
 *	定义一个类PassObject, 在类中定义一个方法printAreas(
 *	该方法的定义如下， public void printAreas(Circle c, int time)
 *	在printAreas方法中打印输出 1到time 之间每个整数半径值， 以及对应的面积
 *	例如： time为5， 则输出半径1, 2, 3, 4, 5 以及对应的面积
 *
 */
public class PassObject {
	
	public static void main(String[] args) {
		PassObject test = new PassObject();
		
		Circle c = new Circle();
		test.printAreas(c, 5);
		
		System.out.println("now radius is " + c.radius);
	}
	
	public void printAreas(Circle c, int time) {
		
		System.out.println("Radius\t\tArea");
		
		for(int i = 1; i <= time; i++) {
			//设计圆的半径
			c.radius = i;
			System.out.println(c.radius + "\t\t" + c.findArea());
		}
		
		c.radius = time + 1;
	}
}
