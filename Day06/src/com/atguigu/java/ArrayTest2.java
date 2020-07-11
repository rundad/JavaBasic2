package com.atguigu.java;

/**
 * 
 * @Description 二维数组的使用 
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月17日上午8:43:37
 * 
 * 1. 理解
 * 对于二维数组的理解， 我们可以看成是一维数组array1又做为另一个一维数组array2的元素而存在
 * 其实， 从数组底层的运行机制来看， 其实没有多维数组
 *
 * 2. 二维数组的使用
 * 		①二维数组的声明和初始化
 * 		②如何调用数组的指定位置的元素
 * 		③如何获取数组的长度
 * 		④如何遍历数组
 * 		⑤数组元素的默认初始化值
 * 		⑥数组的内存解析
 * 
 */
public class ArrayTest2 {
	public static void main(String[] args) {
		//标准
		//1. 二维数组的声明和初始化
		int[] arr = new int[] {1 ,2 ,3};//一维数组
		//静态初始化
		int[][] arr1 = new int[][] {{1, 2, 3}, {4, 5}, {6, 7, 8}};
		//动态初始化
		String[][] arr2 = new String[3][2];
		//动态初始化2
		String[][] arr3 = new String[3][];
		
		//错误的情况
//		String[][] arr4 = new String[][4];
//		String[4][3] arr5 = new String[][];
//		int[][] arr6 = new int[4][3] {{1, 2, 3}, {4, 5}, {6, 7, 8}};
	
		//正确 - 都是正确 但有些变化的二维数组
		int arr4[][] = new int[][] {{1, 2, 3}, {4, 5}, {6, 7, 8}};
		int[] arr5[] = new int[][] {{1, 2, 3}, {4, 5}, {6, 7, 8}};
		
		int arr6[][] = {{1, 2, 3}, {4, 5}};//也是正确的， 类型推断
		int arr7[] = {1, 2, 3}; //类型推断
//		int arr8[];
//		arr8 = {1, 2, 3}//无法推断 因为不在一行
		
		//2. 如何调用数组的指定位置的元素
		System.out.println(arr1[0][1]); //2
		System.out.println(arr2[0][1]);//null
		
		arr3[1] = new String[4];//赋值
		System.out.println(arr3[1][0]);//如果没有赋值则会报错
		
		//3. 获取数组的长度
		System.out.println(arr4.length);//3
		System.out.println(arr4[0].length); //3
		System.out.println(arr4[1].length); //2
		
		//4. 如何遍历二维数组
		for(int i = 0; i<arr4.length; i++) {
			
			for(int j = 0; j<arr4[i].length; j++) {
				System.out.print(arr4[i][j] + "	");
			}
			System.out.println();
		}
		
		
	}
}
