package com.atguigu.java2;
/**
 * 
 * @Description super关键字
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月15日下午12:30:53
 *
 */
public class Person {

	String name;
	int age;
	int id = 1001; //身份证号
	
	public Person() {
		System.out.println("我无处不在!");
	}

	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, int age) {
		this(name);
		this.age = age;
	}
	
	public void eat() {
		System.out.println("吃饭");
	}
	
	public void walk() {
		System.out.println("走路");
	}
}
