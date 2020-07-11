package com.atguigu.exercise;
/**
 * 
 * @Description 微软出现过的题
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月30日上午11:59:23
 *
 */
public class TrickyExercise1 {
	public static void main(String[] args) {
		//定义一个int型数组, 让数组每个位置上的值 去 除以首位置的元素， 得到的结果
		//作为该位置上的新值， 遍历新的数组
		int[] arr= new int[] {12, 3, 3, 34, 56, 77, 432};
		
		//错误写法
		//原因： 因为每个元素要除以 首元素， 
		//但如果一开始就处理首元素 - 首元素/首元素 就会得到1， 
		//那么后面除以的首元素就会不同， 全部都会除以1
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / arr[0];
		}
		
		//正确写法一
		//思路： 从后面开始处理， 到最后再处理首元素， 推荐写法
		for(int i = arr.length - 1; i >= 0; i++) {
			arr[i] = arr[i] / arr[0];
		}
		
		//正确写法二
		//思路： 在未处理首元素之前， 拿出首元素值
		//使用该数值来做遍历处理，那么首元素处理后 也不会出现错误， 比正确写法一 多一个需要开辟的变量
		int temp = arr[0];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / temp;
		}
	}
}
