package com.atguigu.java1;

import java.util.Date;

/**
 * 
 * @Description 面试题：== 和 equals() 区别
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月18日上午8:35:55
 *
 *	1. 回顾 == 的使用：
 *		==：运算符
 *		① 可以使用在基本数据类型变量 和 引用数据类型变量中
 *		② 如果比较的是基本数据类型， 比较两个变量保存的数据是否相等(不一定类型要相同)
 *			如果比较的是引用数据类型， 比较两个对象的地址值是否相同， 即两个引用是否指向同一个对象实体
 *	补充：== 符号使用时， 必须保证符号左右 两边的变量类型一致
 *	
 *	2. equals()方法的使用：
 *		① 是一个方法， 而非运算符
 *		② 只能适用于引用数据类型
 *		③ Object类中equals()的定义：
 *			public boolean equals(Object obj){
 *				return (this == obj);
 *			}
 *			说明：Object类中定义的equals()和==的作用是相同的
 *			比较两个对象的地址值是否相同， 即两个引用是否指向同一个对象实体
 *		④ 像String, Date, File, 包装类等 都重写了Object类中的equals()方法， 重写以后， 比较的不是
 *			两个引用的地址是否相同， 而是比较两个对象的"实体内容"是否相同
 *
 *		⑤ 通常情况下， 我们自定义的类如果使用equals()的话， 也通常比较两个对象的"实体内容"是否相同
 *			那么我们就需要对Object类中的equals()进行重写
 */
public class EqualsTest {
	public static void main(String[] args) {
		//基本数据类型
		int i = 10;
		int j = 10;
		double d = 10.0;
		System.out.println(i == j);//true
		System.out.println(i == d);//true
		
		boolean b = true;
//		System.out.println(i == b);
		
		char c = 10;
		System.out.println(i == c);//true
		
		char c1 = 'A';
		char c2 = 65;
		System.out.println(c1 == c2);//true
		
		//引用类型
		Customer cust1 = new Customer("Tom", 21);
		Customer cust2 = new Customer("Tom", 21);
		System.out.println(cust1 == cust2);//false
		
		String str1 = new String("atguigu");
		String str2 = new String("atguigu");
		System.out.println(str1 == str2);
		System.out.println("************************************");
		System.out.println(cust1.equals(cust2));
		System.out.println(str1.equals(str2));
		
		
		Date date1 = new Date(4141412412123L);
		Date date2 = new Date(4141412412123L);
		System.out.println(date1.equals(date2));
	}
	
}
