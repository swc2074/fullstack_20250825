package com.company.java0919;

import java.util.Scanner;

public class Test20250919_1 {
	
	public static void main(String[] args) {
		
		char ch = ' ' ;
		Scanner sc = new Scanner(System.in);
	
		
		for (;;) {
			System.out.println(" 문자를 입력하시오>");
			ch = sc.next().charAt(0);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				break;
			}
			
		}
	
		char ch1= ' ';
		while(true) {
			System.out.println(" 문자를 입력하시오>");
			ch1 = sc.next().charAt(0);
			if(ch1 == '+' || ch1 == '-' || ch1 == '*' || ch1 == '/') {
				break;
			}
			
		}
		
		char ch2= ' ';
		do {
			System.out.println(" 문자를 입력하시오>");
			ch2 = sc.next().charAt(0);
			if(ch2 == '+' || ch2 == '-' || ch2 == '*' || ch2 == '/') {
				break;
			}
			
		}while(true );
		
		
		
		
	}// end main

}// end class
