package com.atguigu.exercise;
/**
 * 
 * @Description 练习
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月26日上午11:32:26
 *
 *	① 编写程序， 声明一个method方法， 在方法中打印一个10*8的*型矩形， 在main方法中调用该方法
 *	② 修改上一个程序， 在method方法中， 除打印一个10*8的*型矩形外， 再计算该矩形的面积
 *	并将其作为方法返回值， 在main方法中调用该方法， 接收返回的面积值并打印
 *
 *	③ 修改上一个程序， 在method方法提供m和n两个参数， 方法中打印一个m*n的*型矩形
 *	并计算该矩形的面积， 将其作为方法的返回值， 在main方法中调用该方法， 接收返回的面积值并打印
 *
 */
public class ExerciseTest3 {
	public static void main(String[] args) {
		ExerciseTest3 test = new ExerciseTest3();
		//① 测试
		//test.method();
		
		//② 测试
//		int area = test.method();
//		System.out.println("面积为：" + area);
		
		//③ 测试
		int area = test.method(12, 10);
		System.out.println("面积为：" + area);
		
	}
	
	//①
//	public void method() {
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j < 8; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
	
	//②
//	public int method() {
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j < 8; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		return 10*8;
//	}
	
	//③
	public int method(int m, int n) {
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		return m * n;
	}
}
