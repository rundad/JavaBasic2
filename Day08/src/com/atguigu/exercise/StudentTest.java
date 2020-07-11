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
 */
//测试类
public class StudentTest {
	public static void main(String[] args) {
		//声明Student类型的数组
		Student[] students = new Student[20];
		
		for(int i = 0; i < students.length; i++) {
			//给数组元素赋值
			students[i] = new Student();
			//给Student对象的属性赋值
			students[i].number = (i + 1);
			//年级， [1, 6]
			students[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
			//成绩，[0, 100]
			students[i].score = (int)(Math.random() * (100 - 0 + 1));

		}
		//遍历学生数组
		for(int i = 0; i < students.length; i++) {
			students[i].printInfo();
		}
		
		System.out.println("---------------------------------");
		//问题一： 打印出3年级(state为3)的学生信息
		for(int i = 0; i < students.length; i++) {
			if(students[i].state == 3) {
				students[i].printInfo();				
			}
		}
		
		//问题二： 使用冒泡排序按学生成绩排序， 并遍历所有学生信息
		for(int i = 0; i < students.length - 1; i++) {
			for(int j = 0; j < students.length - i - 1; j++) {
				if(students[j].score > students[j + 1].score) {
					Student tempStu = students[j];
					students[j] = students[j + 1];
					students[j + 1] = tempStu;
				}
			}
		}
		
		//遍历学生数组
		for(int i = 0; i < students.length; i++) {
			students[i].printInfo();
		}
	}
}

//学生类
class Student{
	int number;
	int state;
	int score;
	
	public void printInfo() {
		System.out.println(state + "级的学生，" + " 学号：" + number + "的成绩为：" + score);
	}
}
