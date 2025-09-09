package com.company.java006_ex;

import java.util.Scanner;

public class ForEx006_1a {
	
	public static void main(String[] args) {
		// 변수
		int a, b;
		char ch;
		double result = 0;

		Scanner scanner = new Scanner(System.in);

		// 입력
		for (;;) {
			System.out.println("1. 정수를 하나 입력해주세요>");
			a = scanner.nextInt();
			if (a >= 0 && a <= 100) {
				break;
			}
		}
		for (;;) {
			System.out.println("2. 정수를 하나 입력해주세요>");
			b = scanner.nextInt();
			if (b < 100) {
				break;
			}
		}

		for (;;) {

			System.out.println("3. 연산자를 입력해주세요(+,-,*,/)>");
			ch = scanner.next().charAt(0);
			if (ch == '+') {
				break;
			} else if (ch == '-') {
				break;
			} else if (ch == '*') {
				break;
			} else if (ch == '/') {
				break;
			}
		}
		// 처리

		switch (ch) {
		case '+':
			System.out.printf("%d" + "%s" + "%d" + "=" + "%d", a, ch, b, a + b);
			System.out.println();
		case '-':
			System.out.printf("%d" + "%s" + "%d" + "=" + "%d", a, ch, b, a - b);
			System.out.println();
		case '*':
			System.out.printf("%d" + "%s" + "%d" + "=" + "%d", a, ch, b, a * b);
			System.out.println();
		case '/':
			System.out.printf("%d" + "%s" + "%d" + "=" + "%.2f", a, ch, b, ((double) a / b));
		}

		// 출력

		scanner.close();

	}


}
