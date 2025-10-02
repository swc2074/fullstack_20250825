package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class Withdraw implements BankController {

	@Override
	public int exec(List<UserInfo> users, int find) {
		
		
		Scanner sc = new Scanner(System.in);
		//입력 - 사용자한테 입금할 금액입력받기
		System.out.println(" 출금할 금액 "); double balance = sc. nextDouble();
		
		UserInfo u = users.get(find);
		u.setBalance(u.getBalance() - balance);
		System.out.println(" 출금이 완료되었습니다." + u);
		return 0;
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserInfo exec(List<UserInfo> users) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
