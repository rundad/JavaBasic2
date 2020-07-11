package com.atguigu.java1;
/**
 * 
 * @Description 可变个数形参的方法
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月30日上午10:27:53
 *
 *
 *	1. jdk 5.0 新增的内容
 *	2. 具体使用
 *		① 可变个数形参的格式：数据类型 ... 变量名
 *		② 当调用可变个数形参方法时， 传入的参数个数可以是 0个， 1个， 2个 ...
 *		③ 可变个数形参的方法与本类中方法名相同，形参不同的方法之间构成重载
 *		④ 可变个数形参的方法与本类中方法名相同， 形参类型也相同的数组之间不构成重载
 *		⑤ 可变个数形参在方法的形参中， 必须在声明在末尾
 *		⑦ 可变个数形参在方法中 最多只能声明一个可变形参
 *
 *
 */
public class MethodArgsTest {

	public static void main(String[] args) {
		MethodArgsTest test = new MethodArgsTest();
		test.show(12);	
		test.show("hello");
		test.show("hello", "world");
	}
	
	public void show(int i) {
		
	}
	
	public void show(String i) {
		System.out.println("show(String)");
		
	}
	
	public void show(String ... strs) {
		System.out.println("show(String ... strs)");
		
		for(int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
	
	//与可变个数形参方法相同 所以不能同时存在
//	public void show(String[] strs) {
//		
//	}
}
