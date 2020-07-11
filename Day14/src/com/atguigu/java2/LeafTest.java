package com.atguigu.java2;
/**
 * 
 * @Description 输出语句的执行顺序
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月19日上午10:30:08
 *
 *	先执行父类， 再执行子类
 *	我们创建一个Leaf对象：
 *		① 先执行父类的 因为有super()， 也就是说会先执行/加载Object类的结构
 *		② 执行完所有父类的静态代码块后， 再到子类的静态代码块
 *		③ 然后还是因为super， 执行所有父类的构造器， 在执行构造器之前， 会执行非静态代码块
 *		④ 执行非静态代码块后， 执行构造器的输出语句
 *		⑤ 父类的执行完毕后， 执行子类的构造器， 在执行构造器之前， 执行非静态代码块
 *
 */
public class LeafTest {
	public static void main(String[] args) {
		new Leaf();
	}
}

class Root{
	static {
		System.out.println("Root的静态初始化块");
	}
	{
		System.out.println("Root的普通初始化块");
	}
	public Root() {
		System.out.println("Root的无参数的构造器");
	}
}

class Mid extends Root{
	static {
		System.out.println("Mid的静态初始化块");
	}
	{
		System.out.println("Mid的普通初始化块");
	}
	
	public Mid() {
		System.out.println("Mid的无参数的构造器");
	}
	public Mid(String msg) {
		//通过this调用同一类中重载的构造器
		this();
		System.out.println("Mid的带参数构造器，其参数值：" + msg);
	}
}

class Leaf extends Mid{
	static {
		System.out.println("Leaf的静态初始化块");
	}
	{
		System.out.println("Left的普通初始化块");
	}
	public Leaf() {
		//通过super调用父类中有一个字符串参数的构造器
		super("尚硅谷");
		System.out.println("Leaf的构造器");
	}
}