package com.atguigu.java1;
/**
 * 
 * @Description 单例设计模式
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月19日上午8:36:28
 *
 *	1. 所谓类的单例设计模式， 就是采取一定的方法保证在整个软件系统中， 对某个类只能存在一个对象实例
 *
 *	2. 如何实现?
 *		饿汉式 vs 懒汉式
 *
 *	instance属性对象 和 getInstance方法必须是static的原因：
 *		如果方法是非静态的， 那么我们就需要创建对象来调用方法来获取instance对象
 *		但是我们创建不了对象， 所以需要将方法修饰为static
 *
 *		然后因为方法是static的， static方法只能调static结构， 所以instance对象也需要是static的
 */
public class SingletonTest1 {
	public static void main(String[] args) {
		
		Bank bank1 = Bank.getInstance();
		Bank bank2 = Bank.getInstance();
		System.out.println(bank1 == bank2);//true
	}
}

//饿汉式
class Bank{
	
	//1. 私有化类的构造器
	private Bank() {
		
	}
	
	//2. 内部创建类的对象
	//4. 要求此对象也必须声明为静态的
	private static Bank instance = new Bank();
	
	
	//3. 提供公共的静态方法, 返回类的对象
	public static Bank getInstance() {
		return instance;
	}
}
