package com.atguigu.exercise;

import java.util.Scanner;

/**
 * 
 * @Description 数组练习
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年4月17日下午12:57:41
 *	
 *
 * 从键盘读入学生成绩， 找出最高分， 并输出学生成绩等级
 */
public class ArrayDemo02 {
	public static void main(String[] args) {
		//1. 使用Scanner， 读取学生人数
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入学生人数： ");
		int num_student = scanner.nextInt();
		
		//2. 创建数组， 存储学生成绩， 动态初始化
		int[] result_arr = new int[num_student];
		
		//3. 给数组中的元素赋值
		System.out.println("请输入" + num_student + "个成绩： ");
		int maxScore = 0;
		for(int i = 0; i<num_student; i++) {
			result_arr[i] = scanner.nextInt();
			//4. 获取数组中的元素的最大值， 最高分
			if(maxScore < result_arr[i]) {
				maxScore = result_arr[i];
			}
		}
		
		//5. 根据每个学生成绩与最高分的差值， 得到每个学生的等级并输出等级和成绩
		char level;
		for(int i = 0; i<result_arr.length; i++) {
			if(maxScore - result_arr[i] <= 10) {
				level = 'A';
			}else if(maxScore - result_arr[i] <= 20) {
				level = 'B';
			}else if(maxScore - result_arr[i] <= 30) {
				level = 'C';
			}else {
				level = 'D';
			}
			
			System.out.println("Student " + i + " score is " + result_arr[i] + ", grade is " + level);
			
		}
		
	}
}
