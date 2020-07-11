package com.atguigu.java2;
/**
 * 
 * @Description super关键字
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月15日下午12:31:01
 *
 */
public class Student extends Person{

	String major;
	int id = 1002; //学号
	
	public Student() {
		
	}
	
	public Student(String major) {
		this.major = major;
	}
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	@Override
	public void eat() {
		System.out.println("学生， 应该多吃有营养的食物");
	}
	
	public void study() {
		System.out.println("学生， 学习知识");
		this.eat();
		super.eat();
	}
	
	public void show() {
		System.out.println("name = " + this.name + ", age =" + super.age);
		System.out.println("id = " + id);
		System.out.println("id = " + super.id);
	}
}
