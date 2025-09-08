package com.company.java004_ex;

import java.util.Scanner;

public class SwitchEx002 {
	public static  void main(String[] args) {
		
		//변수
		int a=0;
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.print("숫자한개 입력>");
	    a = scanner.nextInt();
		switch(a) {
		case 3 : case 4 :case 5 : System.out.println("봄이다.");break;
		case 6 : case 7 : case 8 : System.out.println("여름이다.");break;
		case 9 : case 10 : case 11 : System.out.println("가을이다.");break;
		case 12 : case 1 : case 2 : System.out.println("겨울이다.");break;
		}
		
		
		// 처리 
		
		//출력
		
		scanner.close();
	}

}
