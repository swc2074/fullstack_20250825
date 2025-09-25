package com.company.java010_bank;

import java.util.Scanner;

public class Deposit {
	
	//상태 : 멤버변수
	
	private UserInfo  userinfo;

	
	// 행위 : 멤버함수
	public Deposit() { super();  }
	public Deposit(UserInfo userinfo) { super(); this.userinfo = userinfo; }
	
	
	public void exec() {
		
		
		//변수 
		Scanner sc = new Scanner(System.in);
		//입력
		System.out.println("입금할 금액을 입력해주세요> ");
		double balance = sc.nextDouble();
		
		this.userinfo.setBalance(this.userinfo.getBalance() + balance);
	   // 출력
		System.out.println("입금을 완료했습니다. ");
		
		//setter / getter 이용해서 사용자에게 입금받기 ###
		//변수 
		
		
	}//end exec()
	
	
	public UserInfo getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}

}
