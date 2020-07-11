package com.atguigu.exercise;
/**
 * 
 * @Description 测试类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月15日上午10:17:42
 *
 *	定义类KidsTest, 在类的main方法中实例化Kids的对象someKid, 用该对象访问其父类的成员变量
 */
public class KidsTest {
	public static void main(String[] args) {
		
		Kids someKid = new Kids(12);
		
		someKid.printAge();
		
		someKid.setSalary(0);
		someKid.setSex(1);
		
		someKid.employeed();
		someKid.manOrWoman();
	}
}
