package com.company.java004_ex;

import java.util.Scanner;

public class IfEx002 {
	public static void main(String[] args) {
		// 변수 
		Scanner scanner = new Scanner(System.in);
		
		
		// 입력
		System.out.println("숫자를 입력하시오>");
		double num = scanner.nextDouble();
		
		
		// 처리
		if (num > 0) { System.out.println("양수");}
		else if (num < 0 ) { System.out.println("음수");}
		else if (num == 0 ) { System.out.println("zero");}
		
		// 출력
		scanner.close();
	}

}
