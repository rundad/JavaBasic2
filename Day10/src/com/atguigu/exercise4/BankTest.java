package com.atguigu.exercise4;
/**
 * 
 * @Description 测试类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月11日下午3:45:19
 *
 */
public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addCustomer("Jane", "Smith");
		
		//连续操作
		bank.getCustomer(0).setAccount(new Account(2000));
	
		bank.getCustomer(0).getAccount().withdraw(500);
		
		double balance = bank.getCustomer(0).getAccount().getBalance();
		System.out.println("客户：" + bank.getCustomer(0).getFirstName() + "的账户余额为：" + balance);
	
		System.out.println("-------------------------");
		bank.addCustomer("万里", "杨");
		System.out.println("银行客户的个数为：" + bank.getNumOfCustomers());
	}
}
