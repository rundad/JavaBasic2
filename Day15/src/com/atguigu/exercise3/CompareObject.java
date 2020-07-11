package com.atguigu.exercise3;
/**
 * 
 * @Description 接口练习
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月20日上午8:48:17
 *
 *	interface CompareObject{
 *		public int compareTo(Object o);
 *	}
 *	//若返回值是0， 代表相等， 若为正数， 代表当前对象大， 负数代表当前对象小
 */
public interface CompareObject {
	//若返回值是0， 代表相等， 若为正数， 代表当前对象大， 负数代表当前对象小
	public int compareTo(Object o);
}
