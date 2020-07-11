package com.atguigu.exercise4;
/**
 * 
 * @Description 练习， 账户类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月11日下午3:28:31
 *
 */
public class Account {
	private double balance;
	
	public Account(double init_balance) {
		this.balance = init_balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amt) {//存款
		if(amt > 0) {
			this.balance += amt;
			System.out.println("成功存入：" + amt);
		}
	}
	
	public void withdraw(double amt) {//提款
		if(this.balance >= amt) {
			this.balance -= amt;
			System.out.println("取钱成功");
		}else {
			System.out.println("余额不足， 取钱失败");
		}
	}
}
