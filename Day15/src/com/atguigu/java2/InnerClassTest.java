package com.atguigu.java2;


/**
 * 
 * @Description 类的内部成员之五：内部类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月20日上午10:09:25
 *
 *	1. Java中允许将一个类A声明在另一个类B中， 则类A就是内部类， 类B称为外部类
 *
 *	2. 内部类的分类：成员内部类(静态， 非静态) vs 局部内部类(方法内， 代码块内， 构造器内)
 *
 *	3. 成员内部类：
 *			一方面：作为外部类的成员：
 *					> 调用外部类的结构
 *					> 可以被static修饰
 *					> 可以被4种不同的权限修饰
 *
 *			另一方面：作为一个类：
 *					> 类内 可以定义属性， 方法， 构造器等
 *					> 可以被final修饰， 表示此类不能被继承， 言外之意， 不使用final， 就可以被继承
 *					> 可以被abstract修饰
 *	
 *	4. 关注如下的3个问题
 *		4.1 如何实例化成员内部类的对象
 *		4.2 如何在成员内部类中 区分调用外部类的结构
 *		4.3 开发中 局部内部类的使用 -> InnerClassTest1.java
 *
 */
public class InnerClassTest {

	public static void main(String[] args) {
		//创建Dog(静态的成员内部类)
		Person.Dog dog = new Person.Dog();
		dog.show();
		//创建Bird实例(非静态的成员内部类);
		Person p = new Person();
		Person.Bird bird = p.new Bird();
		bird.sing();
		bird.display("黄鹂");
	}
}

class Person{
	
	String name = "小明";
	int age;
	
	public void eat() {
		System.out.println("吃饭");
	}
	
	//静态成员内部类
	static class Dog{
		String name;
		int age;
		
		public void show() {
			System.out.println("我是一只狗");
//			eat();
		}
	}
	//非静态成员内部类
	class Bird{
		String name = "杜鹃";
		
		public Bird() {
			
		}
		
		public void sing() {
			System.out.println("我是一只小小鸟");
			eat();//Person.this.eat() //调用外部类的非静态结构
		}
		
		public void display(String name) {
			System.out.println(name);//方法的形参
			System.out.println(this.name);//内部类的属性
			System.out.println(Person.this.name);//外部类的属性
		}
	}
	
	public void method() {
		//局部内部类
		class AA{
			
		}
	}
	
	{
		//局部内部类
		class BB{
			
		}
	}
	
	public Person() {
		//局部内部类
		class CC{
			
		}
	}
}