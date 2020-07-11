package com.atguigu.p2.ui;

import com.atguigu.p2.bean.Customer;
import com.atguigu.p2.service.CustomerList;
import com.atguigu.p2.util.CMUtility;

/**
 * 
 * @Description 客户信息管理软件视图：View
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月14日下午12:48:52
 *
 */
public class CustomerView {
	
	CustomerList customerList = new CustomerList(10);
	
	public CustomerView() {
		Customer customer = new Customer("测试", '男', 18, "2323235234", "2342342323@qq.com");
		customerList.addCustomer(customer);
	}
	
	public static void main(String[] args) {
		CustomerView cv = new CustomerView();
		cv.enterMenuSelection();
		
	}
	
	public void enterMenuSelection() {
		
		boolean isFlag = true;
		while(isFlag) {
			System.out.println("\n---------客户信息管理软件---------");
			System.out.println("           1. 添加客户");
			System.out.println("           2. 修改客户");
			System.out.println("           3. 删除客户");
			System.out.println("           4. 客户列表");
			System.out.println("           5. 退出");
			System.out.print("         请选择(1-5): ");
			
			char menu_selection = CMUtility.readMenuSelection();
			switch (menu_selection){
			case '1':
				addCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listCustomers();
				break;
			case '5':
				System.out.print("是否确认退出(Y/N)： ");
				char quit = CMUtility.readConfirmSelection();
				if(quit == 'Y') {
					System.out.println("退出成功， 感谢您使用客户信息管理软件");
					isFlag = false;
				}
			}
		}
		
	}
	
	public void addCustomer() {//添加客户
		System.out.println("\n--------添加客户--------");
		System.out.print("姓名: ");
		String name = CMUtility.readString(4);
		System.out.print("性别: ");
		char gender = CMUtility.readChar();
		System.out.print("年龄: ");
		int age = CMUtility.readInt();
		System.out.print("电话号码: ");
		String phone = CMUtility.readString(11);
		System.out.print("电子邮箱: ");
		String email = CMUtility.readString(30);
		
		Customer cust = new Customer(name, gender, age, phone, email);
		boolean isAdded = customerList.addCustomer(cust);
		if(isAdded) {
			System.out.println("--------添加成功--------");
		}else {
			System.out.println("--------添加失败， 客户目录已满--------");
		}
	}
	
	public void deleteCustomer() {//删除客户
		System.out.println("\n--------删除客户--------");
		int cust_id;
		for(;;) {
			System.out.print("请选择客户编号(-1退出): ");
			cust_id = CMUtility.readInt();
			
			if(cust_id == -1) {
				return;
			}
			
			Customer cust = customerList.getCustomer(cust_id - 1);
			if(cust == null) {
				System.out.println("客户编号无效， 无法找到客户信息");
			}else {
				break;
			}
		}
		
		System.out.print("是否确认删除(Y/N): ");
		char delete_check = CMUtility.readConfirmSelection();
		if(delete_check == 'Y') {
			boolean isDeleted = customerList.deleteCustomer(cust_id - 1);
			if(isDeleted) {
				System.out.println("--------删除成功--------");
			}
		}
	}
	
	public void listCustomers() {//列出所有客户
		System.out.println("\n--------客户列表--------");
		Customer[] customers = customerList.listAllCustomers();
		
		if(customerList.getTotal() == 0) {
			System.out.println("没有客户记录!");
		}else {
			System.out.println("编号\t名字\t性别\t年龄\t电话号码\t\t电子邮箱");
			for(int i = 0; i < customers.length; i++) {
				Customer cust = customers[i];
				System.out.println((i + 1) + "\t" + cust.getName() + "\t" + 
						cust.getGender() + "\t" + cust.getAge() + "\t" + cust.getPhone() + 
						"\t" + cust.getEmail());
			}
		}
		System.out.println("--------客户列表完成--------");
	}
	
	public void modifyCustomer() {
		System.out.println("\n--------修改客户信息--------");
		int cust_id;
		Customer cust;
		for(;;) {
			System.out.print("请选择客户编号(-1退出): ");
			cust_id = CMUtility.readInt();
			
			if(cust_id == -1) {
				return;
			}
			
			cust = customerList.getCustomer(cust_id - 1);
			if(cust == null) {
				System.out.println("客户编号无效， 无法找到客户信息");
			}else {
				break;
			}
		}
		
		System.out.print("姓名(" + cust.getName() + "): ");
		String name = CMUtility.readString(4, cust.getName());
		System.out.print("性别(" + cust.getGender() + "): ");
		char gender = CMUtility.readChar(cust.getGender());
		System.out.print("年龄(" + cust.getAge() + "): ");
		int age = CMUtility.readInt(cust.getAge());
		System.out.print("电话号码(" + cust.getPhone() + "): ");
		String phone = CMUtility.readString(11, cust.getPhone());
		System.out.print("电子邮箱(" + cust.getEmail() + "): ");
		String email = CMUtility.readString(30, cust.getEmail());
		
		Customer customer = new Customer(name, gender, age, phone, email);
		boolean isReplaced = customerList.replaceCustomer(cust_id - 1, customer);
		if(isReplaced) {
			System.out.println("-------修改完成--------");
		}
	}
}

