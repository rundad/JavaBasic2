package com.atguigu.java;
/**
 * 
 * @Description 面向对象的特征一： 封装
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月31日下午12:09:30
 *
 *
 *	1. 讲解封装的重要性
 *	例子：动物的腿数
 *	正常来说， 动物腿数不可能是负数， 但是如果把属性暴露出去的话， 腿数是可能设置为负数的
 *	解决： 需要使用方法来给腿数赋值， 然后在方法内 加上 检查
 *
 *	2. 封装性的体现：
 *	我们将类的属性私有化(private), 同时提供公共的(public)方法 来获取(getXxx)和设置(setXxx)此属性的值
 *	
 *	扩展：封装性的体现：① 如上
 *					 ② 不对外暴露的私有的方法
 *					 ③ 单例模式 ...
 *
 *	3. 封装性的体现， 需要权限修饰符来配合
 *	① Java规定的四种权限(从小到大), private, 缺省, protected, public
 *		private: 类内部：yes， 同一个包：no， 不同包的子类：no， 同一个工程：no
 *		缺省(default): 类内部：yes， 同一个包：yes， 不同包的子类：no， 同一个工程：no
 *		protected: 类内部：yes， 同一个包：yes， 不同包的子类：yes， 同一个工程：no
 *		public: 类内部：yes， 同一个包：yes， 不同包的子类：yes， 同一个工程：yes
 *	② 四种权限可以用来修饰类 和 类的内部结构： 属性， 方法， 构造器， 内部类
 *	③ 具体的： 四种权限都可以用来修饰类的内部结构： 属性， 方法， 构造器， 内部类
 *				修饰类的话： 只能使用：缺省， public
 *
 *	总结封装性：Java提供了四种权限修饰符来 修饰 类 和 类的内部结构， 体现类 和 类的内部结构在被调用时的可见性大小
 *
 */
public class AnimalTest {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.name = "大黄";
		//a.age = 1;
		//a.legs = 4;
		
		a.show();
		
		//
		//a.legs = -4;
		a.show();
		//
		a.setLegs(6);
		a.show();
		//
		a.setLegs(-6);
		a.show();
	}
}

class Animal{
	String name;
	private int age;
	private int legs;//腿的个数
	
	//对属性的设置
	public void setLegs(int l) {
		if(l >= 0 && l % 2 == 0) {
			legs = l;
		}else {
			legs = 0;//或者抛出异常
		}
	}
	
	//因为私有化了legs属性， 无法通过 对象.属性来获得具体数据了，
	//所以我们需要一个get方法来 获取数据
	public int getLegs() {
		return legs;
	}
	
	public void eat() {
		System.out.println("动物进食");
	}
	
	public void show() {
		System.out.println("name = " + name + ", age = " + age + ", legs = " + legs);
	}
	
	//提供关于属性age的get和set方法
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		age = a;
	}
}
