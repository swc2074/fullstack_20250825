package com.company.java010_bank;

import java.util.Scanner;

public class Login {
	//상태 
	//상태 : 멤버변수
	
		private UserInfo  userinfo;

		
		// 행위 : 멤버함수
		public Login() { super();  }
		public Login(UserInfo userinfo) { super(); this.userinfo = userinfo; }
		
		
		public int exec() {
			//setter / getter 이용해서 사용자 확인 ###
			int find = -1;
			// 입력 - 
			Scanner scanner = new Scanner(System.in);
			System.out.println("[1] 아이디 입력 > "); String tempid = scanner.next();
			System.out.println("[2] 비번 입력 > "); String temppass = scanner.next();
			
			// 처리  - 
			// 입력한 아디와 userinfo.id가 같고 입력한 비밀번호와 userinfo.pass가 같다면 find=1; 찾으면 1
			// 출력 - 
			find = tempid.equals(this.userinfo.getId()) &&
			temppass.equals(this.userinfo.getPass()) ? 1 : -1 ;
			  return find;
			
			
		}
	
		
		public UserInfo getUserinfo() {
			return userinfo;
		}
		public void setUserinfo(UserInfo userinfo) {
			this.userinfo = userinfo;
		}
	
		
		@Override
		public String toString() {
			return "Login [userinfo=" + userinfo + "]";
		}


}
