package com.company.java005_ex;

import java.util.Scanner;

public class Repeat012_1 {
	public static void main(String[] args) {
		//변수
		int a= ' ';
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println("숫자 한개를 입력하시오>");
		a=scanner.nextInt();
		
		//처리 + 출력
		if (a == 1) {System.out.println("one");}
		else if ( a == 2 ) {System.out.println("Two");}
		else if ( a == 3 ) {System.out.println("Three");}
		
		scanner.close();
		}
		
		
	}


