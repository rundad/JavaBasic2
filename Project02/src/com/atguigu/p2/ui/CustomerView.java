package com.atguigu.p2.ui;

import com.atguigu.p2.bean.Customer;
import com.atguigu.p2.service.CustomerList;
import com.atguigu.p2.util.CMUtility;

/**
 * 
 * @Description CustomerView为主模块， 负责菜单的显示和处理用户操作
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月12日下午2:20:46
 *
 */
public class CustomerView {
	
	private CustomerList customerList = new CustomerList(10);
	
	public CustomerView() {
		//初始数据
		Customer customer = new Customer("王涛", '男', 23, "13112341234", "wt@gmail.com");
		customerList.addCustomer(customer);
	}
	
	public static void main(String[] args) {
		CustomerView customerView = new CustomerView();
		customerView.enterMainMenu();
	}
	
	/**
	 * 
	 * @Description 显示客户信息管理软件界面的方法
	 * @author runda
	 * @date 2020年6月12日下午4:12:17
	 */
	public void enterMainMenu() {
		
		boolean isFlag = true;
		while(isFlag) {
			System.out.println("\n--------------------客户信息管理软件-------------------");
			System.out.println("                      1. 添加客户");
			System.out.println("                      2. 修改客户");
			System.out.println("                      3. 删除客户");
			System.out.println("                      4. 客户列表");
			System.out.println("                      5. 退	  出\n");
			System.out.print("                    请选择(1-5): ");
			
			char menu_selection = CMUtility.readMenuSelection();
			switch(menu_selection) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modiftCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5':
				System.out.print("是否确认退出(Y/N): ");
				char quit = CMUtility.readConfirmSelection();
				if(quit == 'Y') {
					System.out.println("退出成功！");
					isFlag = false;
				}
				
			}
			
		}
		
	}
	
	/**
	 * 
	 * @Description 添加客户的操作
	 * @author runda
	 * @date 2020年6月12日下午4:10:49
	 */
	private void addNewCustomer() {
		System.out.println("\n-----添加客户-----");
		System.out.print("姓名：");
		String name = CMUtility.readString(4);
		System.out.print("性别：");
		char gender = CMUtility.readChar();
		System.out.print("年龄：");
		int age = CMUtility.readInt();
		System.out.print("电话：");
		String phone = CMUtility.readString(11);
		System.out.print("邮箱：");
		String email = CMUtility.readString(20);
		
		Customer cust = new Customer(name, gender, age, phone, email);
		
		boolean result = customerList.addCustomer(cust);
		if(result) {
			System.out.println("-----添加成功-----");
		}else {
			System.out.println("-----客户目录已满， 添加失败!-----");
		}
		
		
	}
	
	/**
	 * 
	 * @Description 修改客户的操作 
	 * @author runda
	 * @date 2020年6月12日下午4:10:59
	 */
	private void modiftCustomer() {
		System.out.println("\n-----修改客户信息-----");
		Customer cust;
		int id;
		for(;;) {
			System.out.print("请选择修改客户编号(-1退出): ");
			id = CMUtility.readInt();//用户输入的客户编号
			if(id == -1) {
				return;
			}
			
			cust = customerList.getCustomer(id - 1);//找相应编号的客户
			if(cust == null) {//没有找到
				System.out.println("编号无效，无法找到指定用户!");
			}else {//找到了相应编号的客户
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
		
		System.out.print("邮箱(" + cust.getEmail() + "): ");
		String email = CMUtility.readString(20, cust.getEmail());

		Customer newCust = new Customer(name, gender, age, phone, email);
		boolean isReplaced = customerList.replaceCustomer(id - 1, newCust);
		if(isReplaced) {
			System.out.println("------修改完成------");
		}else {
			System.out.println("------修改失败------");
		}
		
	}
	
	/**
	 * 
	 * @Description 删除客户的操作
	 * @author runda
	 * @date 2020年6月12日下午4:11:12
	 */
	private void deleteCustomer() {
		System.out.println("------删除客户------");
		int id;
		for(;;) {
			System.out.print("请选择待删除客户编号(-1退出): ");
			id = CMUtility.readInt();//读取用户输入的编号
			if(id == -1) {//编号为-1时， 退出删除服务
				return;
			}
			
			Customer cust = customerList.getCustomer(id - 1);//找相应编号的客户
			if(cust == null) {//没有找到
				System.out.println("编号无效，无法找到指定用户!");
			}else {//找到了相应编号的客户
				break;
			}
		}
		
		System.out.print("是否确认删除(Y/N): ");
		char delete_selection = CMUtility.readConfirmSelection();
		if(delete_selection == 'Y') {
			boolean isDeleted = customerList.deleteCustomer(id - 1);
			if(isDeleted) {
				System.out.println("------删除成功------");
			}else {
				System.out.println("------删除失败------");
			}
			
		}else {
			return;
		}
	}
	
	/**
	 * 
	 * @Description 显示客户列表的操作
	 * @author runda
	 * @date 2020年6月12日下午4:11:58
	 */
	private void listAllCustomers() {
		System.out.println("--------------------客户信息管理软件-------------------\n");
		Customer[] customers = customerList.getAllCustomers();
		
		int total = customerList.getTotal();
		if(total == 0) {
			System.out.println("没有客户记录！");
		}else {
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
			for(int i = 0; i < customers.length; i++) {
				Customer cust = customers[i];
				System.out.println((i + 1) + "\t" + cust.getName() + "\t" + cust.getGender() + 
						"\t" + cust.getAge() + "\t" + cust.getPhone() + "\t" + cust.getEmail());
				
			}
		}
		
		System.out.println("----------------------客户列表完成--------------------\n");
	}

}
