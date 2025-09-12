package com.company.java0912;

import java.util.Scanner;

public class Q20250912Test_2 {
	public static void main(String[] args) {
		// 변수
		char ch = ' ';
		Scanner scanner = new Scanner(System.in);

		System.out.println("문자를 입력하시오>");
		ch = scanner.next().charAt(0);

		if (ch == 'm') {
			System.out.println(" mango");
		} else if (ch == 'n') {
			System.out.println("noodle");
		} else if (ch == 'o') {
			System.out.println("orange");
		} else {
			System.out.println(" m,n,o가 아닙니다.");

			scanner.close();
		}

	}

}
