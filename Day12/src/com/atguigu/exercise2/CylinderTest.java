package com.atguigu.exercise2;
/**
 * 
 * @Description 测试类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月15日上午10:28:20
 *
 */

public class CylinderTest {
	
	public static void main(String[] args) {
		
		Cylinder cy = new Cylinder();
		cy.setRadius(2.1);
		cy.setLength(3.4);
		
		double volume = cy.findVolume();
		System.out.println("圆柱的体积为：" + volume);
		
		//没有重写findArea()时
//		double area = cy.findArea();
//		System.out.println("底面圆的面积为：" + area);
		//重写findArea()以后
		double area = cy.findArea();
		System.out.println("底面圆的面积为：" + area);
	}
}
