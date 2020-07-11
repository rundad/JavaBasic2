package com.atguigu.java;
/**
 * 
 * @Description 设计类， 就是设计类的成员
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月26日上午9:26:11
 *
 *	属性： 成员变量： field： 域： 字段
 *	方法： 成员方法： 函数： method
 *
 *	创建类的对象： 类的实例化： 实例化类
 *
 *	内存解析
 */
//测试类
public class PersonTest {
	public static void main(String[] args) {
		//创建Person类的对象
		Person p1 = new Person();
		//Scanner scanner = new Scanner(System.in);
	
		//调用对象的结构， 属性， 方法
		//调用属性： 对象.属性
		p1.name = "Tom";
		p1.isMale = true;
		System.out.println(p1.name);
		
		//调用方法： 对象.方法()
		p1.eat();
		p1.sleep();
		p1.talk("Chinese");
	}
}

class Person{
	
	//属性
	String name;
	int age = 1;
	boolean isMale;
	
	//方法
	public void eat() {
		System.out.println("人可以吃饭");
	}
	
	public void sleep() {
		System.out.println("人可以睡觉");
	}
	
	public void talk(String language) {
		System.out.println("人可以说话， 使用的是 " + language);
	}
	
}
