package com.company.java005_ex;

public class RepeatEx10 {
	public static void main(String[] args) {
		/*
		 for, while, do while 3가지 버전으로
		 ABCDE
		 FGHIJ
		 KLMNO
		 PQRST
		 UVWXY
		 Z
		 */
		// Ver -1 눈에 보이는 그대로
		// System.out.println();
		// System.out.println('A');65 System.out.println('B');66 System.out.println('C');67 
		// System.out.println();
		// System.out.println('A');65 System.out.println('B');66 System.out.println('C');67 
		
		//Ver -2 구조 { 반복 } {변수} for (시작; 종료; 변화)
		//Ver -3 특별한 문제풀이 조건
		
		
		// 변수
		char al = ' ';
		int count = 0;
		// 처리 + 출력
		for (al = 'A'; al <= 'Z'; al++) {
			System.out.printf("%-4s", al);
			count++;
			if (count % 5 == 0) {
				System.out.println();
			}
		}

	    System.out.println();
		//while
		 al = ' ';
		 count = 0;
		// 처리 + 출력
		 al = 'A';
		while ( al <= 'Z') {
			System.out.printf("%-4s", al);
			count++;
			if (count % 5 == 0) {
				System.out.println();
			}
			 al++;}
		
		System.out.println();
		// do while
		al = ' ';
		 count = 0;
		// 처리 + 출력
		 al = 'A';
		do {
			System.out.printf("%-4s", al);
			count++;
			if (count % 5 == 0) {
				System.out.println();
			}
			 al++;}while ( al <= 'Z');
		
	}
}
