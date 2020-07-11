package com.atguigu.java;
/**
 * 
 * @Description 实例测试
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月28日上午11:12:42
 *
 *	一： 理解“万事万物皆对象”
 *		① 在Java语言范畴中， 我们都将功能， 结构等都封装到类中， 通过类的实例化， 来调用具体的功能结构
 *			》Scanner， String等
 *			》文件，File - 具体的一个文件 可以是一个对象
 *			》网络资源， URL
 *		② 第二个层面， 涉及到Java语言与前端Html， 后端数据库交互时， 前后端的结构在Java层面交互时， 都体现为类和对象
 *			比如在前端Html中， 一个html element反馈到Java层面内， 可以体现为一个对象
 *			       在数据库交互式， 数据库内的表可以体现为一个类， 表内结构可以体现为类的属性， 表内的一行数据 可以体现为一个对象
 *			所以在Java层面上 一切皆为对象
 *	
 *	匿名对象：
 *	比如有一个类： class Phone
 *	匿名对象：
 *	new Phone().sendEmail();
 *	new Phone().playGame();
 *	理解：
 *		① 我们创建的对象， 没有显式的赋给一个变量名， 即为匿名对象
 *		② 特征： 匿名对象只能调用一次
 *		③ 如下
 *	
 */
public class InstanceTest {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.sendEmail();
		p1.playGame();
		
		System.out.println("------------------------------");
		//匿名对象
		new Phone().sendEmail();
		new Phone().playGame();
		
		System.out.println("------------------------------");
		//匿名对象的使用
		PhoneMall pm = new PhoneMall();
		pm.showPhoneInfo(new Phone());
		
	}
}

class PhoneMall{
	
	public void showPhoneInfo(Phone phone) {
		phone.sendEmail();
		phone.playGame();
	}
}

class Phone{
	double price;
	
	public void sendEmail() {
		System.out.println("发邮件");
	}
	
	public void playGame() {
		System.out.println("玩游戏");
	}
}
