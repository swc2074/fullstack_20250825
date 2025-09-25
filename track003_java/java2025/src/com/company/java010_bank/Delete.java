package com.company.java010_bank;



public class Delete {
	
	//상태 : 멤버변수
	
		private UserInfo  userinfo;

		
		// 행위 : 멤버함수
		public Delete() { super();  }
		public Delete(UserInfo userinfo) { super(); this.userinfo = userinfo; }
		
		
		public void exec() {
			//setter / getter 이용해서 사용자 정보 삭제 ###
			
			//setter 이용해서 처리
			this.userinfo.setId(null);
			this.userinfo.setPass(null);
			this.userinfo.setBalance(0);
			//출력 - 정보를 삭제했습니다. 
			System.out.println(" 정보를 삭제했습니다.");
	
			/*
			Scanner sc = new Scanner(System.in);
			System.out.println("삭제하시겠습니까?");
			String answer = sc.next();
			if (!answer.toLowerCase().equals("y")) {
				System.out.println("삭제를 취소했습니다.");
				
			}
			String id = " ";
			String pass = " ";
			double balance = 0;
			System.out.println("삭제를 완료했습니다.");

			System.out.println("ID : - " + id + "\n" + "PASS: - " + pass + "\n" + "잔액:" + balance);
		*/	
		}
		public UserInfo getUserinfo() {
			return userinfo;
		}
		public void setUserinfo(UserInfo userinfo) {
			this.userinfo = userinfo;
		}
		
		
		@Override
		public String toString() {
			return "Delete [userinfo=" + userinfo + "]";
		}


}

/* 기능: 유저정보 확인 */