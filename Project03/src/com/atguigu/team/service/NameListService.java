package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Equipment;
import com.atguigu.team.domain.NoteBook;
import com.atguigu.team.domain.PC;
import com.atguigu.team.domain.Printer;
import com.atguigu.team.domain.Programmer;

/**
 * 
 * @Description 负责将Data中的数据封装到Employee[]数组中， 同时提供相关Employee[]的方法
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月21日下午2:03:07
 *
 */
public class NameListService {
	
	private Employee[] employees;
	
	/**
	 * 给employees及数组元素进行初始化
	 */
	public NameListService() {
		employees = new Employee[Data.EMPLOYEES.length];
		
		for(int i = 0; i < employees.length; i++) {
			//获取员工的信息
			int type = Integer.parseInt(Data.EMPLOYEES[i][0]);
			
			//获取Employee的4个基本信息
			int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
			String name = Data.EMPLOYEES[i][2];
			int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
			double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
			
			Equipment equipment;
			double bonus;
			int stock;
			switch(type) {
			case Data.EMPLOYEE:
				employees[i] = new Employee(id, name, age, salary);
				break;
			case Data.PROGRAMMER:
				equipment = createEquipment(i);
				employees[i] = new Programmer(id, name, age, salary, equipment);
				break;
			case Data.DESIGNER:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
				employees[i] = new Designer(id, name, age, salary, equipment, bonus);
				break;
			case Data.ARCHITECT:
				equipment = createEquipment(i);
				bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
				stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
				employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
				break;
			}
		}
	}
	
	/**
	 * 
	 * @Description 获取指定index上的员工的设备
	 * @author runda
	 * @date 2020年6月21日下午2:44:34
	 * @param index
	 * @return
	 */
	private Equipment createEquipment(int index) {
		
		int key = Integer.parseInt(Data.EQUIPMENTS[index][0]);
		Equipment equipment;
		
		String modelOrName = Data.EQUIPMENTS[index][1];
		
		switch(key) {
		case Data.PC://21
			String display = Data.EQUIPMENTS[index][2];
			return new PC(modelOrName, display);

		case Data.NOTEBOOK://22
			double price = Double.parseDouble(Data.EQUIPMENTS[index][2]);
			return new NoteBook(modelOrName, price);

		case Data.PRINTER://23
			String type = Data.EQUIPMENTS[index][2];
			return new Printer(modelOrName, type);
		
		}
		return null;

	}
	
	/**
	 * 
	 * @Description 获取当前所有员工
	 * @author runda
	 * @date 2020年6月21日下午3:12:40
	 * @return
	 */
	public Employee[] getAllEmployees() {
		return employees;
	}
	
	/**
	 * 
	 * @Description 获取指定的员工
	 * @author runda
	 * @date 2020年6月21日下午3:12:56
	 * @param id
	 * @return
	 */
	public Employee getEmployee(int id) throws TeamException{
		for(int i = 0; i < employees.length; i++) {
			if(employees[i].getId() == id) {
				return employees[i];
			}
		}
		
		throw new TeamException("找不到指定的员工");
	}
}
