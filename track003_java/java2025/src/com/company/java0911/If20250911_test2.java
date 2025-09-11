package com.company.java0911;

import java.util.Scanner;

public class If20250911_test2 {
	public static void main(String[] args) {
		//변수
		char ch = ' ';
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.print(" 문자를 입력하시오(x,y,z)>");
		ch = scanner.next().charAt(0);
		
		//처리
		switch (ch) {
		case 'x' : System.out.println("x-ray");break;
		case 'y' : System.out.println("yogurt");break;
		case 'z' : System.out.println("zebra");break;
		default  : System.out.println("x,y,z가 아닙니다.");break;
		
		
		}
		scanner.close();
	}

}
