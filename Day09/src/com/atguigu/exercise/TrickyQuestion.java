package com.atguigu.exercise;
/**
 * 
 * @Description 刁钻问题
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月11日上午10:01:35
 *
 */
public class TrickyQuestion {
	public static void main (String[] args) {
		int[] arr = new int[] {1, 2, 3};
		System.out.println(arr);//地址值
		
		char[] arr1 = new char[] {'a', 'b', 'c'};
		System.out.println(arr1);//看似会打印出地址值 因为是数组， 但是打印出的是abc
		//原因：这个println方法是重载方法， 如果放入的是char型数组， 则遍历该数组
		//上面的println是放入Object的方法， 构建地址值的字符串，然后使用 流， 打印出构建的字符串
	}
}
