package com.atguigu.java2;
/**
 * 
 * @Description 关键字：Package， Import
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月11日下午3:54:09
 *
 *	1. package关键字的使用
 *		① 为了更好的实现项目中类的管理， 提供包的概念
 *		② 使用package声明 类 或 接口所属的包， 声明在源文件的首行
 *		③ 包， 属于标识符， 遵循标识符的命名规则， 规范(xxxyyyzzz) "见名知意
 *		④ 包， 每 "." 一次， 代表一层文件目录
 *
 *	补充：同一个包下， 不能命名同名的 接口，类
 *		不同的包下， 可以命名同名的接口， 类
 *
 *	主要的包介绍
 *	1. java.lang - 包含一些java语言的核心类， 如String, Math, Integer, System和Thread， 提供常用功能
 *	2. java.net - 包含执行与网络相关的操作的类和接口
 *	3. java.io - 包含能提供多种输入/输出功能的类
 *	4. java.util - 包含一些实用的工具类， 如定义 系统特性， 接口的集合框架类， 使用与日期日历相关的函数
 *	5. java.text - 包含一些java格式化相关的类
 *	6. java.sql - 包含了java进行JDBC数据库编程的相关类/接口
 *	7. java.awt - 包含了构成抽象窗口工具集(abstract window toolkits) 的多个类，
 *	这些类别用来构建和管理应用程序的图形用户界面(GUI)
 *
 *	2. import关键字
 *	import: 导入
 *		① 在源文件中显式的使用import结构导入指定包下的类， 接口
 *		② 声明在包的声明 和 类的声明之间
 *		③ 如果需要导入多个结构， 则并列写出即可
 *		④ 可以使用"xxx.*"的方法， 表示可以导入xxx包下的所有结构
 *		⑤ 如果使用的类 或 接口 是java.lang包下定义的， 则可以省略import结构
 *		⑥ 如果使用的类 或 接口是本包下定义的， 则可以省略import结构
 *		⑦ 如果在源文件中， 使用了不同包下的同名的类， 则必须至少一个类需要以全类名的方式显示
 *		⑧ 使用"xxx.*" 方式表明可以调用xxx包下的所有结构， 但是如果使用的是xxx子包下的结构， 则仍需要显式导入
 *		⑨ import static： 导入指定类或接口中的静态结构： 属性， 方法
 *	
 */
public class PackageImportTest {

}
