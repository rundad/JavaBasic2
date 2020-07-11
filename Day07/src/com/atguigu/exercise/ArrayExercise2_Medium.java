package com.atguigu.exercise;
/**
 * 
 * @Description 二维数组练习 杨辉三角
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月17日下午1:56:44
 *
 * 提示： 
 * 1.第一行有一个元素， 第n行有n个元素
 * 2. 每一行第一个和最后一个元素为1
 * 3. 从第三行开始， 对于非第一个和最后一个元素 即：
 * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j]
 * 
 */
public class ArrayExercise2_Medium {
	public static void main(String[] args) {
		//1. 声明并初始化二维数组
		int[][] yanghui = new int[10][];
		
		//2.给数组的元素赋值
		for(int i = 0; i<yanghui.length; i++) {
			yanghui[i] = new int[i + 1];
			
			//2.1 给首末元素赋值
			yanghui[i][0] = 1;
			yanghui[i][i] = 1;
			//2.2 给每行的非首末元素赋值
			if(i > 1) {//这里的if statement可以不用写， 因为j = 1， 前面的第0， 1行的长度是大于j的， 循环进不去
				for(int j = 1; j < yanghui[i].length-1; j++) {
					yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
				}
			}
		}
		
		
		//3. 遍历数组
		for(int i = 0; i<yanghui.length; i++) {
			for(int j = 0; j<yanghui[i].length; j++) {
				System.out.print(yanghui[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
