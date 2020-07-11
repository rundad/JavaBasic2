package com.atguigu.java1;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @Description 方法的重写规则
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月21日上午10:13:00
 *
 *	方法重写的规则之一：
 *	子类重写的方法抛出的异常类型不大于父类被重写的方法抛出的异常类型
 *
 *
 */
public class OverrideTest {

	public static void main(String[] args) {
		OverrideTest test = new OverrideTest();
		test.display(new SubClass());
	}
	
	public void display(SuperClass s) {
		try {
			s.method();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class SuperClass{
	
	public void method() throws IOException{
		
	}
}

class SubClass extends SuperClass{
	
	@Override
	public void method() throws FileNotFoundException {
		
	}
}
