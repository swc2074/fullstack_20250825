package com.company.java005_ex;

import java.util.Scanner;

public class Bank_ver2 {
	public static void main(String[] args) {
		// 변수
		int num; String id, pass; double balance;
		Scanner scanner = new Scanner(System.in);

		// 입력 + 처리 + 출력
		System.out.println("WELCOME ! (주) CODE BANK");
		for (;;) {
			System.out.print("===== CODE BANK =====\n*" + " 1. 추가\n* 2. 조회\n* 3. 입금\n* 4. 출금\n* 5. 삭제\n* 9. 종료\n입력>>>");
			num = scanner.nextInt();
			if (num == 9) { System.out.println(" ATM을 종료합니다.");
				break;
			}
			switch (num) {
			case 1:
				System.out.println(" 1. 추가기능입니다.");
				System.out.println("아이디 입력");id = scanner.next();
				System.out.println("비밀번호 입력");pass = scanner.next();
				System.out.println("잔액입력");balance =scanner.nextDouble();
				//아이디입력 > _입력받기
				//비밀번호입력 > _입력받기
				//잔액입력    > _입력받기
			break;
			case 2:
				
				System.out.println("아이디:" );
				id = scanner.next();
				System.out.println("비밀번호:");
				pass = scanner.next();
				System.out.println("잔액입력");
				balance =scanner.nextDouble();
			break;
			case 3:
				System.out.println(" 3. 입금기능입니다.");
				System.out.println("아이디:" );
				id = scanner.next();
				System.out.println("비밀번호:");
				pass = scanner.next();
				System.out.println("잔액입력");
				balance =scanner.nextDouble();
			break;
			case 4:
				System.out.println(" 4. 출금기능입니다.");
			break;
			case 5:
				System.out.println(" 5. 삭제기능입니다.");
			break;
			
			}
		}
	}

}

/*
 * 하루에 하나씩 힌트 다음주 까지 숙제
 * 
 * Step1. 무한반복으로 만드는 메뉴만들기
 * 
 * for(;;){ // 1-1 무한반복 // 1-2 빠져나올 조건 9 ///1-3 입력받은 번후가 if or switch /// ///1을
 * 입력하면 추가기능입니다.. 출력구문까지만 ///2을 입력하면 조회기능입니다.. 출력구문까지만 ///3을 입력하면 입금기능입니다..
 * 출력구문까지만 ///4을 입력하면 출금기능입니다.. 출력구문까지만 ///5을 입력하면 삭제기능입니다.. 출력구문까지만 ///6을 입력하면
 * 종료기능입니다.. 출력구문까지만 ///7을 입력하면 추가기능입니다.. 출력구문까지만 /// /// ///}
 */