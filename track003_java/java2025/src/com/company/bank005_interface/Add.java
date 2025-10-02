package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class Add implements BankController {

	@Override
	public int exec(List<UserInfo> users, int find) {
		Scanner sc = new Scanner(System.in);
		System.out.print("[1]사용할 아이디 입력 > ");  String id = sc.next();
		System.out.print("[2]사용할 비밀번호 입력 > ");  String pass = sc.next();
		System.out.print("[3]입금할 금액  > ");  double balance = sc.nextDouble();
		users.add(  new  UserInfo(id, pass, balance));
		System.out.println("사용자 추가완료되었습니다.");
		return 1; // 넣고싶은 숫자
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserInfo exec(List<UserInfo> users) {
		// TODO Auto-generated method stub
		return null;
	}

}
