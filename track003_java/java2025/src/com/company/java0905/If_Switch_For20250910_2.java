package com.company.java0905;

import java.util.Scanner;

public class If_Switch_For20250910_2 {
	public static void main(String[] args) {
		// 변수
		int a = 0;
		Scanner scanner = new Scanner(System.in);

		// 입력+처리

		for (;;) {
			System.out.println("숫자를 입력하세요 >");
			a = scanner.nextInt();
			if (a == 1) {
				break;
			}
		}

	}

}
