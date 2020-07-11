package com.atguigu.java;
/**
 * 
 * @Description 数组的冒泡排序的实现
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月19日上午11:21:02
 *
 * 冒泡排序基本思想： 通过对待排序序列从前往后， 依次比较相邻元素的排序码
 * 若发现逆序则交换， 使排序码较大的元素逐渐往前部移向后部
 * 
 * 因为排序的过程中， 各元素不断接近自己的位置， 如果一趟比较下来没有进行过交换， 就说明有序
 * 因此要在排序过程中 设置一个标志swap判断元素是否进行过交换， 从而减少不必要的比较
 * 
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = new int[] {43, 32, 76, -98, 0, 64, 33, -21, 32, 99};
		
		//冒泡排序
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
	}
}
