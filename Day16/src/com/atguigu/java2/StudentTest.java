package com.atguigu.java2;
/**
 * 
 * @Description 手动抛出异常 throw
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月21日上午10:40:07
 *
 */
public class StudentTest {

	public static void main(String[] args) {
		try {
			Student s = new Student();
			s.regist(-1001);
			System.out.println(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}
}

class Student{
	private int id;
	
	public void regist(int id){
		if(id > 0) {
			this.id = id;
		}else {
//			System.out.println("您输入的数据非法");
			//手动抛出异常对象
//			throw new RuntimeException("您输入的数据非法");
//			throw new Exception("您输入的数据非法");
			throw new MyException("不能输入负数");
		}
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	
}
