package com.company.bank005_interface;

import java.util.List;

public class Delete implements BankController {

	@Override
	public UserInfo exec(List<UserInfo> users) {
		return null;
	
		
	}

	@Override
	public int exec(List<UserInfo> users, int find) {
		//변수
		//입력
		//처리  x 
		UserInfo u = users.remove(find);
		//출력
		System.out.println("정보를 삭제했습니다.");
		return find;
		
		
	}

	@Override
	public String toString() {
		return "Delete [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
