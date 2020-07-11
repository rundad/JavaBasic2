package com.atguigu.java;
/**
 * 
 * @Description 继承性
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月14日上午11:19:11
 *
 *	然后在定义这个Student类的时候， 发现也需要声明和Person类一样的那些属性
 *	但是比起Person类 来， Student类 多出一个major属性 和一个 study方法
 *
 *	如果我们想要免掉那些已经定义过的结构 并且 把那些结构拿一份过来用， 我们就需要继承那个结构
 *	
 *
 */
public class Student extends Person{

//	private String name;
//	private int age;
	String major;
	
	public Student() {
		
	}
	
	public Student(String name, int age, String major) {
		this.name = name;
		setAge(age);
		this.major = major;
	}
	
//	public void eat() {
//		System.out.println("吃饭");
//	}
//	
//	public void sleep() {
//		System.out.println("睡觉");
//	}
	
	public void study() {
		System.out.println("学习");
	}
	
	public void show() {
		System.out.println("name:" + name + ", age:" + getAge());
	}
}
