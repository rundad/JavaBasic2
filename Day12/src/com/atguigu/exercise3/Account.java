package com.atguigu.exercise3;
/**
 * 
 * @Description 账户类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月15日下午1:23:43
 *
 */
public class Account {
	private int id;//账号
	private double balance;//余额
	private double annualInterestRate;//年利率
	
	public Account(int id, double balance, double annualInterestRate) {
		super();
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
	
	public double getMonthlyInterest() {
		return annualInterestRate / 12;
	}
	
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			return;
		}
		System.out.println("余额不足");
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
}
