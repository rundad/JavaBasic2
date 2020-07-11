package com.atguigu.exercise1;
/**
 * 
 * @Description 
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月19日下午1:15:04
 *
 */
public class Manager extends Employee{
	
	private double bonus;//奖金

	public Manager(double bonus) {
		super();
		this.bonus = bonus;
	}

	public Manager(String name, int id, double salary, double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}

	@Override
	public void work() {
		System.out.println("管理员工， 提供公司运行的效率");
	}
	
}
