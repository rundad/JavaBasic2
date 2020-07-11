package com.atguigu.java;
/**
 * 家庭收支记账软件
 * 
 * @author runda
 *
 */
public class FamilyAccount {
	public static void main(String[] args) {
		//循环控制点
		boolean isFlag = true;
		//收支明细头部
		String details = "收支\t账户金额\t收支金额\t说 明\n";
		//初始金额
		int balance = 10000;
		while(isFlag) {
			System.out.println("----------家庭收支记账软件---------\n");
			System.out.println("           1. 收支明细");
			System.out.println("           2. 登记收入");
			System.out.println("           3. 登记支出");
			System.out.println("           4. 退        出\n");
			System.out.print("             请选择(1~4): ");
			
			//获取用户的选择 1-4
			char selectedNum = Utility.readMenuSelection();
			//System.out.println(selectedNum);
			switch (selectedNum) {
			case '1'://查看明细
				System.out.println("----------当前收支明细记录---------");
				System.out.println(details);
				System.out.println("------------------------------");
				break;
			case '2'://存放， 收入金额
				System.out.print("本次收入金额： ");
				int addMoney = Utility.readNumber();
				System.out.print("本次收入说明： ");
				String addInfo = Utility.readString();
				
				//处理balance
				balance += addMoney;
				
				//处理details， 因为使用字符串， 所以需要拼接， 正常来说数据保存在数据库或文件中
				details += "收入\t" + balance + "\t" + addMoney + " \t" + addInfo + "\n"; 
				System.out.println("-----------登记完成-----------\n");
				break;
			case '3'://支付， 支出金额
				System.out.print("本次支出金额： ");
				int payMoney = Utility.readNumber();
				System.out.print("本次支出说明： ");
				String payInfo = Utility.readString();
				
				//查看金额是否足够支出
				if(balance >= payMoney) {
					balance -= payMoney;
					System.out.println("支付成功");
				}else {
					System.out.println("支出超出账号额度， 支付失败");
				}
				
				//记录支出明细
				details += "支出\t" + balance + "\t" + payMoney + " \t" + payInfo + "\n"; 
				System.out.println("-----------登记完成-----------\n");
				break;
			case '4'://退出操作
				System.out.print("是否确认退出(Y/N)?: ");
				char result = Utility.readConfirm();
				if(result == 'Y') {
					System.out.println("感谢使用家庭收支记账软件， 再见~");
					isFlag = false;
				}

			}
			
		}
	}
}
