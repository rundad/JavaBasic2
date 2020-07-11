package com.atguigu.java2;

public class Son extends Father{
	static {
		System.out.println("44444444444444444");
	}
	{
		System.out.println("55555555555555555");
	}
	public Son() {
		System.out.println("6666666666666666666");
	}
	
	public static void main(String[] args) {
		System.out.println("777777777777");
		System.out.println("***************");
		new Son();
		System.out.println("***************");
		
		new Son();
		System.out.println("******************");
		new Father();
	}
}

class Father{
	static {
		System.out.println("111111111111111111111");
	}
	{
		System.out.println("22222222222222222222");
	}
	public Father() {
		System.out.println("3333333333333333333");
	}
}
