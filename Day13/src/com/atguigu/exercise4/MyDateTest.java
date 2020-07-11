package com.atguigu.exercise4;
/**
 * 
 * @Description 
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月18日上午9:47:55
 *
 */
public class MyDateTest {
	public static void main(String[] args) {
		MyDate m1 = new MyDate(14, 3, 1976);
		MyDate m2 = new MyDate(14, 3, 1976);
		if(m1 == m2) {
			System.out.println("m1 == m2");
		}else {
			System.out.println("m1 != m2");
		}
		
		if(m1.equals(m2)) {
			System.out.println("m1 is equal to m2");
		}else {
			System.out.println("m2 is not equal to m2");
		}
	}
}

class MyDate{
	private int day;
	private int month;
	private int year;
	public MyDate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj instanceof MyDate) {
			MyDate other = (MyDate)obj;
			
			return this.day == other.day && this.month == other.month 
					&& this.year == other.year;
		}
		
		return false;
	}
	
}