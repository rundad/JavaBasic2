package com.atguigu.java2;
/**
 * 
 * @Description this关键字
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月11日上午11:50:10
 * 
 * 	this关键字的使用：
 * 	① 可以用来修饰 调用 属性， 方法， 构造器
 * 
 * 	② this修饰属性和方法：
 * 		this理解为：当前对象 或 当前正在创建的对象
 * 		
 * 	③ 在类的方法中， 我们可以使用"this.属性"或"this.方法"的方式， 调用当前对象属性或方法
 * 		通常情况下， 我们都选择省略"this", 特殊情况下， 如果方法的形参和类的属性同名时， 我们必须显示
 * 		的使用"this.变量"的方法， 表名此变量是属性， 而非形参
 * 
 * 	④ 在类的方法中， 我们可以使用"this.属性"或"this.方法"的方式， 调用当前正在创建的对象属性或方法
 * 		通常情况下， 我们都选择省略"this", 特殊情况下， 如果方法的形参和类的属性同名时， 我们必须显示
 * 		的使用"this.变量"的方法， 表名此变量是属性， 而非形参
 * 
 * 	⑤ this调用构造器
 * 		1. 我们在类的构造器中， 可以显示的使用"this(形参列表)"方式， 调用本类指定的其他构造器
 * 		2. 构造器中不能通过"this(形参列表)" 方式调用自己： 一个构造器不能调用它自己
 * 		3. 尽管构造器在创建对象中， 调用了其他的构造器， 但是对象还是一个
 * 		4. 如果类中有n个构造器， 则最多n - 1构造器中使用了"this(形参列表)"
 * 		5. 规定："this(形参列表)" 必须声明在当前构造器的首行
 * 		6. 构造器内部， 最多只能声明一个"this(形参列表)", 用来调用其他的构造器
 *
 */
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.setAge(1);
		System.out.println(p1.getAge());
		
		p1.eat();
	}
}

class Person{
	
	//属性
	private String name;
	private int age;
	
	//构造器
	public Person() {
		//如果在Person初始化时， 需要考虑如下1， 2， 3 ，4(共40行代码)
		//如何其他的构造器也需要考虑这些问题， 那么如何可以使这些构造器更简洁，更方便
		//思路一， 把考虑的问题放在一个方法里， 如何每个构造器调那个方法即可
		//思路二， 在一个构造器中， 完成需要考虑的问题， 如何其他构造器调 该构造器即可
	}
	
	public Person(String name) {
		this(); //思路二实现：调空参 构造器， 调哪个构造器 取决于 你的参数
		this.name = name;
	}
	
	public Person(int age) {
		this();
		this.age = age;
	}
	
	public Person(String name, int age) {
		this(age);
		this.name = name;
		//this.age = age;
	}
	
	//方法
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void eat() {
		System.out.println("吃饭");
		this.study();
	}
	
	public void study() {
		System.out.println("学习");
	}
	
}
