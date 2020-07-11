package com.atguigu.exercise1;
/**
 * 
 * @Description abstract练习
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月19日下午1:13:21
 *
 *	编写一个Empolyee类， 声明为抽象类
 *	包含如下三个属性：name, id, salary
 *	提供必要的构造器和抽象方法 work()
 */
public abstract class Employee {
	private String name;
	private int id;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public abstract void work();
}
