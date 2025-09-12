package com.company.java0912;

import java.util.Scanner;

public class Q20250912Test_3 {
	public static void main(String[] args) {
		// 변수
		int i = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("문자를 입력하시오>");
		i = scanner.nextInt();

		switch (i) {
		case 1:
			System.out.println("mango");
			break;
		case 2:
			System.out.println("noodle");
			break;
		case 3:
			System.out.println("orange");
			break;
		default:
			System.out.println("1,2,3이 아닙니다.");
		}

		scanner.close();
	}

}
