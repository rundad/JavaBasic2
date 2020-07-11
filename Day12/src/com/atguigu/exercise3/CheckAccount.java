package com.atguigu.exercise3;
/**
 * 
 * @Description 练习， 可透支的账户类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月15日下午1:32:03
 *
 *	创建Account类的一个子类CheckAccount代表可透支的账户， 该账户定义一个属性overdraft代表可透支限额
 *	在CheckAccount类中 重写withdraw方法， 其算法如下：
 *		如果(取款金额<账户余额)
 *		可直接取款
 *		如果(取款金额>账户余额)
 *		计算要透支的额度
 *		判断可透支额overdraft是否足够支付本次透支需要， 如果可以
 *			将账户余额修改为0， 冲减可透支金额
 *		如果不可以
 *			提示用户超过可透支额的限额
 */
public class CheckAccount extends Account{
	
	private double overdraft; //可透支限额
	
	public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}
	
	@Override
	public void withdraw(double amount) {
		if(getBalance() >= amount) {//余额足够消费
			super.withdraw(amount);
		}else if(overdraft >= amount - getBalance()){//透支余额+余额 足够消费
			overdraft -= (amount - getBalance());
			setBalance(0);
		}else {
			System.out.println("超过可透支限额");
		}
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	
}
