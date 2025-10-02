package com.company.bank005_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank_Main {
	// 멤버변수
	private List<UserInfo> users; // add, get , size, remove, contains
	private BankController[] controller;

	
	// 생성자 - 멤버변수
	public Bank_Main() {
		users = new ArrayList<>();
		controller = new BankController[] { 
				new Login(), new Add(), new Show(), new Deposit(), new Withdraw(),  new Delete() };
		// controller[0]         1         2				3			4				5
	}

	// 멤버함수
	public void menu() {
		// 변수
		int num = -1;
		Scanner sc = new Scanner(System.in);
		// 입력 + 처리
		// 1. 메뉴판 무한 반복  - 입력
		// 2. 메뉴가 1 - 사용자 추가 Add()
		//3. 메뉴가 2,3,4,5 - 로그인한 후에 Login()
		//   각각의 기능 
		while (num != 9) {
			System.out.println(users);
			System.out.print("\n\n🌟💰 WELCOME TO BANK SYSTEM 💰🌟\n" 
							+ "\n[1] ➕ 계좌 추가" 
							+ "\n[2] 🔍 계좌 조회"
							+ "\n[3] 💵 입금하기" 
							+ "\n[4] 💸 출금하기" 
							+ "\n[5] 🗑️ 계좌 삭제  " 
							
							+ "\n\n👉 번호를 선택하세요:");
			
			num = sc.nextInt();
			int find=1; // 찾은 유저번호 or 0 로그인  or 1 계좌추가
			
			// add, get (번호), size, remove(번호), contains()
			// Add : users.add(new UnserInfo("id", "pw", 1)); - users.add(new UserInfo("id", "pw", 1));
			// Show : users.get(유저번호)
			// Deposit : users.get(유저번호)
			//1. parameter  - 넘겨받아야할 데이터 users, 유저번호
			//2. 리턴값       - 위의 사용방법에서 show, deposite부분등에서 유저번호가 필요한데...
			//                  로그인시 찾은 유저의 번호를 넘겨주려고.
			//3. int (찾은 유저번호) exec(users, index);
			
	
			if (num>=2 && num <=5) { find = controller[0].exec(users, 0);
				if(find == -1){System.out.println("유저정보를 확인해주세요"); continue;}
				
			}
			controller[num].exec(users,find);
		}
	

		
	}

	

	public static void main(String[] args) {
		new Bank_Main().menu();

	}

}
