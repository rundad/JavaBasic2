package com.atguigu.exercise4;
/**
 * 
 * @Description 练习， 用户类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月11日下午3:31:56
 *
 */
public class Customer {
	private String firstName;
	private String lastName;
	private Account account;
	
	public Customer(String f, String l) {
		this.firstName = f;
		this.lastName = l;
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
	
	public void setAccount(Account acct) {
		this.account = acct;
	}
}
