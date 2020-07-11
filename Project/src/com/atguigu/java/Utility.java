package com.atguigu.java;

import java.util.Scanner;

/**
 * Utility工具类
 * 将不同的功能封装为方法， 就是可以直接通过调用方法使用它的功能， 而无需考虑具体的功能实现细节
 * 
 * @author runda
 *
 */
public class Utility {
	private static Scanner scanner = new Scanner(System.in);
	
	/**
	 * 用于界面菜单的选择， 该方法读取键盘， 如果用户输入'1~4'中任意字符 则方法返回
	 * @return 返回用户输入的数字选择 类型为char
	 */
	public static char readMenuSelection() {
		//System.out.println("123");
		char c;
		for(; ; ) {
			String str = readKeyboard(1);
			//System.out.println(str);
			c = str.charAt(0);
			//检查选择是否在范围之内
			if(c != '1' && c != '2' && c != '3' && c != '4') {
				System.out.print("选择错误， 请重新选择");
			}else {
				break;
			}
		}
		return c;
	}
	
	/**
	 * 读取用户输入的金额
	 * 如果输入的为正确数字 则返回， 否则重新输入
	 * @return 返回用户输入的金额
	 */
	public static int readNumber() {
		int n;
		for(; ; ) {
			String str = readKeyboard(4);
			try {
				//把字符串转换成int
				n = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.print("数字输入错误， 请重新输入： ");
			}
			
		}
		return n;
	}
	
	/**
	 * 读取用户在键盘上输入的值
	 * @param limit 输入值的限定长度， 若超过长度， 重新输入
	 * @return 返回输入值
	 */
	private static String readKeyboard(int limit) {
		String line = "";
		
		while(scanner.hasNext()) {
			line = scanner.nextLine();
			if(line.length() < 1 || line.length() > limit) {
				System.out.print("输入长度(不大于" + limit + ")错误， 请重新输入： ");
				continue;
			}
			break;
		}
		
		return line;
	}
	
	/**
	 * 收支明细的说明
	 * @return 返回输入值
	 */
	public static String readString() {
		String str = readKeyboard(8);
		return str;
	}
	
	/**
	 * 确认用户输入的选择， 若输入值为Y或N 则返回该值， 否则重新输入
	 * @return Y/N
	 */
	public static char readConfirm() {
		char c;
		for(; ; ) {
			//读取输入值， 并改写为大写
			String str = readKeyboard(1).toUpperCase();
			//获取输入值的第一个值
			c = str.charAt(0);
			//检查是否是 Y/N
			if(c == 'Y' || c == 'N') {
				break;
			}else {
				System.out.print("选择错误， 请重新输入： ");
			}
		}
		return c;
	}
}
