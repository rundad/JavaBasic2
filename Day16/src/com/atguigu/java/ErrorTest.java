package com.atguigu.java;
/**
 * 
 * @Description 异常分类一：Error
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月20日下午1:36:13
 *
 *	Error：
 *	Java虚拟机无法解决的严重问题， 如：JVM系统内部错误， 资源耗尽等严重情况， 比如：StackOverflowError
 *	和OOm
 *
 *	一般不编写针对性的代码进行处理
 *
 */
public class ErrorTest {
	public static void main(String[] args) {
		//1. 栈溢出：java.lang.StackOverflowError
//		main(args);/;/递归
		
		//2. 堆溢出：java.lang.OutOfMemoryError
		Integer[] arr = new Integer[1024*1024*1024];
	}
}
