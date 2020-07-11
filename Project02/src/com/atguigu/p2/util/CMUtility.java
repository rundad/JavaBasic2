package com.atguigu.p2.util;

import java.util.Scanner;

/**
 * 
 * @Description 工具类, 将不同的功能封装为方法， 就是可以直接通过调用方法使用它的功能， 而无需考虑具体的功能实现细节
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月12日下午2:17:01
 *
 */
public class CMUtility {
	private static Scanner scanner = new Scanner(System.in);
	
	/**
	 * 
	 * @Description 用于界面菜单的选择， 该方法读取键盘， 如果用户输入'1' - '5'的任意字符， 则方法返回
	 * 返回值为用户输入的字符
	 * @author runda
	 * @date 2020年6月12日下午2:51:20
	 * @return
	 */
	public static char readMenuSelection() {
		char c;
		for(;;) {
			String str = readKeyBoard(1, false);
			c = str.charAt(0);
			if(c != '1' && c != '2' && c != '3' && c != '4' && c != '5') {
				System.out.print("选择错误， 请重新输入：");
			}else {
				break;
			}
		}
		return c;
	}
	
	public static char readChar() {
		String str = readKeyBoard(1, false);
		return str.charAt(0);
	}
	
	/**
	 * 
	 * @Description 从键盘读取一个字符， 并将其作为方法的返回值
	 * 如果用户不输入字符而字节回车， 方法将以defaultValue作为返回值
	 * @author runda
	 * @date 2020年6月12日下午2:45:52
	 * @param defaultValue
	 * @return
	 */
	public static char readChar(char defaultValue) {
		String str = readKeyBoard(1, true);
		return (str.length() == 0)? defaultValue : str.charAt(0);
	}
	
	/**
	 * 
	 * @Description 从键盘读取一个长度不超过2位的整数， 并将其作为方法的返回值
	 * @author runda
	 * @date 2020年6月12日下午2:29:25
	 * @return n: int
	 */
	public static int readInt() {
		int n;
		for(;;) {
			String str = readKeyBoard(2, false);
			try {
				n = Integer.parseInt(str);
				break;
			}catch(NumberFormatException e){
				System.out.print("数字输入错误， 请重新输入：");
			}
		}
		return n;
	}
	
	/**
	 * 
	 * @Description 从键盘读取一个长度不超过2位的整数， 并将其作为方法的返回值
	 * 如果用户不输入字符而字节回车， 方法将以defaultValue作为返回值
	 * @author runda
	 * @date 2020年6月12日下午2:29:25
	 * @return n: int
	 */
	public static int readInt(int defaultValue) {
		int n;
		for(;;) {
			String str = readKeyBoard(2, true);
			if(str.equals("")) {
				return defaultValue;
			}
			try {
				n = Integer.parseInt(str);
				break;
			}catch(NumberFormatException e){
				System.out.print("数字输入错误， 请重新输入：");
			}
		}
		return n;
	}
	
	/**
	 * 
	 * @Description 从键盘读取一个长度不超过limit的字符串， 并将其作为方法的返回值
	 * @author runda
	 * @date 2020年6月12日下午2:31:43
	 * @param limit
	 * @return str
	 */
	public static String readString(int limit) {
		return readKeyBoard(limit, false);
	}
	
	/**
	 * 
	 * @Description 从键盘读取一个长度不超过limit的字符串， 并将其作为方法的返回值
	 * 如果用户不输入字符串而直接回车， 方法将以defaultValue作为返回值
	 * @author runda
	 * @date 2020年6月12日下午2:31:43
	 * @param limit
	 * @return str
	 */
	public static String readString(int limit, String defaultValue) {
		String str = readKeyBoard(limit, true);
		return str.equals("")?defaultValue : str;
	}
	
	/**
	 * 
	 * @Description 用于确认选择的输入，该方法从键盘读取'Y'或'N', 并将其作为方法的返回值
	 * @author runda
	 * @date 2020年6月12日下午2:44:39
	 * @return char - Yes/No
	 */
	public static char readConfirmSelection() {
		char c;
		for(;;) {
			String str = readKeyBoard(1, false).toUpperCase();
			c = str.charAt(0);
			if(c == 'Y' || c == 'N') {
				break;
			}else {
				System.out.print("选择错误，请重新输入");
			}
		}
		return c;
	}
	
	/**
	 * 
	 * @Description 获取键盘输入字符串， 如果字符串长度为0 并且同意返回空， 则返回空字符串
	 * 长度不为0， 检查字符串长度是否合规， 否则请用户重新输入
	 * @author runda
	 * @date 2020年6月12日下午2:40:40
	 * @param limit
	 * @param blankReturn
	 * @return 返回检查后合规的字符串
	 */
	private static String readKeyBoard(int limit, boolean blankReturn) {
		String line = "";
		
		while(scanner.hasNextLine()) {
			line = scanner.nextLine();
			if(line.length() == 0) {
				if(blankReturn) return line;
				else System.out.print("输入长度不能为0， 请重新输入：");continue;
			}
			
			if(line.length() < 1 || line.length() > limit) {
				System.out.print("输入长度(不大于" + limit + ")错误， 请重新输入：");
				continue;
			}
			break;
		}
		return line;
	}
}
