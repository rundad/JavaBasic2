package com.atguigu.exercise;

/**
 * 
 * @Description 算法的考察
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月17日下午3:26:57
 *
 * 定义一个int型的一维数组， 包含10个元素， 分别赋一些随机整数
 * 然后求出所有元素的最大值， 最小值， 和值， 平均值 并输出
 * 要求所有随机数都是两位数
 * [10, 99]
 * 公式： (int)(Math.random() * (99 - 10 + 1) + 10)
 * 
 */
public class ArrayExercise4 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * (99 - 10 + 1) + 10);
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		//求数组元素的最大值
		int maxValue = arr[0];
		for(int i = 0; i< arr.length; i++) {
			if(maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		System.out.println("最大值为：" + maxValue);
		
		//求数组元素的最小值
		int minValue = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		System.out.println("最小值为：" + minValue);
		
		//求数组元素的总和
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("总和为：" + sum);
		
		//求数组元素的平均值
		int avgValue = sum/arr.length;
		System.out.println("平均值为：" + avgValue);
		ArrayExercise4 arrayExercise = new ArrayExercise4();
		arrayExercise.percentageTest();
	}
	
	public void percentageTest() {
		int guessNum = 25;
		int tries = 0;
		for(;;) {
			int randomNum = (int)(Math.random() * (200 - 10 + 1));
			tries++;
			System.out.println("次数: " + tries + ", " + randomNum);
			if(randomNum == guessNum) {
				System.out.println("出了!!");
				break;
			}
		}
			
	}
}
