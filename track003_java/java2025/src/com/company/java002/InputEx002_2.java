package com.company.java002;

import java.util.Scanner;

public class InputEx002_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수 입력>");
		double kor = scanner.nextDouble();
		
		System.out.println("수학점수 입력>");
		double math = scanner.nextDouble();
		
		System.out.println("영어점수 입력>");
		double eng = scanner.nextDouble();
		
		double total = kor + math + eng;
		System.out.println("총점:" + total);
		double average = total / 3.0;
		System.out.println("평균:" + average);
		scanner.close( );
		
				
	}

}
