package com.company.java002_ex;

import java.util.Scanner;

public class InputEx001 {
	public static void main(String[] args) {
		int age = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입려하세요>");
		age = scanner.nextInt();
		System.out.println("나이" + age + "살입니다");
	}

}
