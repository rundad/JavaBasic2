package com.atguigu.java1;
/**
 * 
 * @Description 方法的重载
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月30日上午9:58:42
 *	
 *	1. 定义， 在同一个类中， 允许存在一个以上的同名方法， 只要它们的参数个数或者参数类型不同即可
 *		"两同一不同"： 同一个类， 相同方法名
 *					参数列表不同， 参数个数不同， 参数类型不同
 *	
 *	2. 举例：
 *		Arrays类中重载的sort() / binarySearch()
 *
 *	3. 判断是否是重载
 *		跟方法的权限修饰符， 返回值类型， 形参变量名， 方法体都没有关系
 *
 *	4. 在通过对象调用方法时， 如何确定某一个指定的方法
 *		① 方法名 -》 参数列表
 */
public class OverloadTest {
	
	public static void main(String[] args) {
		OverloadTest test = new OverloadTest();
		test.getSum(1, 2);
	}
	
	//如下的四个方法构成了重载
	public void getSum(int i, int j) {
		System.out.println("1");
	}
	
	public void getSum(double d1, double d2) {
		System.out.println("2");
	}
	
	public void getSum(String s, int i) {
		System.out.println("3");
	}
	
	public void getSum(int i, String s) {
		System.out.println("4");
	}
	
	//不能构成重载
//	public int getSum(int i, int j) {
//		
//	}
	
//	public void getSum(int m, int n) {
//		
//	}
	
//	private void getSum(int i, int j) {
//		
//	}
	
	
}
