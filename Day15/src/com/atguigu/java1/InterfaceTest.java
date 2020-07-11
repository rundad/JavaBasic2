package com.atguigu.java1;
/**
 * 
 * @Description 接口的使用
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月19日下午2:59:00
 *
 *	1. 接口使用interface来定义
 *	2. Java中， 接口和类是并列的两个结构
 *	3. 如何定义接口， 定义结构中的成员
 *	
 *		3.1 JDK7及以前：
 *			接口 只能定义全局常量 和 抽象方法
 *			> 全局常量: public static final的, 但是书写时， 可以省略不写
 *			> 抽象方法：public abstract
 *
 *		3.2 JDK8：
 *			除了定义全局变量和抽象方法之外， 还可以定义静态方法， 默认方法(略)
 *	
 *	4. 接口中不能定义构造器的， 意味着接口不可以实例化
 *
 *	5. java开发中， 接口都通过让类去实现(implements)的方式来使用
 *		如果实现类覆盖了 接口中的所有抽象方法， 则此实现类可以实例化
 *		如果实现类没有覆盖 接口中的所有的抽象方法， 则此实现类仍为一个抽象类
 *
 *	6. Java类可以实现多个接口 ----> 弥补了Java单继承性的局限性
 *		格式： class AA extends BB implements CC, DD, EE
 *
 *	7. 接口 与 接口之间可以继承， 而且可以多继承
 *	
 *	****************************************
 *	8. 接口的具体使用， 体现多态性
 *	9. 接口， 实际上可以看做是一种规范
 *
 *	面试题：抽象类与接口有哪些异同：
 *		抽象类和接口都不能实例化
 */
public class InterfaceTest {
	public static void main(String[] args) {
		
		System.out.println(Flyable.MIN_SPEED);
		System.out.println(Flyable.MAX_SPEED);
//		Flyable.MIN_SPEED = 2;
		
		Plane plane = new Plane();
		plane.fly();
	}
}

interface Flyable{
	
	//全局常量
	public static final int MAX_SPEED = 7900;//第一宇宙速度
	int MIN_SPEED = 1; //省略了public static final
	
	//抽象方法
	public abstract void fly();
	
	void stop();//省略public abstract
	
}

class Plane implements Flyable, CC{
	@Override
	public void fly() {
		System.out.println("通过引擎起飞");
	}
	@Override
	public void stop() {
		System.out.println("驾驶员减速停止");
	}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
}

abstract class Kite implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	
}
//************************
//接口可以多继承
interface AA{
	void method1();
}

interface BB{
	void method2();
}

interface CC extends AA, BB{
	
}
