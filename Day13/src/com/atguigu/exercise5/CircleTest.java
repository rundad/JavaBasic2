package com.atguigu.exercise5;
/**
 * 
 * @Description 测试类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月18日上午10:33:40
 *
 */
public class CircleTest {
	public static void main(String[] args) {
		
		Circle circle1 = new Circle(2.3);
		Circle circle2 = new Circle(2.3, "white", 2.0);
		
		System.out.println("颜色是否相等：" + circle1.getColor().equals(circle2.getColor()));
		
		System.out.println("半径是否相等：" + circle1.equals(circle2));
		
		System.out.println(circle1);
		System.out.println(circle2);
	}
}
