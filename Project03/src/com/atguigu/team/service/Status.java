package com.atguigu.team.service;
/**
 * 
 * @Description 表示员工的状态
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月21日下午1:51:54
 *
 */
public class Status {
	
	private final String NAME;
	
	private Status(String name) {
		this.NAME = name;
	}
	
	public static final Status FREE = new Status("FREE");
	public static final Status BUSY = new Status("BUSY");
	public static final Status VACATION = new Status("VACATION");

	public String getName() {
		return NAME;
	}
	
	
	
}
