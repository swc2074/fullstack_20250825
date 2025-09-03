package com.company.java003;

import java.util.Scanner;

public class Repeat007 {
	public static void main(String[] args) {
		int kor, eng, math, total;
		double avg;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하시오>");
		kor = scanner.nextInt();
		
		System.out.println("영어점수를 입력하시오>");
		eng = scanner.nextInt();
		
		System.out.println("수학점수를 입력하시오>");
		math = scanner.nextInt();
		
		total = kor + eng + math;
		System.out.println("총점:" + total);
		avg = total / 3.0;
		System.out.println("평균:" + avg);
		
		scanner.close();

		
	}
	
}
