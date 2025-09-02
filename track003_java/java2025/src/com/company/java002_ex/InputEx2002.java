package com.company.java002_ex;

import java.util.Scanner;

public class InputEx2002 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("국어점수를 입력하시오>");
		int d = scanner.nextInt();
		
		System.out.println("영어접수를 입력하시오>");
		int dd = scanner.nextInt();
		
		System.out.println("수학점수를 입력하시오>");
		int ddd = scanner.nextInt();
		
		int total = d + dd + ddd;
		double ave = total/3.0;
		
		System.out.println("총점:" + total );
		System.out.println("평균: " + ave);
		
		scanner.close();
				
		
		

		
		
	}

}
