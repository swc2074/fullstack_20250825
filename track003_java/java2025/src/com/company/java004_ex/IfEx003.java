package com.company.java004_ex;

import java.util.Scanner;

public class IfEx003 {
	public static void main(String[] args) {
		// 변수
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.println("숫자입력하시오>");
		int num = scanner.nextInt();
		
		// 처리
		if ( num == 1) { System.out.println("one");}
		else if ( num == 2) {System.out.println("two");}
		else if ( num == 3) {System.out.println("three");}
		else {     System.out.println("1,2,3이 아니다");}
				
		
		// 출력
		
		scanner.close();
	}

}
