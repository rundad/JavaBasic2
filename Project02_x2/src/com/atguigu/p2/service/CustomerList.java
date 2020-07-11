package com.atguigu.p2.service;

import com.atguigu.p2.bean.Customer;

/**
 * 
 * @Description 
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月14日下午12:29:49
 *
 */
public class CustomerList {

	Customer[] customers;//存储客户的数组
	int total;//客户的个数
	
	public CustomerList(int initial_length) {
		customers = new Customer[initial_length];//初始化客户数组
	}
	
	public boolean addCustomer(Customer cust) {//添加客户
		if(total >= customers.length) {
			return false; //客户目录已满
		}
		
		customers[total++] = cust;
		return true;
	}
	
	public boolean replaceCustomer(int index, Customer cust) {//覆盖客户
		if(index < 0 || index >= total) {
			return false;
		}
		customers[index] = cust;
		return true;
	}
	
	public boolean deleteCustomer(int index) {//删除客户
		if(index < 0 || index >= total) {
			return false;
		}
		
		//删除客户 然后让数组后面元素往前移的操作
		for(int i = index; i < total - 1; i++) {//删除原理：让后面的元素覆盖掉要删除的元素
			customers[i] = customers[i + 1];//i + 1会造成索引越界， 需要解决这个问题
		}
		
		customers[total - 1] = null;
		total--;
		return true;
	}
	
	public Customer getCustomer(int index) {//查找客户
		if(index < 0 || index >= total) {
			return null;
		}
		
		return customers[index];
	}
	
	public int getTotal() {//获取客户个数
		return total;
	}
	
	public Customer[] listAllCustomers() {//获取所有客户
		Customer[] custs = new Customer[total];
		for(int i = 0; i < total; i++) {
			custs[i] = customers[i];
		}
		
		return custs;
	}
}
