package com.atguigu.exercise;
/**
 * 
 * @Description 二维数组练习， 得出电话号码
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年4月17日下午12:57:41
 *
 */
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = new int[] {8, 2, 1, 0, 3};
		int[] index = new int[] {2, 0 ,3, 2, 4, 0, 1, 3, 2, 3, 3};
		String tel = "";
		for(int i = 0; i<index.length; i++) {
			tel += arr[index[i]];
		}
		System.out.println(tel);
		
	}
}
