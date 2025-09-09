package com.company.java005_ex;

import java.util.Scanner;

public class Repeat012_2 {
	public static void main(String[] args) {
		
		//변수
		int a= ' ';
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.println(" 숫자한개를 입력하시오>");
		a=scanner.nextInt();
		
		// 처리 + 출력
		switch (a) {
		case 1 : System.out.println(" one");break;
		case 2 : System.out.println(" Two");break;
		case 3 : System.out.println(" Three");break;
		
		}
		
		
		scanner.close();
		
	}

}
