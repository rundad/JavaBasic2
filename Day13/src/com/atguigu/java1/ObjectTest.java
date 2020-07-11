package com.atguigu.java1;
/**
 * 
 * @Description java.lang.Object类
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月18日上午8:16:25
 *
 *	1. Object类是所有java类的根父类
 *	2. 如果在类的声明中未使用extends关键字指明其父类， 则默认父类为java.lang.Object类
 *	3. Object类中的功能(属性， 方法)就具有通用性
 *		属性：无
 *		方法：equals() / toString() / getClass() / hashCode() / clone() / finalize()
 *			wait(), notify(), notifyAll() - IO，通讯
 *
 *	4. Object类只声明了一个空参构造器
 *
 *	clone() - 返回一个复制对象， 对象类型为Object
 *	finalize() - garbage collector回收对象"之前"被调用的方法，哪个对象被回收 就调哪个对象的finalize()方法
 *	hasCode() - 对象的哈希值
 *	getClass() - 对象的类
 *
 *	面试题：
 *	final, finally, finalize的区别?
 */
public class ObjectTest {

}
