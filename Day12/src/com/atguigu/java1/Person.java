package com.atguigu.java1;
/**
 * 
 * @Description 方法的重写 例子
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月15日上午11:32:11
 *
 */
public class Person {

	String name;
	int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("吃饭");
	}
	
	public void walk(int distance) {
		System.out.println("走路, 走的距离是：" + distance + "公里");
	}
}
