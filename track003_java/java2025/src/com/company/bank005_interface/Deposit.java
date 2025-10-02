package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class Deposit implements BankController {

	@Override
	public UserInfo exec(List<UserInfo> users) {
		return null;
		
		
	}

	@Override
	public int exec(List<UserInfo> users, int find) {
		//Deposit : users.get(유저번호)
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입금할 금액>"); double balance = sc.nextDouble();
		UserInfo u = users.get(find);
		u.setBalance((u.getBalance() + balance));
		
		System.out.println("입금이 완료되었습니다.> " + u);
		return 0;
	
		
	}

	@Override
	public String toString() {
		return "Deposit [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
