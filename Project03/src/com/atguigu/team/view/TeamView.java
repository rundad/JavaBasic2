package com.atguigu.team.view;
/**
 * 
 * @Description 
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月22日上午10:47:08
 *
 */

import com.atguigu.team.domain.*;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamException;
import com.atguigu.team.service.TeamService;

public class TeamView {

	private TeamService teamSvc = new TeamService();
	private NameListService listSvc = new NameListService();
	
	public void enterMainMenu() {
		
		boolean loopFlag = true;
		char selected_option = 0;
		
		while(loopFlag) {
			if(selected_option != '1') {
				listAllEmployees();
			}
			
			System.out.print("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请选择(1-4): ");
			selected_option = TSUtility.readMenuSelection();
			switch(selected_option) {
			case '1':
				getTeam();
				break;
			case '2':
				addMember();
				break;
			case '3':
				deleteMember();
				break;
			case '4':
				System.out.print("\n请确认是否退出(Y/N)：");
				char quit = TSUtility.readConfirmSelection();
				if(quit == 'Y') {
					loopFlag = false;
					System.out.println("感谢您使用开发团队成员调度软件！");
				}
				break;
				
			}
		}
		
	}
	
	/**
	 * 
	 * @Description 显示所有的员工信息
	 * @author runda
	 * @date 2020年6月22日上午10:54:11
	 */
	public void listAllEmployees() {
		System.out.println("\n-----------------------------------开发团队调度软件-----------------------------------");
		System.out.println("\nID\t姓名\t年龄\t工资\t职位\t状态\t奖金\t股票\t领用设备");
		Employee[] employees = listSvc.getAllEmployees();
		for(int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
		System.out.println("--------------------------------------------------------------------------------------");
	}
	
	/**
	 * 
	 * @Description 
	 * @author runda
	 * @date 2020年6月22日上午11:22:55
	 */
	public void getTeam() {
		System.out.println("\n---------------团队成员列表-------------");
		Programmer[] team = teamSvc.getTeam();
		if(team == null || team.length == 0) {
			System.out.println("\n开发团队目前没有成员!");
		}else {
			System.out.println("\nTID/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
			for(int i = 0; i < team.length; i++) {
				System.out.println(team[i].getDetailsForTeam());
			}
		}
		System.out.println("---------------------------------------");
	}
	
	public void addMember() {
		System.out.println("--------------------添加成员--------------------");
		System.out.print("请输入要添加的员工ID：");
		int id = TSUtility.readInt();
		Employee employee;
		try {
			employee = listSvc.getEmployee(id);
			teamSvc.addMember(employee);
			System.out.println("添加成功");
		} catch (TeamException e) {
			// TODO Auto-generated catch block
			System.out.println("添加失败，原因：" + e.getMessage());
		}
		//按回车键继续....
		TSUtility.readReturn();
	}
	
	public void deleteMember() {
		System.out.println("\n-----------------------删除成员---------------------");
		System.out.print("请输入要删除员工的TID: ");
		int team_Id = TSUtility.readInt();
		
		System.out.print("请确认是否删除(Y/N)：");
		char isDelete = TSUtility.readConfirmSelection();
		
		if(isDelete == 'N') {
			return;
		}
		
		try {
			teamSvc.removeMember(team_Id);
			System.out.println("删除成功");
		} catch (TeamException e) {
			System.out.println("删除失败，原因：" + e.getMessage());
		}
		//按回车键继续....
		TSUtility.readReturn();
	}
	
	public static void main(String[] args) {
		TeamView view = new TeamView();
		view.enterMainMenu();
	}
}
