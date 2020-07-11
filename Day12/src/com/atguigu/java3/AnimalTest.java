package com.atguigu.java3;

import java.sql.Connection;

/**
 * 
 * @Description 多态性的使用举例一：
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月16日下午2:36:40
 *
 */
public class AnimalTest {
	
	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.func(new Dog());

		test.func(new Cat());
	}
	
	//有多态性
	public void func(Animal animal) {//Animal animal = new Dog()
		animal.eat();
		animal.shout();
	}
	
	public void func(Dog dog) {//没有多态性, 需要造多个重载的方法
		dog.eat();
		dog.shout();
	}
	
	public void func(Cat cat) {
		cat.eat();
		cat.shout();
	}
}

class Animal{
	
	public void eat() {
		System.out.println("动物 进食");
	}
	
	public void shout() {
		System.out.println("动物：叫");
	}
}

class Dog extends Animal{
	
	public void eat() {
		System.out.println("狗吃骨头");
	}
	
	public void shout() {
		System.out.println("汪汪汪!");
	}
}

class Cat extends Animal{
	
	public void eat() {
		System.out.println("猫吃鱼");
	}
	
	public void shout() {
		System.out.println("喵喵喵!");
	}
}

//举例二：

class Order{
	
	public void method(Object obj) {
		
	}
}

//举例三：链接数据库做操作， 比如链接MySQL, Oracel, DB2等数据库
class Driver{
	
	public void doData(Connection conn) {//conn = new MySQLConnection() / conn = new OracleConnection()
		//规范的步骤去操作数据
		
	}
}