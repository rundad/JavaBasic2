package com.atguigu.exercise1;
/**
 * 
 * @Description 多态性练习
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月17日下午5:57:50
 *
 *	建立InstanceTest类， 在类中定义方法method(Person e);
 *		在method中：
 *		1. 根据e的类型调用相应的getInfo方法
 *		2. 根据e的类型执行
 *		如果e为Person类的对象， 输出：
 *		"a Person"
 *		如果e为Student类的对象， 输出:
 *		"a Student"
 *		"a Person"
 *		如果e为Graduate类的对象 输出：
 *		"a graduated student"
 *		"a student"
 *		"a person"
 */
public class InstanceTest {
	
	public void method(Person e) {
		e.getInfo();
		if(e instanceof Graduate) {
			System.out.println("a graduated student");
			System.out.println("a student");
			System.out.println("a person");
		}else if(e instanceof Student) {
			System.out.println("a student");
			System.out.println("a person");
		}else{
			System.out.println("a person");
		}
	}
}

class Person{
	protected String name = "person";
	protected int age = 50;
	
	public String getInfo() {
		return "Name: " + name + "\n" + "age: " + age;
	}
}

class Student extends Person{
	protected String school = "pku";
	
	public String getInfo() {
		return "Name: " + name + "\nage: " + age + "\nschool: " + school;
	}
}

class Graduate extends Student{
	public String major = "IT";
	
	public String getInfo() {
		return "Name: " + name + "\nage: " + age + "\nschool: " + school + "\nmajor: " + major;
	}
}
