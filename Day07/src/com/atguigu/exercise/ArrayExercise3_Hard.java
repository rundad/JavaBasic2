package com.atguigu.exercise;
/**
 * 
 * @Description 回形数格式方阵 
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月17日下午2:55:46
 *
 * 回形数：有四面
 * - - - - ->
 *|- - - -> |
 *|		  | |
 *| 	  |	|
 *| 	  |	|
 *| <- - -| |
 *|<- - - - -
 */
public class ArrayExercise3_Hard {
	public static void main(String[] args) {
		//1. 思路：用一个for循环来输出一边的数据， 一个四个边， 四个for循环
		int n = 5;
		int[][] arr = new int[n][n];
		
		int count = 0;//要显示的数据
		int maxX = n - 1;//x轴的最大下标
		int maxY = n - 1;//y轴的最大下标
		int minX = 0;//x轴的最小下标
		int minY = 0;//y轴的最小下标
		
		while(minX <= maxX) {
			//控制回形针的第一面的数据，上边， 也就是x轴的数据 ----->
			for(int x = minX; x <= maxX; x++) {
				arr[minY][x] = ++count;
			}
			//下一次上边的输出改为在下一行输出
			minY++;//因为是控制x轴的数据， 写了一行就少一行， 所以需要改写y轴来减少行数
			
			//控制后面x轴 的y轴的数据, 回形针的第二面， 右边
			for(int y = minY; y <= maxY; y++) {
				arr[y][maxX] = ++count;
			}
			//下一次右边的输出改为在 左一列 输出
			maxX--;//因为是输出列的数据， 所以减少列数， 改写x轴来减少列数
			
			//回形阵的第三面， 下边， <-----
			for(int x = maxX; x >= minX; x--) {
				arr[maxY][x] = ++count;
			}
			//下一次下边的数据改为 上一行 输出
			maxY--;//x轴，行(row)的数据， 需要改写y轴来减少行数
			
			//回形阵的第四面， 左边， 输出y轴的数据
			for(int y = maxY; y >= minY; y--) {
				arr[y][minX] = ++count;
			}
			//下一次左边的数据改为 右一列输出
			minX++;//因为是y轴， 列的数据， 需要改写x轴来减少列数
		}
		
		//输出二维数组
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
}
