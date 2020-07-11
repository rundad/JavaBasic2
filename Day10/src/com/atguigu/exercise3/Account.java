package com.atguigu.exercise3;
/**
 * 
 * @Description 练习
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月11日下午12:53:53
 *
 *	写一个为Account的类模拟账户， 该类的属性和方法如图下所示， 该类包括的属性：
 *	账号 id， 余额 balance， 年利率 annualInterestRate， 包含的方法： 构造器方法(getter和setter方法)
 *	取款方法 withdraw(), 存款方法 deposit()
 *	
 */
public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	
	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	public int getId() {
		return id;
		
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	//取钱
	public void withdraw(double amount) {
		if(this.balance < amount) {
			System.out.println("余额不足， 取钱失败");
			return;
		}
		
		this.balance -= amount;
		System.out.println("成功取出：" + amount);
		
	}
	
	//存钱
	public void deposit(double amount) {
		if(amount > 0) {
			this.balance += amount;
			System.out.println("成功存入：" + amount);
		}
	}
}
