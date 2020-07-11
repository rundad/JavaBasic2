package com.atguigu.java;
/**
 * 
 * @Description Debug功能测试
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月15日上午10:32:54
 *
 *	如何调试程序
 *	1. System.out.println();
 *	2. Eclipse - Debug调试
 */
public class DebugTest {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		System.out.println("i = " + i + ", j = " + j);
		
		DebugTest test = new DebugTest();
		int max = test.getMax(i, j);
		
		System.out.println("max = " + max);
	}
	
	public int getMax(int k, int m) {//在两个数中找最大数
		int max = 0;
		if(k < m) {
			max = k;
		}else {
			max = m;
		}
		return max;
	}
}
