package com.atguigu.exercise3;
/**
 * 
 * @Description 考验题
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月17日下午6:51:11
 *
 */
public class InterviewTest1 {
	public static void main(String[] args) {
		Base base = new Sub();
		base.add(1, 2, 3);//如果是重写则是sub_1, 如果不是则是base1
		//sub_1 - 原因：两个方法不能共存， 系统视为同一个方法， 所以是重写
		
		Sub s = (Sub)base; //改变类型后再调 是调的哪个方法
		s.add(1, 2, 3);//sub_2, 原因：sub_2方法是确定多个的 优先调用， sub_1是不确定多个的
	}
}

class Base{
	public void add(int a, int ... arr) {//是否是重写
		System.out.println("base1");
	}
}

class Sub extends Base{
	public void add(int a, int[] arr) {//是否是重写
		System.out.println("sub_1");
	}
	
	public void add(int a, int b, int c) {
		System.out.println("sub_2");
	}
}
