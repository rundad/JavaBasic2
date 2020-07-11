package com.atguigu.exercise3;
/**
 * 
 * @Description 
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月20日上午8:54:32
 *
 *	定义一个ComparableCircle类， 继承Circle类并且实现CompareObject接口
 *	在ComparableCircle类中给出接口中方法compareTo的实现体， 用来比较两个圆的半径大小
 */
public class ComparableCircle extends Circle implements CompareObject{

	public ComparableCircle(Double radius) {
		super(radius);
	}

	@Override
	public int compareTo(Object o) {
		if(this == o) {
			return 0;
		}
		if(o instanceof ComparableCircle) {
			ComparableCircle other = (ComparableCircle)o;
			//比较大小 方式一：radius是基本数据类型double
//			if(this.getRadius() > other.getRadius()) {
//				return 1;
//			}else if(this.getRadius() < other.getRadius()) {
//				return -1;
//			}else {
//				return 0;
//			}
			//比较大小 方式二：radius是引用数据类型Double
			return this.getRadius().compareTo(other.getRadius());
		}
		// TODO Auto-generated method stub
		return 0;
	}

}
