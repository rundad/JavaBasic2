package com.atguigu.exercise2;
/**
 * 
 * @Description 练习 - 女孩的类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月11日下午12:38:56
 *
 */
public class Girl {
	
	private String name;
	private int age;
	
	public Girl() {
		
	}
	
	public Girl(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void marry(Boy boy) {
		System.out.println("我想嫁给" + boy.getName());
		boy.marry(this);
	}
	
	/**
	 * 
	 * @Description 比较两个对象的大小
	 * @author runda
	 * @date 2020年6月11日下午12:44:48
	 * @param girl
	 * @return 正数： 当前对象大， 负数： 当前对象小， 0：当前对象与形参对象相等
	 */
	public int compare(Girl girl) {
//		if(this.age > girl.age) {
//			return 1;
//		}else if(this.age < girl.age) {
//			return -1;
//		}else {
//			return 0;
//		}
		
		return this.age - girl.age;
		
	}
}
