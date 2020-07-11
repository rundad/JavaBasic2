package com.atguigu.java2;

import java.util.Date;

import org.junit.Test;

/**
 * 
 * @Description Java中的JUnit单元测试
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月18日上午10:38:30
 *
 *	步骤：
 *	1. 选中当前工程 - 右键选择：build path - add libraries - JUnit 5 - 下一步
 *	2. 创建Java类， 进行单元测试
 *		此时的Java类要求： ① 此类是public的 ② 此类提供公共的无参的构造器
 *	3. 此类中声明单元测试方法
 *		此时的单元测试方法， 方法的权限是public, 没有返回值， 没有形参
 *
 *	4. 此单元测试方法上需要声明注解：@Test, 并在单元测试类中导入：import org.junit.test
 *	5. 声明好单元测试方法以后， 就可以在方法体内 测试相关的代码
 *	6. 写完代码以后， 左键双击单元测试方法名， 右键 run as - JUnit Test
 *
 *	说明：
 *	1. 如果执行结果没有任何异常， 绿条
 *	2. 如果执行结果出现异常：红条
 */
public class JunitTest {
	int num = 10;
	
	@Test
	public void testEquals() {
		String s1 = "MM";
		String s2 = "MM";
		System.out.println(s1.equals(s2));
		
		//ClassCastException的异常
		Object obj = new String("GG");
		Date date = (Date)obj;
	}
	
	@Test
	public void testToString() {
		String s2 = "MM";
		System.out.println(s2.toString());
	}
}
