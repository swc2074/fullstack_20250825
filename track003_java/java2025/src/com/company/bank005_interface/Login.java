package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class Login  implements BankController {

	@Override
	public int exec(List<UserInfo> users, int find) {
		//변수
		Scanner sc = new Scanner(System.in);
		//입력 - 아이디 와  비밀번호 입력받기
		System.out.print("[1]아이디 입력 > ");  String tempid = sc.next();
        System.out.print("[2]비밀번호입력 > ");  String temppass = sc.next();
        //처리 - user에서 아이디와 비밀번호가 맞는 유저번호 찾기 - 
        for (int i=0; i<users.size(); i++) {
        if(tempid.equals(users.get(i).getId()) && temppass.equals(users.get(i).getPass())) {
        	return i;}
        }
	    // users.add( new UserInfo("id", "pw",1))
        // users.get(0) 0번쩨유저
        // users.size() 유저의 갯수
        // users.remove(0) 0번째유저 삭제
        // 출력 - x
        return -1;
	
		
	}

	@Override
	public String toString() {
		return "Login [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	@Override
	public UserInfo exec(List<UserInfo> users) {
		// TODO Auto-generated method stub
		return null;
	}

	
		 
		
}
