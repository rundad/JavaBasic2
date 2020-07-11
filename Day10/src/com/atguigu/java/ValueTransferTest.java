package com.atguigu.java;
/**
 * 
 * @Description String的值传递
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月11日上午10:50:17
 *
 *	方法值传递机制要记的是：基本数据类型传的是实际存储的数据， 引用数据类型传的是地址值
 *
 *	而不是记：如果传的是基本数据类型， 方法外的数据就一定不会改， 然后引用数据类型就一定会改变
 */
public class ValueTransferTest {
	public static void main(String[] args) {
		ValueTransferTest test = new ValueTransferTest();
		String s1 = "hello";//看上去像基本数据类型， 实际是引用数据类型
		test.change(s1);//传的实参是引用数据类型， 按之前的例子来说， s1会改成hi， 但是没有
		//还是hello， 因为String是特殊的， 特别的，所以它存储的地方也是特别的，
		System.out.println(s1); // 存储在方法区的字符串常量池中, 它也会有地址值(尽管不是new出来的)

	}
	
	public void change(String s) {
		//String字符串是不可变字符序列，所以这里看似改变原有的s1的值
		s = "hi";//实际上在改的时候，是在字符串常量池中， 新建了一个"hi" 然后赋给了s
	}
}
