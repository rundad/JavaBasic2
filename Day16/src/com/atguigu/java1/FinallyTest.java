package com.atguigu.java1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/**
 * 
 * @Description try-catch-finally中finally的使用
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月21日上午9:34:33
 *
 *	1. finally是可选的
 *
 *	2. finally中声明的是一定会被执行的代码， 即使catch中又出现异常了，try中有return语句，catch中有
 *		return语句等情况
 *
 *	3. 像数据库连接， 输入输出流， 网络编程Socket等资源， JVM是不能自动的回收的，我们需要自己手动的进行的资源的释放
 *		此时的资源释放，就需要声明在finally中
 */
public class FinallyTest {
	
	@Test
	public void test2() {
		FileInputStream fis = null;
		try {
			File file = new File("hello.txt");
			fis = new FileInputStream(file);
			int data = fis.read();
			while(data != -1) {
				System.out.print((char)data);
				data = fis.read();
			}
			fis.close();
			
		}catch(FileNotFoundException e) {
			
		}catch(IOException e) {
			
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void testMethod() {
		int num = method();
		System.out.println(num);
	}
	
	
	public int method() {
		try {
			int[] arr = new int[10];
			System.out.println(arr[10]);
			return 1;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			return 2;
		}finally {
			System.out.println("我一定会被执行");
		}
	}
	
	@Test
	public void test1() {
		try {
			int a = 10;
			int b = 0;
			System.out.println(a / b);
			
		}catch(ArithmeticException e) {
//			e.printStackTrace();
			int[] arr = new int[10];
			System.out.println(arr[10]);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("我好帅啊");
		}
	}
}
