package com.atguigu.java8;
/**
 * 
 * @Description JDK8 接口的新特性
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月20日上午9:22:30
 *
 *	JDK8， 接口除了定义全局常量和抽象方法之外， 还可以定义静态方法， 默认方法
 */
public interface CompareA {
	//静态方法
	public static void method01() {
		System.out.println("CompareA: 北京");
	}
	
	//默认方法
	public default void method02() {
		System.out.println("CompareA: 上海");
	}
	
	//因为接口中的所有方法， 不管抽象方法也好，静态方法也好， 全局常量也好 都是public的
	//因此我们可以省略public
	default void method03() {
		System.out.println("");
	}
}
