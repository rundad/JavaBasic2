package com.atguigu.exercise2;
/**
 * 
 * @Description 测试类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月11日下午12:47:32
 *
 */
public class BoyGirlTest {
	public static void main(String[] args) {
		
		Boy boy = new Boy("罗密欧", 21);
		boy.shout();
		
		Girl girl = new Girl("朱丽叶", 18);
		girl.marry(boy);
		
		Girl girl1 = new Girl("祝英台", 19);
		int compare = girl.compare(girl1);
		if(compare > 0) {
			System.out.println(girl.getName() + "大");
		}else if(compare < 0) {
			System.out.println(girl1.getName() + "大");
		}else {
			System.out.println("一样大");
		}
	
	}
}
