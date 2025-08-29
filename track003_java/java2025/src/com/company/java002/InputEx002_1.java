package com.company.java002;

import java.util.Scanner;

public class InputEx002_1 {
	public static void main(String[] args) {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("태어난 년도 입력하세요>");
		num = scanner.nextInt();
		num = 2025 - num;
		System.out.println("당신의 현재 나이는 " + num + " 입니다.");
	}

}
