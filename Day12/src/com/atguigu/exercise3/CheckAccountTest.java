package com.atguigu.exercise3;
/**
 * 
 * @Description 练习
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月15日下午1:46:05
 *
 *
 *	写一个用户程序测试CheckAccount类
 *	在用户程序中， 创建一个账户为1122, 余额为20000， 年利率4.5%， 可透支额为5000元的CheckAccount对象
 *		使用withdraw方法提款5000元， 并打印账户余额和可透支额
 *		再使用withdraw方法提款18000元， 并打印账户余额和可透支额
 *		再使用withdraw方法提款3000元， 并打印账余额和可透支余额
 *
 */
public class CheckAccountTest {
	public static void main(String[] args) {
		
		CheckAccount acct = new CheckAccount(1122, 20000, 0.045, 5000);
		
		acct.withdraw(5000);
		System.out.println("您的账户余额为：" + acct.getBalance());
		System.out.println("您的可透支额度为：" + acct.getOverdraft());
		acct.withdraw(18000);
		System.out.println("您的账户余额为：" + acct.getBalance());
		System.out.println("您的可透支额度为：" + acct.getOverdraft());
		acct.withdraw(3000);
		System.out.println("您的账户余额为：" + acct.getBalance());
		System.out.println("您的可透支额度为：" + acct.getOverdraft());
	}
}
