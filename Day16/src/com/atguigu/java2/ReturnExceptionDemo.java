package com.atguigu.java2;
/**
 * 
 * @Description 
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月21日上午11:06:41
 *
 */
public class ReturnExceptionDemo {
	static void methodA() {
		try {
			System.out.println("走进方法A");
			throw new RuntimeException("制造异常");
		}finally {
			System.out.println("用A方法的finally");
		}
	}
	
	static void methodB() {
		try {
			System.out.println("进入方法B");
			return;
		}finally {
			System.out.println("调用B方法的finally");
		}
	}
	
	public static void main(String[] args) {
		try {
			methodA();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		methodB();
	}
}
