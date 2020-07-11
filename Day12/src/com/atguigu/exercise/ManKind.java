package com.atguigu.exercise;
/**
 * 
 * @Description 练习1
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月15日上午10:04:45
 *
 *	定义一个ManKind类， 包括：
 *	成员变量 int sex和int salary
 *	方法void manOrWoman(), 根据sex的值显示"man"(sex == 1)或者"woman"(sex == 0)
 *	方法void employeed(), 根据salary的值显示"no job"(salary == 0)或者"job"(salary != 0)
 */
public class ManKind {
	
	private int sex;
	private int salary;
	
	public ManKind() {
		
	}
	
	public ManKind(int sex, int salary) {
		this.sex = sex;
		this.salary = salary;
	}
	
	public void manOrWoman(){
		if(sex == 1) {
			System.out.println("man");
		}else if(sex == 0) {
			System.out.println("woman");
		}
	}
	
	public void employeed() {
//		if(salary == 0) {
//			System.out.println("no job");
//		}else {
//			System.out.println("job");
//		}
		String jobInfo = (salary == 0)? "no job" : "job";
		System.out.println(jobInfo);
	}
	
	public int getSex() {
		return sex;
	}
	
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
