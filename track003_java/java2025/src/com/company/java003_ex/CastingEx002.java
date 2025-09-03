package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx002 {
	public static void main(String[] args) {
		// 변수
		int kor, eng, math, lev;
		double total, avg;
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.println("국어점수 입력>");
		kor = scanner.nextInt();
		
		System.out.println("영어점수 입력>");
		eng = scanner.nextInt();
		
		System.out.println("수학점수 입력>");
		math = scanner.nextInt();
		
		// 처리
		total = (double)kor + eng + math;
		avg = total/3.0;  // 정수/실수  99.67 -> 9.967 -> 9
		lev = (int)(avg/10);
				
		
		// 출력
		System.out.println("============================================");
		System.out.println("== GOOD IT SCORE ==");
		System.out.println("============================================");
		// %s 문자열   %d 정수   %.2f 실수 소수점 2자리까지
		System.out.println("국어 \t 영어 \t 수학 \t 총점  \t 평균  \t 레벨 ");
		System.out.printf("%-5s\t%-5s \t%-5s \t%-5s\t%-5s\t%-5s\n","국어","영어","수학","총점","평균","레벨");
		System.out.println(kor + "\t" + eng + "\t" + math + "\t" +String.format("%.0f", total) + "\t" + String.format("%.3f",avg) + "\t" + lev);
		System.out.printf("%-5d\t%-5d\t%-5d\t%-5d\t%-5.2f\t%-5d\n",kor,eng,math,total,avg,lev);
		scanner.close();
		
	}

}
