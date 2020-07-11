package com.atguigu.exercise3;
/**
 * 
 * @Description 测试类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月11日下午3:03:50
 *
 *	写一个测试程序
 *	1. 创建一个Customer， 名字叫Jane Smith
 *	他有一个账号为1000， 余额为2000元， 年利率为1.23%的账户
 *	2. 对Jane Smith操作
 *	存入100元， 再取出960元， 再取出2000元
 *	打印出Jane Smith的基本信息
 */
public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer("Jane", "Smith");

		Account account = new Account(1000, 2000, 0.0123);
		customer.setAccount(account);
		
		customer.getAccount().deposit(100);
		customer.getAccount().withdraw(960);
		customer.getAccount().withdraw(2000);
		
		System.out.println("Customer [" + customer.getLastName() + ", " + 
				customer.getFirstName() + "] has a account: id is " + 
				customer.getAccount().getId());
		System.out.println("annualInterestRate is " + 
				customer.getAccount().getAnnualInterestRate() * 100 + 
				"%, balance is " + customer.getAccount().getBalance());
		
		
	}
}
