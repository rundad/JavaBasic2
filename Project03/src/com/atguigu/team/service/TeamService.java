package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;

/**
 * 
 * @Description 关于开发团队成员的管理， 添加，删除等
 * @author runda Email: rli666666@gmail.com
 * @version 
 * @date 2020年6月22日上午9:15:57
 *
 */
public class TeamService {
	private static int counter = 1;//给memberId赋值使用
	private final int MAX_NUMBER = 5;//限制开发团队的人数
	private Programmer[] team = new Programmer[MAX_NUMBER];//保存开发团队成员
	private int total;//记录开发团队中实际的人数
	
	public TeamService() {
		super();
	}
	
	/**
	 * 
	 * @Description 获取开发团队中的所有成员
	 * @author runda
	 * @date 2020年6月22日上午9:18:50
	 * @return
	 */
	public Programmer[] getTeam() {
		Programmer[] copy_team = new Programmer[total];
		for(int i = 0; i < copy_team.length; i++) {
			copy_team[i] = team[i];
		}
		return copy_team;
	}
	
	/**
	 * 
	 * @Description 将指定的员工添加到开发团队中
	 * @author runda
	 * @date 2020年6月22日上午9:22:12
	 */
	public void addMember(Employee e) throws TeamException{
		//成员已满， 无法添加
		if(total >= MAX_NUMBER) {
			throw new TeamException("成员已满，无法添加");
		}
		//该成员不是开发人员， 无法添加
		if(!(e instanceof Programmer)) {
			throw new TeamException("该成员不是开发人员， 无法添加");
		}
		//该员工已在本开发团队中
		if(isExist(e)) {
			throw new TeamException("该员工已在本开发团队中");
		}
		//该员工已是某团队成员
		Programmer p = (Programmer)e;//一定不会出现ClassCastException
		if("BUSY".equals(p.getStatus().getName())) {//BUSY是常量， 减少空指针风险
			throw new TeamException("该员工已是某团队成员");
		}else if("VACATION".equals(p.getStatus().getName())) {//VACATION是常量， 减少空指针风险
			throw new TeamException("该员工正在休假， 无法添加");
		}
		//团队中至多只能有一名架构师
		//团队中至多只能有两名设计师
		//团队中至多只能有三名程序员
		
		//获取team中已有成员中架构师，设计师，程序员的人数
		int numOfArch = 0, numOfDes = 0, numOfPro = 0;
		for(int i = 0; i < total; i++) {
			if(team[i] instanceof Architect) {
				numOfArch++;
			}else if(team[i] instanceof Designer) {
				numOfDes++;
			}else if(team[i] instanceof Programmer) {
				numOfPro++;
			}
		}
		if(p instanceof Architect) {
			if(numOfArch >= 1) {
				throw new TeamException("团队中至多只能有一名架构师");
			}
		}else if(p instanceof Designer) {
			if(numOfDes >= 2) {
				throw new TeamException("团队中至多只能有两名设计师");
			}
		}else if(p instanceof Programmer) {
			if(numOfPro >= 3) {
				throw new TeamException("团队中至多只能有三名程序员");
			}
		}
		//添加成功
		team[total++] = p;
		//添加成功后， 员工状态改为BUSY，并赋给员工一个memberId
		p.setMemberId(counter++);
		p.setStatus(Status.BUSY);
	}
	
	/**
	 * 
	 * @Description 查找指定员工是否已在开发团队中
	 * @author runda
	 * @date 2020年6月22日上午9:34:17
	 * @param e 要查找员工
	 * @return
	 */
	private boolean isExist(Employee e) {
		for(int i = 0; i < total; i++) {
			if(team[i].getId() == e.getId()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @Description 从团队中删除成员
	 * @author runda
	 * @date 2020年6月22日上午10:17:36
	 * @param id
	 */
	public void removeMember(int id) throws TeamException{
		int i = 0;
		//找到要删掉的员工， 并把该员工的状态改为FREE 空闲状态
		for(; i < total; i++) {
			if(team[i].getMemberId() == id) {
				team[i].setStatus(Status.FREE);
				break;
			}
		}
	
		//未找到指定memberId的情况
		if(i == total) {
			throw new TeamException("找不到指定的memeberId的员工， 删除失败");
		}
		
		//删除一个数组元素后， 把后面的元素覆盖前面要删掉的元素，达成删除的效果
		for(int j = i + 1; j < total; j++) {
			team[j - 1] = team[j];
		}
		
		team[--total] = null;
		
		
	}
}
