package com.atguigu.java;
/**
 * 
 * @Description 继承性的由来
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月14日上午11:16:56
 *
 *	首先我们有个Person类， 然后我们还需要定义另外一个类 叫Student类
 *	
 */
public class Person extends Creature{
	String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void eat() {
		System.out.println("吃饭");
	}
	
	public void sleep() {
		System.out.println("睡觉");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
