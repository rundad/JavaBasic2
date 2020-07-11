package com.atguigu.java;
/**
 * 
 * @Description 内部类 前端(Android)补充知识
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月20日下午1:14:02
 *
 */
public class InnerClassTest {

	
	/*
	 * 在局部内部类的方法中(比如:show() )如果调用局部内部类所声明的方法(比如：method)中的局部变量的话
	 * 
	 * 要求此局部变量声明为final的
	 * 
	 * jdk 7及之前版本， 要求此局部变量显式的声明为final的
	 * jdk 8及之后的版本， 可以省略final的声明
	 */
	public void method() {
		//局部变量
		int num = 10; //final int num = 10
		class AA{
			
			public void show() {
//				num = 20;
				System.out.println(num);
			}
		}
	}
}
