package com.atguigu.exercise2;

/**
 * 
 * @Description 练习
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月15日上午10:24:26
 *
 */
public class Cylinder extends Circle{

	private double length;//高
	
	public Cylinder() {
		length = 1.0;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	//返回圆柱的体积
	public double findVolume() {
		//return Math.PI * getRadius() * getRadius() * getLength();
		return super.findArea() * getLength();//父类有面积的方法， 所以可以直接用findArea()
	}
	
	@Override
	public double findArea() {//返回圆柱的表面积
		return Math.PI * getRadius() * getRadius() * 2 + 
				2 * Math.PI * getRadius() * getLength();
	}
}
