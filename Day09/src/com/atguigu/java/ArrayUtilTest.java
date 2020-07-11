package com.atguigu.java;
/**
 * 
 * @Description Array工具类测试
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月28日下午12:32:44
 *
 */
public class ArrayUtilTest {
	public static void main(String[] args) {
		ArrayUtil util = new ArrayUtil();
		int[] arr = new int[] {2, 4, 53, 34, 32, -8, 756, 243, -53, 8};
		int max = util.getMax(arr);
		System.out.println("最大值为： " + max);
		
		util.sort(arr);
		util.print(arr);
	}
}
