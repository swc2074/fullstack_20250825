package com.company.java0905;

import java.util.Scanner;

public class If_Switch_For20250910_1 {
	public static void main(String[] args) {
		//변수
		
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("문자를 입력하세요 >");
		
		char moon = ' ';
		moon = scanner.next().charAt(0);
		switch(moon) {
		case 'a' :System.out.println("apple");break;
		case 'b' : System.out.println("banana");break;
		case 'c' :System.out.println("coconut");break;
		default :System.out.println("a,b,c가 아니다.");break;
		}
		
	}

}
