package com.atguigu.exercise;
/**
 * 
 * @Description 练习1
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月15日上午10:10:15
 *
 *	定义类Kids继承ManKind, 并包括
 *	成员变量int yearsOld
 *	方法printAge()打印yearsOld的值
 */
public class Kids extends ManKind{

	private int yearsOld;
	
	public Kids() {
	
	}

	public Kids(int yearsOld) {
		super();
		this.yearsOld = yearsOld;
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public void printAge() {
		System.out.println("I am " + yearsOld + " years old");
	}
	
	/**
	 * 修改练习1 中定义的类Kids, 在Kids中重新定义employeed()方法
	 * 覆盖父类ManKind中定义的employeed()方法
	 * 输出"Kids should study and no job"
	 */
	@Override
	public void employeed() {
		System.out.println("Kids should study and no job");
	}
}
