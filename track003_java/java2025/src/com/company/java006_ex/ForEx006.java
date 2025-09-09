package com.company.java006_ex;

import java.util.Scanner;

public class ForEx006 {
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
			if (a>=0 && a<=100) {
				break;
			}
		}
		for (;;) {
			System.out.println("2. 정수를 하나 입력해주세요>");
			b = scanner.nextInt();
			if (b>=0 && b<=100) {
				break;
			}
		}

		for (;;) {
			System.out.println("3. 연산자를 입력해주세요(+,-,*,/)>");
			ch = scanner.next().charAt(0);
			if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				break;
			}
		}
		// 처리

		switch (ch) {
		case '+':result = a+b;break;	
		case '-':result = a-b;break;	
		case '*':result = a*b;break;
		case '/':result = (double)a/b;break;
			
		}

		// 출력
		System.out.println(" " + a + ch + b + " = " + (ch != '/' ? "" + (int)result : String.format("%.2f",result)));

		

	}

}
