package com.atguigu.exercise;
/**
 * 
 * @Description 自定义异常类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月21日上午11:28:36
 *
 *	
 */
public class EcDef extends Exception{

	static final long serialVersionUID = -338724229948L;
	
	public EcDef() {
		
	}
	
	public EcDef(String msg) {
		super(msg);
	}
}
