package com.atguigu.java;
/**
 * 
 * @Description 抽象类的匿名子类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月19日下午1:21:01
 *
 */
public class PersonTest {
	public static void main(String[] args) {
		
		method(new Student());//匿名对象
		
		Worker workder = new Worker();
		method1(workder);//非匿名的类 非匿名的对象
		
		method1(new Worker());//非匿名的类， 匿名的对象
		
		//创建了一个匿名子类的对象, p
		Person p = new Person() {

			@Override
			public void eat() {
				System.out.println("吃东西");
			}

			@Override
			public void breath() {
				System.out.println("呼吸");
			}
			
		};
		
		method1(p);
		
		//创建一个匿名子类的匿名对象
		method1(new Person() {

			@Override
			public void eat() {
				System.out.println("好好吃东西");
			}

			@Override
			public void breath() {
				System.out.println("好好呼吸");
			}
			
		});
	}
	
	public static void method1(Person p) {
		p.eat();
		p.breath();
	}
	
	public static void method(Student s) {
		
	}
}


class Worker extends Person{
	@Override
	public void breath() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}