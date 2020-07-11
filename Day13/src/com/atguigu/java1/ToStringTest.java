package com.atguigu.java1;

import java.util.Date;

/**
 * 
 * @Description Object类中toString()的使用
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月18日上午10:13:09
 *
 *	1. 当我们输出一个对象的引用时， 实际上就是调用当前对象的toString()方法
 *
 *	2. Object类中toString()方法的定义：
 *		public String toString() {
        	return getClass().getName() + "@" + Integer.toHexString(hashCode());
    	}
 *
 *	3. 像String, Date, File, 包装类等 都重写了， Object类中的toString()方法
 *		使得在调用对象的toString()时， 返回"实体内容"信息
 *
 *	4. 自定义类也可以重写toString()方法， 当调用此方法时， 返回对象的"实体内容"
 *
 */
public class ToStringTest {
	public static void main(String[] args) {
		Customer cust1 = new Customer("Tom", 11);
		System.out.println(cust1.toString());//com.atguigu.java1.Customer@28a418fc
		System.out.println(cust1);//com.atguigu.java1.Customer@28a418fc
		
		String str = new String("MM");
		System.out.println(str);//MM
		
		Date date = new Date(43523452345L);
		System.out.println(date.toString());//Thu May 20 01:50:52 CST 1971
	}
}
