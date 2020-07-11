package com.atguigu.exercise2;
/**
 * 
 * @Description abstract练习 + 模板方法设计模式
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月19日下午1:54:20
 *
 *	定义一个Employee类， 该类包含
 *	private成员变量: name, number, birthday, 其中birthday 为MyDate类的对象
 *	abstract方法earnings()
 *	toString()方法输出对象的name, number和birthday
 *
 */
public abstract class Employee {
	private String name;
	private int number;
	private MyDate birthday;
	
	public Employee(String name, int number, MyDate birthday) {
		super();
		this.name = name;
		this.number = number;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public MyDate getBirthday() {
		return birthday;
	}

	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}

	public abstract double earnings();
	
	@Override
	public String toString() {
		return "name=" + name + ", number=" + number + ", birthday=" + birthday.toDateString();
	}
	
	
	
}
