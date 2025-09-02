package com.company.java002_ex;

import java.util.Scanner;

public class InputEx2002 {
	public static void main(String[] args) {
		
		//변수
		int d, dd, ddd;
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("국어점수를 입력하시오>");
		 d = scanner.nextInt();
		
		System.out.println("영어접수를 입력하시오>");
		 dd = scanner.nextInt();
		
		System.out.println("수학점수를 입력하시오>");
		 ddd = scanner.nextInt();
		
		int total = d + dd + ddd; // A=B
		double ave = total/3.0; // 정수 = 정수/정수  -> 실수 = 정수/실수
		
		// 출력
		System.out.println("총점:" + total );
		System.out.println("평균: " + ave);
		
		scanner.close();
				
		
		

		
		
	}

}
