package com.atguigu.exercise;
/**
 * 
 * @Description 
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月31日下午1:59:01
 *
 *	在PersonTest类中实例化Person类的对象b， 
 *	调用setAge()和getAge()方法， 体会java的封装性
 */
public class PersonTest {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		//p1.age = 1; //编译不通过， 因为属性被私有化了
		
		p1.setAge(12);
		System.out.println("年龄为： " + p1.getAge());
		
		Person p2 = new Person("Tom", 21);
		System.out.println("name = " + p2.getName() + ", age = " + p2.getAge());
	}
}
