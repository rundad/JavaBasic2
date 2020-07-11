package com.atguigu.java;
/**
 * 
 * @Description	二维数组的使用 
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月17日上午9:18:44
 *
 *	二维数组分为外层数组的元素， 内层数组的元素
 *	比如： int[][] arr = new int[4][3];
 *	外层元素： arr[0], arr[1]等
 *	内层元素： arr[0][0], arr[1][2]等
 *
 *	⑤数组元素的默认初始化
 *	针对于初始化方式一： 比如 int[][] arr = new int[4][3];
 *		外层元素的初始化值为： 地址值
 *		内层元素的初始化值为： 与一维数组初始化情况相同
 *
 *	针对于初始化方式二： 比如 int[][] arr = new int[4][];
 *		外层元素的初始化值为： null
 *		内层元素的初始化值为： 不能调用， 否则报错
 *
 *	⑥数组的内存解析
 *
 */
public class ArrayTest3 {
	
	public static void main(String[] args) {
		//5.
		int[][] arr = new int[4][3];
		System.out.println(arr[0]);//第一个元素的地址值: [I@15db9742 - 中括号[代表是一维数组, I代表是int， 然后@之后是地址
		System.out.println(arr[0][0]);//第一个元素， 第一个数组里的第一个元素： 0
		System.out.println(arr); //二维数组的地址值 - [[I@6d06d69c - 两个中括号代表二维数组, I代表是int类型, 然后@之后是地址
		
		System.out.println("---------------------------");
		float[][] arr1 = new float[4][3];
		System.out.println(arr1[0]);//第一个元素的地址值: [F@15db9742 - 中括号[代表是一维数组, F代表是float， 然后@之后是地址
		System.out.println(arr1[0][0]); //0.0
		
		System.out.println("---------------------------");
		String[][] arr2 = new String[4][3];
		System.out.println(arr2[1]);//第一个元素的地址值: [Ljava.lang.String;@15db9742 - 中括号[代表是一维数组, 然后@之后是地址
		System.out.println(arr2[1][1]);//null
		
		System.out.println("----------------------------");
		double[][] arr3 = new double[4][];
		System.out.println(arr3[1]);//null, 因为没有赋值， 所以取默认值， 然后数组是引用数据类型， 引用数据类型默认值为null
	}
}
