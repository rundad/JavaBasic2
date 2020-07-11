package com.atguigu.java;
/**
 * 
 * @Description 总结： 属性赋值的先后顺序
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月31日下午2:35:01
 *
 *	属性赋值的方式：
 *	① 默认初始化值
 *	② 显式初始化
 *	③ 构造器中赋值
 *	④ 通过 (对象.方法) 或 (对象.属性) 的方式 赋值
 *
 *	以上操作的先后顺序： 
 */
public class UserTest {
	public static void main(String[] args) {
		User u = new User();
		
		System.out.println(u.age);
		
		User u1 = new User(2);
		
		u1.setAge(3);
		
		System.out.println(u1.age);
	}
}

class User{
	//默认初始化值
	String name;
	//显式初始化
	int age = 1;
	
	public User() {
		
	}
	
	public User(int a) {
		this.age = a;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}