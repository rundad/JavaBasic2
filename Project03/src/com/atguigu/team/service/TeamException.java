package com.atguigu.team.service;
/**
 * 
 * @Description 自定义异常类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月21日下午3:16:00
 *
 */
public class TeamException extends Exception{
	
	static final long serialVersionUID = -33875169929948L;
	
	public TeamException() {
		
	}
	
	public TeamException(String msg) {
		super(msg);
	}
}
