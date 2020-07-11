package com.atguigu.java1;
/**
 * 
 * @Description 方法的重写 override
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月15日上午11:32:28
 *
 */
public class Student extends Person{
	
	String major;

	public Student(String major) {
		super();
		this.major = major;
	}

	public Student() {
		
	}
	
	public void study() {
		System.out.println("学习， 专业是：" + major);
	}
	
	//对父类中的eat()进行了重写
	public void eat() {
		System.out.println("学生应该多吃有营养的食物");
	}
}
