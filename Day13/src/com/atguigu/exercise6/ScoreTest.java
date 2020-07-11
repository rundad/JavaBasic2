package com.atguigu.exercise6;

import java.util.Scanner;
import java.util.Vector;

/**
 * 
 * @Description 包装类练习
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月18日下午12:08:48
 *
 *	利用Vector代替数组处理， 从键盘读入学生成绩(以负数代表输入结束) 找出最高分， 并输出学生成绩等级
 *	提示：数组一旦创建， 长度就固定不变， 所以在创建数组前就需要知道它的长度
 *	而向量类java.util.Vector可以根据需要动态伸缩
 *
 *	创建Vector对象， Vector v = new Vector();
 *	给向量添加元素 v.addElement(Object obj); //obj必须是对象
 *	取出向量中的元素， Object obj = v.elementAt(0);
 *	注意第一个元素的下标是0， 返回值是Object类型的
 *	计算向量的长度: v.size();
 *	若与最高分相差10分内：A等， 20分内：B等，30分内：C等， 其他：D等
 *
 */
public class ScoreTest {
	public static void main(String[] args) {
		//1. 创建Vector对象， 相当于原来的数组
		Vector v = new Vector();
		//2.. 实例化Scanner， 用于从键盘获取学生成绩
		Scanner scanner = new Scanner(System.in);
		
		int max = 0;
		//3. 循环 给Vector中添加元素
		while(true) {
			System.out.print("请输入学生成绩：");
			int score = scanner.nextInt();
			
			//3.2 当输入是负数， 跳出循环
			if(score < 0) {
				break;
			}
			if(score > 100) {
				System.out.println("输入的数据非法， 请重新输入");
				continue;
			}
			//3.1 添加元素操作
			v.addElement(score);//自动装箱
			//4. 获取学生成绩最大值
			if(max < score) {
				max = score;
			}
		}
		
		//5. 遍历Vector， 得到每个学生成绩， 并与最大值比较， 得到每个学生的等级
		char level;
		for(int i = 0; i < v.size(); i++) {
			Object obj = v.elementAt(i);
			//JDK 5.0之前
//			Integer element = (Integer)v.elementAt(i);
//			int score = element.intValue();
			//JDK 5.0之后
			int score = (int)obj;
			if(max - score <= 10) {
				level = 'A';
			}else if(max - score <= 20) {
				level = 'B';
			}else if(max - score <= 30) {
				level = 'C';
			}else {
				level = 'D';
			}
			
			System.out.println("student-" + i + " score is " + score + ", level is " + level);
		}
	}
}
