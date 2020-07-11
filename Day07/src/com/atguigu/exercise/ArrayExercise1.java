package com.atguigu.exercise;
/**
 * 
 * @Description 数组练习 1 
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月17日下午1:43:28
 *
 */
public class ArrayExercise1 {
	public static void main(String[] args) {
		int[][] arr = new int[][] {{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
		
		int sum = 0;//记录总和
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("总和为： " + sum);
	}
}
