package com.atguigu.java2;
/**
 * 
 * @Description 
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月20日下午12:00:47
 *
 */
public class InnerClassTest1 {
	
	//开发中很少见
	public void method() {
		//局部内部类
		class AA{
			
		}
	}
	
	//返回一个实现了Comparable接口的类的对象
	public Comparable getComparable() {
		
		//创建一个实现了Comparable接口的类； 局部内部类
		//方式一
//		class MyComparable implements Comparable{
//			@Override
//			public int compareTo(Object o) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		}
//		
//		return new MyComparable();
		
		return new Comparable() {

			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
	}
}
