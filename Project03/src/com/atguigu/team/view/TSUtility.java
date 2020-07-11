package com.atguigu.team.view;

import java.util.Scanner;

/**
 * 
 * @Description 项目中提供了TSUility.java类， 可用来方便地实现键盘访问
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月21日下午12:38:46
 *
 */
public class TSUtility {
	private static Scanner scanner = new Scanner(System.in);
	
	/**
	 * 
	 * @Description 该方法读取键盘，如果用户输入"1"-"4"中的任意字符， 则方法返回， 返回值为用户输入的字符
	 * @author runda
	 * @date 2020年6月21日下午12:39:54
	 * @return
	 */
	public static char readMenuSelection() {
		char c;
		for(;;) {
			String str = readKeyBoard(1, false);
			c = str.charAt(0);
			if(c != '1' && c != '2' && c != '3' && c != '4') {
				System.out.print("菜单选项无效， 请重新选择(1-4)：");
				continue;
			}
			break;
		}
		return c;
	}
	
	/**
	 * 
	 * @Description 该方法提示并等待，知道用户按回车键后返回
	 * @author runda
	 * @date 2020年6月21日下午12:57:56
	 */
	public static void readReturn() {
		System.out.println("按回车继续....");
		readKeyBoard(100, true);
	}
	
	/**
	 * 
	 * @Description 该方法从键盘读取一个长度不超过2位的整数，并将其作为方法的返回值
	 * @author runda
	 * @date 2020年6月21日下午12:59:58
	 * @return
	 */
	public static int readInt() {
		int n;
		for(;;) {
			String str = readKeyBoard(2, false);
			try {
				n = Integer.parseInt(str);
				break;
			}catch(NumberFormatException e) {
				System.out.print("输入错误， 请重新输入：");
			}
		}
		return n;
	}
	

	/**
	 * 
	 * @Description 从键盘读取'Y'或'N' 并将其作为方法的返回值
	 * @author runda
	 * @date 2020年6月21日下午1:09:36
	 * @return Y - Yes, N - No
	 */
	public static char readConfirmSelection() {
		char c;
		for(;;) {
			String str = readKeyBoard(1, false).toUpperCase();
			c = str.charAt(0);
			if(c == 'Y' || c == 'N') {
				break;
			}else {
				System.out.print("选择错误，请重新输入(Y/N)：");
			}
		}
		return c;
	}
	
	/**
	 * 
	 * @Description 从键盘读取字符串，检查长度是是否合法，并将其作为方法的返回值
	 * @author runda
	 * @date 2020年6月21日下午1:10:08
	 * @param limit
	 * @param isBlank
	 * @return
	 */
	private static String readKeyBoard(int limit, boolean isBlank) {
		String line = "";
		
		while(scanner.hasNextLine()) {
			line = scanner.nextLine();
			if(line.length() == 0) {
				if(isBlank) return line;
				else System.out.print("输入长度不能为0， 请重新输入：");continue;
			}
			
			if(line.length() < 1 || line.length() > limit) {
				System.out.print("输入长度不能大于(" + limit + "), 请重新输入: ");
				continue;
			}
			break;
			
		}
		return line;
	}
}
