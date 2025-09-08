package com.company.java004_ex;

import java.util.Scanner;

public class SwitchEx001 {
	public static  void main(String[] args) {
		//변수
		int a=0;
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.println(" 숫자한개 입력하시오>");
		a = scanner.nextInt();
		// 처리
		switch(a) {
			case 3 : System.out.println(" 봄이다."); break;
			case 6 : System.out.println(" 여름이다."); break;
			case 9 : System.out.println(" 가을입니다."); break;
			case 12: System.out.println("겨웋입니다."); break;
			
		}
		// 출력
		scanner.close();
	}

}
