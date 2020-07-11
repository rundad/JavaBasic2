package com.atguigu.java1;
/**
 * 
 * @Description 单例设计模式
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月19日上午8:36:28
 *
 *	单例模式的懒汉式实现
 *
 *	区分饿汉式 和 懒汉式
 *		饿汉式：
 *			坏处， 对象加载时间过长
 *			好处， 饿汉式是线程安全
 *
 *		懒汉式：
 *			好处， 延迟对象的创建
 *			目前的写法坏处， 线程不安全 ----> 到多线程内容时， 再修改
 *	
 */
public class SingletonTest2 {
	public static void main(String[] args) {
		
		Order order1 = Order.getInstance();
		Order order2 = Order.getInstance();
		System.out.println(order1 == order2);
	}
}

class Order{
	
	//1. 私有化类的构造器
	private Order() {
		
	}
	
	//2. 声明当前类对象， 没有初始化
	//4. 此对象也必须声明为static的
	private static Order instance = null;
	
	//3. 声明public, static的返回当前类对象 
	public static Order getInstance() {
		if(instance == null) {
			instance = new Order();
		}
		return instance;
	}
	
}
