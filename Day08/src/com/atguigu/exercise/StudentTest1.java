package com.atguigu.exercise;
/**
 * 
 * @Description 对象数组练习
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年5月26日上午11:46:12
 *
 *	定义类Student， 包含三个属性， 学号number(int), 年级state(int), 成绩score(int)
 *	创建20个学生对象， 学号为1到20， 年级和成绩都有随机数确定
 *	问题一： 打印出3年级(state为3)的学生信息
 *	问题二： 使用冒泡排序按学生成绩排序， 并遍历所有学生信息
 *
 *	提示：生成随机数： Math.random(), 返回值类型double
 *		四舍五入取整： Math.round(double d) 返回值类型long
 *
 *	此代码是对StudentTest.java 的改进， 将操作数组的功能封装到方法中
 *
 */
//测试类
public class StudentTest1 {
	public static void main(String[] args) {
		//声明Student类型的数组
		Student1[] students = new Student1[20];
		
		for(int i = 0; i < students.length; i++) {
			//给数组元素赋值
			students[i] = new Student1();
			//给Student对象的属性赋值
			students[i].number = (i + 1);
			//年级， [1, 6]
			students[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
			//成绩，[0, 100]
			students[i].score = (int)(Math.random() * (100 - 0 + 1));

		}
		
		StudentTest1 test = new StudentTest1();
		//遍历学生数组
		test.print(students);
		
		System.out.println("---------------------------------");
		//问题一： 打印出3年级(state为3)的学生信息
		test.searchState(students, 3);
		System.out.println("---------------------------------");
		
		//问题二： 使用冒泡排序按学生成绩排序， 并遍历所有学生信息
		test.sort(students);
		
		//遍历学生数组
		test.print(students);
		
	}
	
	/**
	 * 
	 * @Description 遍历Student数组的学生信息
	 * @author runda
	 * @date 2020年5月26日下午12:18:24
	 * @param students
	 */
	public void print(Student1[] students) {
		//遍历学生数组
		for(int i = 0; i < students.length; i++) {
			students[i].printInfo();
		}
	}
	
	/**
	 * 
	 * @Description 查找Student数组中指定年级的学生信息
	 * @author runda
	 * @date 2020年5月26日下午12:17:39
	 * @param students
	 * @param state
	 */
	public void searchState(Student1[] students, int state) {
		for(int i = 0; i < students.length; i++) {
			if(students[i].state == state) {
				students[i].printInfo();				
			}
		}
	}
	
	/**
	 * 
	 * @Description 给Student数组排序， 根据学生成绩从小到大
	 * @author runda
	 * @date 2020年5月26日下午12:19:11
	 * @param students
	 */
	public void sort(Student1[] students) {
		for(int i = 0; i < students.length - 1; i++) {
			for(int j = 0; j < students.length - i - 1; j++) {
				if(students[j].score > students[j + 1].score) {
					Student1 tempStu = students[j];
					students[j] = students[j + 1];
					students[j + 1] = tempStu;
				}
			}
		}
	}
}

//学生类
class Student1{
	int number;
	int state;
	int score;
	
	public void printInfo() {
		System.out.println(state + "级的学生，" + " 学号：" + number + "的成绩为：" + score);
	}
}
