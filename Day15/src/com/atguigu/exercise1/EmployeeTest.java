package com.atguigu.exercise1;
/**
 * 
 * @Description abstract练习 测试类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月19日下午1:13:21
 *
 *	
 */
public class EmployeeTest {
	public static void main(String[] args) {
		
		//多态
		Employee manager = new Manager("库克", 1001, 5000, 50000);
		
		manager.work();
		
		CommonEmployee commonEmployee = new CommonEmployee();
		commonEmployee.work();
	}
}
