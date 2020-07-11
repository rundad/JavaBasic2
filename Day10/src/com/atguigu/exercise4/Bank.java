package com.atguigu.exercise4;
/**
 * 
 * @Description 练习， 银行类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月11日下午3:37:44
 *
 */
public class Bank {
	
	private Customer[] customers;//存放多个客户的数组
	private int numberOfCustomers;//记录客户的个数
	
	public Bank() {
		customers = new Customer[10];
	}
	
	//添加客户
	public void addCustomer(String f, String l) {
		customers[numberOfCustomers++] = new Customer(f, l);
//		numberOfCustomers++;
	}
	
	//获取客户的个数
	public int getNumOfCustomers() {
		return this.numberOfCustomers;
	}
	
	
	//获取指定的客户
	public Customer getCustomer(int index) {
		if(index >= 0 && index < numberOfCustomers) {
			return this.customers[index];			
		}
		return null;
	}
}
