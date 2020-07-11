package com.atguigu.exercise;
/**
 * 
 * @Description 数组回顾 练习
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月17日上午11:53:11
 *
 */
public class ArrayReviewExercise {
	public static void main(String[] args) {
		
		//1. 写出一维数组初始化的两种方式
		int[] arr = new int[5]; //动态初始化
		
		String[] arr1 = new String[]{"Tom", "Jerry", "Jim"};//静态初始化
		//数组一旦初始化， 其长度就是确定的， arr.length
		//数组长度一旦确定， 就不可修改
		
		//2. 写出二维数组初始化的两种方式
		int[][] arr2 = new int[4][3]; //动态初始化
		int[][] arr3 = new int[4][];//动态初始化
		
		int[][] arr4 = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8}};//静态初始化
		
		//3. 遍历如下的二维数组
		int[][] arr5 = new int[][] {{1, 2, 3}, {4, 5}, {6, 7, 8}};
		
		for(int i = 0; i < arr5.length; i++) {
			for(int j = 0; j < arr5[i].length; j++) {
				System.out.print(arr5[i][j] + "\t");
			}
			System.out.println();
		}
		
		//4. 不同类型的一维数组元素的默认初始化值是什么
		//整形: 0
		//浮点型: 0.0
		//char: 0
		//boolean: false
		//引用类型: null
		
		//5. 一维数组的内存解析
		String[] strs = new String[5];
		strs[2] = "Tom";
		strs = new String[3];
		       
	}
}
