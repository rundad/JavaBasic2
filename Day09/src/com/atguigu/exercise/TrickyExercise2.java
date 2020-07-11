package com.atguigu.exercise;

import java.io.PrintStream;

/**
 * 
 * @Description 貌似考察方法的参数传递
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月30日上午11:59:23
 *
 */
public class TrickyExercise2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		method(a, b);//需要在method方法被调用之后， 仅打印a=100, b=200
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}
	
	//方法一
	public static void method(int a, int b) {
		//在不改变原来题目的前提下2， 如何写这个函数才能在main方法中输出a=100, b=200?
		a = a * 10;
		b = b * 20;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		//思路： 因为方法的值传递 是基本数据类型， 在方法中改变数值后， main方法的数值不变
		//那么索性在方法中打印出改变的数值， 然后关闭JVM程序 不执行main方法后面的代码
		System.exit(0);
	}
	
	//方法二
	public static void method() {
		PrintStream ps = new PrintStream(System.out) {
			public void println(String x){
				if("a=10".equals(x)){
					x = "a=100";
				}else if("b=10".equals(x)) {
					x = "b=200";
				}
				super.println(x);
			}
		};
	}
	
}
