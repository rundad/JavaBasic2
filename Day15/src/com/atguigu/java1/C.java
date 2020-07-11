package com.atguigu.java1;

interface A{
	int x = 0;
}

class B{
	int x = 1;
}

public class C extends B implements A{
	public void pX() {
		//因为类和接口是并列关系， 所以编译器这里不知道是哪个x， 所以报错
//		System.out.println(x);//如果接口A是间接父类关系， 那么我们可以拿到直接父类 B的x(就近原则)
		System.out.println(super.x);//1, 拿到父类的x
		System.out.println(A.x);//0, 全局常量， 直接调用x即可
	}
	
	public static void main(String[] args) {
		new C().pX();
	}
}
