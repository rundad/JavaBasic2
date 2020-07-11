package com.atguigu.java;
/**
 * 
 * @Description JavaBean
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月31日下午2:44:55
 *
 *	JavaBean是一种Java语言写成的可重用组件
 *
 *	所谓JavaBean 是指符合如下标准的Java类
 *		1.  类是公共的
 *		2. 有一个无参的公共构造器
 *		3. 有属性的， 且有对应的get，set方法 
 *	
 */
public class Customer {
	private int id;
	private String name;
	
	public Customer() {
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
