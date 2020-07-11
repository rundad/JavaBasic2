package com.atguigu.exercise;
/**
 * 
 * @Description Person类的测试类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月26日上午11:12:22
 *
 */
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Tom";
		p1.age = 18;
		p1.sex = 1;
		
		p1.study();
		p1.showAge();
		int newAge = p1.addAge(2);
		System.out.println(p1.name + "的新年龄为：" + newAge);
		
		System.out.println(p1.name);
		
		//----------------------
		Person p2 = new Person();
		p2.showAge();//0
		p2.addAge(10);
		p2.showAge();//10
		
		p1.showAge();
	}
}
