package com.atguigu.java;
/**
 * 
 * @Description 类 的 属性的使用
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月26日上午10:06:54
 *
 *	属性(成员变量) vs 局部变量
 *	成员变量有默认值， 局部变量没有默认值， 使用前必须赋初始值
 *
 *	1. 相同点
 *		① 定义变量的格式： 数据类型 变量名 = 变量值
 *		② 先声明， 后使用
 *		③ 变量都有其对应的作用域
 *	
 *	2. 不同点
 *		① 在类中声明的位置的不同， 
 *		属性定义在类的一堆{}内
 *		局部变量，声明在方法内， 方法形参， 代码块内， 构造器形参， 构造器内部的变量
 *		
 *		② 关于权限修饰符的不同
 *		属性：可以在声明属性时， 指明其权限， 使用权限修饰符
 *		常用的权限修饰符， private public 缺省-default， protected
 *		局部变量： 不可以使用权限修饰符
 *		
 *		③ 默认初始化值的情况
 *		属性： 类的属性， 根据其类型，都有默认初始化值
 *			整形(byte, short, int, long), 0
 *			浮点型(float, double) 0.0
 *			字符型(char), 0 或 \u0000
 *			布尔型(boolean) false
 *			引用数据类型(类， 数组， 接口)null		
 *		局部变量： 没有默认初始化值
 *			意味着， 我们在调用局部变量之前， 一定要显式赋值
 *			特别地， 形参在调用时 我们赋值即可
 *
 *		④ 在内存中加载的位置
 *		属性： 加载到堆空间中 (非static)
 *		局部变量： 加载到栈空间
 *
 */
public class UserTest {

}

class User{
	//属性 - 成员变量
	private String name;
	public int age;
	boolean isMale;
	
	public void talk(String language) {//language: 形参
		System.out.println("我们使用" + language);
	}
	
	public void eat() {
		String food = "烙饼";//局部变量
		System.out.println("北方人喜欢吃" + food);
	}
	
}