package com.atguigu.exercise2;


/**
 * 
 * @Description 测试类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月17日下午6:26:34
 *
 *	定义一个测试类GeometricTest
 *	编写equalsArea方法 测试两个对象的面积是否相等，(注意方法的参数类型， 利用动态绑定技术)
 *	编写displayGeometricObject方法显示对象的面积(注意方法的参数类型， 利用动态绑定技术)
 * 
 */
public class GeometricTest {
	public static void main(String[] args) {
		GeometricTest test = new GeometricTest();
		Circle c1 = new Circle(2.3, "white", 1.0);
		test.displayGeometricObject(c1);
		Circle c2 = new Circle(3.3, "white", 1.0);
		test.displayGeometricObject(c2);
		
		boolean isEquals = test.equalsArea(c1, c2);
		System.out.println("c1 和 c2的面积是否相等：" + isEquals);
		
		MyRectangle rect = new MyRectangle(2.1, 3.4, "Red", 2.0);
		test.displayGeometricObject(rect);
	}
	
	public void displayGeometricObject(GeometricObject o) {
		System.out.println("面积为：" + o.findArea());
	}
	
	//测试两个对象的面积是否相等
	public boolean equalsArea(GeometricObject o1, GeometricObject o2) {
		return o1.findArea() == o2.findArea();
	}
}
