package com.atguigu.java2;
/**
 * 
 * @Description 自定义异常类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月21日上午10:50:58
 *
 *	如何自定义异常类
 *	1. 继承于现有的异常结构：RuntimeException, Exception
 *	2. 提供全局常量：serialVersionUID
 *	3. 提供重载的构造器
 *
 *	
 */
public class MyException extends RuntimeException{
	
	static final long serialVersionUID = -7034897190745766939L;
	
	public MyException() {
		
	}
	
	public MyException(String msg) {
		super(msg);
	}
}
