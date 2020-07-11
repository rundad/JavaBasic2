package com.atguigu.p2.service;

import com.atguigu.p2.bean.Customer;

/**
 * 
 * @Description 
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月12日下午3:03:09
 *
 */
public class CustomerList {
	
	private Customer[] customers; //用来保存客户对象的数组
	private int total = 0; //记录已保存客户对象的数量
	
	/**
	 * 构造器， 用来初始化customers数组
	 * @param totalCustomer 指定数组长度
	 */
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}
	
	/**
	 * 
	 * @Description 将参数customer添加组中最后一个客户对象记录之后
	 * @author runda
	 * @date 2020年6月12日下午3:45:15
	 * @param customer
	 * @return true:添加成功, false:数组已满， 添加失败
	 */
	public boolean addCustomer(Customer customer) {
		if(total >= customers.length) {
			return false;
		}
		customers[total++] = customer;
		return true;
	}
	
	/**
	 * 
	 * @Description 用参数customer替换数组中由index指定的对象
	 * @author runda
	 * @date 2020年6月12日下午3:47:07
	 * @param index 指定所替换对象在数组的位置， 从0开始
	 * @param cust 指定替换的新客户对象
	 * @return true:替换成功， false:索引无效， 替换失败
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		if(index < 0 || index >= total) {
			return false;
		}
		customers[index] = cust;
		return true;
	}
	
	/**
	 * 
	 * @Description 删除指定索引位置上的客户
	 * @author runda
	 * @date 2020年6月12日下午3:54:36
	 * @param index
	 * @return true:删除成功，false:删除失败
	 */
	public boolean deleteCustomer(int index) {
		if(index < 0 || index >= total) {
			return false;
		}
		//用指定索引的后一个元素覆盖指定索引的数据， 并将后面数据往前移
		//total - 1避免索引越界
		for(int i = index; i < total - 1; i++) {
			customers[i] = customers[i + 1];
		}
		//最后有数据的元素需要置空
		customers[total - 1] = null;
		total--;
		return true;
	}
	
	/**
	 * 
	 * @Description 获取所有的客户信息
	 * @author runda
	 * @date 2020年6月12日下午4:01:10
	 * @return
	 */
	public Customer[] getAllCustomers() {
		Customer[] custs = new Customer[total];
		for(int i = 0; i < total; i++) {
			custs[i] = customers[i];
		}
		return custs;
	}
	
	/**
	 * 
	 * @Description 获取指定索引位置上的客户
	 * @author runda
	 * @date 2020年6月12日下午4:03:01
	 * @param index
	 * @return 如果是无效索引 返回空， 索引合规 返回指定索引的客户对象
	 */
	public Customer getCustomer(int index) {
		if(index < 0 || index >= total ) {
			return null;
		}
		return customers[index];
	}
	
	/**
	 * 
	 * @Description 返回客户个数
	 * @author runda
	 * @date 2020年6月12日下午4:03:58
	 * @return total:客户的个数
	 */
	public int getTotal() {
		return total;
	}
	
}
