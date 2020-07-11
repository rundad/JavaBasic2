package com.atguigu.team.junit;

import org.junit.Test;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamException;

/**
 * 
 * @Description 对NameListService类的测试
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月21日下午3:18:58
 *
 */
public class NameListServiceTest {
	
	@Test
	public void testGetAllEmployees() {
		NameListService service = new NameListService();
		Employee[] employees = service.getAllEmployees();
		service.getAllEmployees();
		for(int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
	}
	
	@Test
	public void testGetEmployee() {
		NameListService service = new NameListService();
		int id = 1;
		id = 10;
		try {
			Employee employee = service.getEmployee(id);
			System.out.println(employee);
		} catch (TeamException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
