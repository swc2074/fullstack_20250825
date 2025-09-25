package com.company.java010_bank;

import java.util.Scanner;

public class Withdraw {
	
	//상태 : 멤버변수
	
		private UserInfo  userinfo;

		
		// 행위 : 멤버함수
		public Withdraw() { super();  }
		public Withdraw(UserInfo userinfo) { super(); this.userinfo = userinfo; }
		
		
		public void exec() {
			
			//setter / getter 이용해서 사용자에게 입금받기 ###
			Scanner sc = new Scanner(System.in);
			System.out.println("출금할 금액 > ");
			double output = sc.nextDouble();
			this.userinfo.setBalance(this.userinfo.getBalance() - output);
		
			System.out.println("출금을 완료했습니다."); 
			
			
		}
		public UserInfo getUserinfo() {
			return userinfo;
		}
		public void setUserinfo(UserInfo userinfo) {
			this.userinfo = userinfo;
		}
	
		
		@Override
		public String toString() {
			return "Withdraw [userinfo=" + userinfo + "]";
		}
		

}
