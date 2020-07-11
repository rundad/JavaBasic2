package com.atguigu.java2;

import org.junit.Test;

/**
 * 
 * @Description 包装类 和 它的使用
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月18日上午11:01:54
 *
 *	1. java提供了8种基本数据类型 对应的包装类， 使得基本数据类型的变量具有类的特征
 *
 *	2. 掌握的：基本数据类型， 包装类， String三者之间的相互转换
 *
 *	JDK 5.0新特性：自动装箱与自动拆箱：
 *		如果需要把一个数字变量 放进一个多态的方法里， 就需要转成包装类
 *		如果需要做运算， 就可以转成基本数据类型
 */
public class WrapperTest {

	//String类型 ----> 基本数据类型， 包装类, 调用包装类的parseXxx()方法
	@Test
	public void test5() {
		String str1 = "123";
//		int num1 = (int)str1;
//		Integer in1 = (Integer)str1;
		//可能会报NumberFormatException异常
		int num2 = Integer.parseInt(str1);
		System.out.println(num2 + 1);
		
		String str2 = "true";
		boolean b1 = Boolean.parseBoolean(str2);
		System.out.println(b1);
	}
	
	//基本数据类型， 包装类 ----> String类型: 调用String重载的valueOf(Xxx xxx)
	@Test
	public void test4() {
		int num1 = 10;
		
		//方式一：
		String str1 = num1 + "";
		//方式二：调用String重载的valueOf(Xxx xxx)
		float f1 = 12.3f;
		String str2 = String.valueOf(f1);//"12.3"
		
		Double d1 = new Double(12.4);
		String str3 = String.valueOf(d1);
		System.out.println(str2);
		System.out.println(str3);//"12.4"
	}
	
	/*
	 * JDK 5.0新特性， 自动装箱与自动拆箱
	 */
	@Test
	public void test3() {
		int num1 = 10;
		//基本数据类型 --> 包装类的对象
		method(num1); //并不是Object obj = num1;， 而是因为自动装箱
		
		//自动装箱：基本数据类型 -> 包装类
		int num2 = 10;
		Integer in1 = num2;//自动装箱
		
		boolean b1 = true;
		Boolean b2 = b1;//自动装箱
		
		//自动拆箱：包装类 -> 基本数据类型
		System.out.println(in1.toString());
		int num3 = in1;//自动拆箱
	}
	
	public void method(Object obj) {//如果需要把一个数字变量 放进一个多态的方法里， 就需要转成包装类
		System.out.println(obj);
	}
	
	//包装类 ----> 基本数据类型: 调用包装类的xxxValue()
	//如果需要做运算， 就可以转成基本数据类型
	@Test
	public void test2() {
		Integer in1 = new Integer(12);
		
		int i1 = in1.intValue();
		System.out.println(i1 + 1);
		//按规则来说，类(Integer)不可以做运算的， 需要转到基本数据类型
		System.out.println(in1 + 1);//但是因为有自动拆箱，然后它自动拆箱了， 拆到了基本数据类型， 所以这里的运算成功了
		
		Float f1 = new Float(12.3);
		float f2 = f1.floatValue();
		System.out.println(f2 + 1);
	}
	
	
	//基本数据类型 ----> 包装类， 调用包装类的构造器
	@Test
	public void test1() {
		int num1 = 10;
//		System.out.println(num1.toString());
		Integer in1 = new Integer(num1);
		System.out.println(in1.toString());
		
		Integer in2 = new Integer("123");
		System.out.println(in2.toString());
		
		//NumberFormatException异常
//		Integer in3 = new Integer("123abc");
//		System.out.println(in3.toString());
		
		Float f1 = new Float(12.3f);
		Float f2 = new Float("12.3");
		System.out.println(f1);
		System.out.println(f2);
		
		Boolean b1 = new Boolean(true);//true
		Boolean b2 = new Boolean("true");//true
		
		Boolean b3 = new Boolean("true123");
		System.out.println(b3);//false
		
		Order order = new Order();
		System.out.println(order.isMale);//false, 默认值为false
		System.out.println(order.isFemale);//null，因为是类了 不是基本数据类型了， 默认值为null
	}
	
}

class Order{
	boolean isMale;
	Boolean isFemale;
}
