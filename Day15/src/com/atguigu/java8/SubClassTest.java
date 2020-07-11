package com.atguigu.java8;
/**
 * 
 * @Description 
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月20日上午9:26:55
 *
 */
public class SubClassTest {
	public static void main(String[] args) {
		SubClass s = new SubClass();
//		s.method01();
		//知识点1：接口中定义的静态方法， 只能通过接口来调用
		CompareA.method01();
		//知识点2：通过实现类的对象， 可以调用接口中的默认方法
		//如果实现类重写了接口中的默认方法， 调用时， 仍然调用的是重写以后的方法
		s.method02();
		//知识点3：如果子类(实现类)继承了父类 和 实现的接口中声明了同名同参数的方法
		//那么子类在没有重写此方法时， 默认调用的是父类中的同名同参数的方法 -->类优先原则
		//知识点4：如果实现类实现了多个接口， 而这多个接口中定义了同名同参数的默认方法
		//那么在实现类没有重写此方法的情况下， 报错 --> 接口冲突
		//这就需要我们必须在实现类重写此方法
		s.method03();
	}
}

class SubClass extends SuperClass implements CompareA, CompareB{
	
	@Override
	public void method02() {
		System.out.println("SubClass: 上海");
	}

	@Override
	public void method03() {
		System.out.println("SubClass: 深圳");
	}
	
	//知识点5：如何在子类(或实现类)的方法中调用父类， 接口中被重写的方法
	public void myMethod() {
		method03();//自己定义的重写的方法
		super.method03();//调用的是父类中声明的
		//调用接口中的默认方法
		CompareA.super.method03();
		CompareB.super.method03();
	}
}
