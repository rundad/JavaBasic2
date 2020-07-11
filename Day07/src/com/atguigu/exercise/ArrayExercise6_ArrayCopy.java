package com.atguigu.exercise;
/**
 * 真正的数组的复制
 * @Description  数组的复制， 反转， 查找(线性查找， 二分法查找)
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月17日下午3:42:38
 * 使用简单数组
 * 1. 创建一个名为ArrayExercise5的类， 在main()方法中声明array1和array2两个变量， 他们是int[]类型的数组
 * 2. 使用大括号{} 把array1初始化为8个素数，2, 3, 5, 7, 11, 13, 17, 19
 * 3. 显示array1的内容
 * 4. 复制array2变量等于array1， 修改array2的偶索引元素， 使其等于索引值(如array[0]=0, array[2]=2) 打印出array1
 * 修改题目： 实现真正的array2对array1的数组的复制
 * 
 */

public class ArrayExercise6_ArrayCopy {
	public static void main(String[] args) {//快捷键之一： alt + / 为提示键
		int[] array1, array2;
		array1 = new int[] {2, 3, 5, 7, 11, 13, 17, 19};
		
		//显示array1的内容
		for(int i = 0; i<array1.length; i++) {
			System.out.print(array1[i] + "\t");
		}
		
		//赋值array2变量等于array1
		//不能称作数组的复制， 只是单纯的赋予了array1的地址值 并不是复制
		array2 = new int[array1.length];
		for(int i = 0; i<array2.length; i++) {
			array2[i] = array1[i];
		}
		
		//修改array2中的偶索引元素， 使其等于索引值(如array[0]=0, array[2]=2) 输出array1
		for(int i = 0; i<array2.length; i++) {
			if(i % 2 == 0) {
				array2[i] = i;
			}
		}
		System.out.println();
		//打印array1
		for(int i = 0; i<array1.length; i++) {
			System.out.print(array1[i] + "\t");
		}
		
	}
}
