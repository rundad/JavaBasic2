package com.atguigu.java2;
/**
 * 
 * @Description 类的成员之四：代码块 (或初始化块)
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月19日上午9:24:47
 *
 *	1. 代码块的作用：用来初始化类 或者 对象
 *	2. 代码块如果有修饰的话， 只能使用static
 *	3. 分类， 静态代码块 vs 非静态代码块
 *
 *	4. 静态代码块
 *		> 内部可以有输出语句
 *		> 随着类的加载而执行， 而且只执行一次
 *		> 作用：初始化类的信息
 *		> 如果一个类中， 定义了多个静态代码块， 则按照声明的先后顺序执行
 *		> 静态代码块的执行要优先于非静态代码块
 *		> 静态代码快内只能调用静态的属性， 静态的方法， 不能调用非静态的结构
 *
 *	5. 非静态代码块
 *		> 内部可以有输出语句
 *		> 随着对象的创建而执行
 *		> 每创建一个对象，就执行一次非静态代码块
 *		> 作用：可以在创建对象时， 在对象的属性等进行初始化
 *		> 如果一个类中定义了多个非静态代码块， 则按照声明的先后顺序执行
 *		> 非静态代码块内 ，可以调用静态的属性，静态的方法， 或非静态的属性，非静态的方法
 */
public class BlockTest {
	public static void main(String[] args) {
		
		String desc = Person.desc;//当调用静态变量的时候， 类就会加载到内存当中
		System.out.println(desc);
		
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println(p1.age);
	}
}


class Person{
	//属性
	String name;
	int age;
	static String desc = "我是一个人";
	
	//构造器
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//static的代码块
	static{
		System.out.println("hello, static block");
		desc = "我是一个爱学习的人";
	}
	
	//非static的代码块
	{
		System.out.println("hello, block");
		age = 1;
	}
	
	//方法
	public void eat() {
		System.out.println("吃饭");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public static void info() {
		System.out.println("我是一个快乐的人");
	}
	
}