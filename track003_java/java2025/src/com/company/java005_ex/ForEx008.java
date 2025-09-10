package com.company.java005_ex;

public class ForEx008 {
	public static void main(String[] args) {
		// 변수
                          //{반복} { 변수} for (시작; 종료; 변화)
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "\t");
		}

		System.out.println();
		int i = 1;
		while (i <= 5) {
			System.out.print(i + "\t");
			i++;
		}
		System.out.println();
		i = 1;
		do {
			System.out.println(i + "\t");
			i++;
		} while (i <= 5);

		System.out.println(" 2번 문제");

		for (int i1 = 5; i1 >= 1; i1--) {
			System.out.print(i1 + "\t");
		}

		System.out.println();
		int i1 = 5;
		while (i1 >= 1) {
			System.out.print(i1 + "\t");
			i1--;
		}
		System.out.println();
		i1 = 5;
		do {
			System.out.print(i1 + "\t");
			i1--;
		} while (i1 >= 1);
		// 입력
		System.out.println();
		System.out.println(" 3번 문제");

		for (int i2 = 1; i2 <= 3; i2++) {
			System.out.print("JAVA"+i2 + "\t");
		}

		System.out.println();
		int i2 = 1;
		while (i2 <= 3) {
			System.out.print("JAVA"+ i2 + "\t");
			i2++;
		}
		System.out.println();
		i2 = 1;
		do {
			System.out.print("JAVA" + i2 + "\t");
			i2++;
		} while (i2 <= 3);
		
		// 처리

		// 출력

	}

}
