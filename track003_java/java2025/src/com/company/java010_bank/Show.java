package com.company.java010_bank;

public class Show {
	// 상태: 멤버 변수
	private UserInfo userinfo;

	public Show() { super();  }

	public Show(UserInfo userinfo) { super(); this.userinfo = userinfo; }
	
	
	// 행위: 멤버함수
	public void exec() {
		System.out.println(this.userinfo + "\t" + System.identityHashCode(this.userinfo));
		System.out.println("\n ID:" + this.userinfo.getId()
							+ "\nPASS> " + this.userinfo.getPass()
							+ "\nBALANCE > " + this.userinfo.getBalance());
	}

}
// 기능: 유저정보보여주기