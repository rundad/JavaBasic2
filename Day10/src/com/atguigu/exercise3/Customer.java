package com.atguigu.exercise3;
/**
 * 
 * @Description 用户类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月11日下午2:59:41
 *
 */
public class Customer {
	private String firstName;
	private String lastName;
	private Account account;
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public Account getAccount() {
		return this.account;
	}
	
	public void setAccount(Account account) {
		this.account = account;
	}
}
