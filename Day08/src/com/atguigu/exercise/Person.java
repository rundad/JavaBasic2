package com.atguigu.exercise;
/**
 * 
 * @Description 方法练习
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月26日上午11:08:41
 *
 *	创建Person类的对象，设置该对象的name， age 和sex属性
 *	调用study方法， 输出字符创studying
 *	调用showAge()方法显示age值
 *	调用addAge()方法给对象的age属性值增加两岁
 *
 *	创建第二个对象， 执行上述操作， 体会同一个类的不同对象之间的关系
 */
public class Person {
	String name;
	int age;
	/**
	 * sex: 1表示是男性
	 * sex： 0表示是女性
	 */
	int sex;
	
	public void study() {
		System.out.println("studying");
	}
	
	public void showAge() {
		System.out.println("age:" + age);
	}
	
	public int addAge(int i) {
		age += i;
		return age;
	}
}
