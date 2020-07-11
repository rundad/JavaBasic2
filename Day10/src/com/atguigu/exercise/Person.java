package com.atguigu.exercise;
/**
 * 
 * @Description 练习
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月31日下午1:52:56
 *
 *	1. 创建程序， 在其中定义两个类， Person和PersonTest类， 定义如下
 *	用setAge()设置人的合法年龄(0~130) 用getAge()返回人的年龄
 *
 *	在PersonTest类中实例化Person类的对象b， 调用setAge()和getAge()方法， 体会java的封装性
 *	
 *	练习2：
 *	在前面定义的Person类中添加构造器， 利用构造器设置所有人的age属性初始值都为18
 *	修改上题中类的构造器， 增加name属性， 使得每次创建Person对象的同时初始化对象的age属性值和name属性值
 */
public class Person {
	private int age;
	private String name;
	
	public Person() {
		this.age = 18;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if(age < 0 || age > 130) {
			//throw new RuntimeException("传入的数据非法");
			System.out.println("传入的数据非法");
			return;
		}
		this.age = age;
	}

	
}
