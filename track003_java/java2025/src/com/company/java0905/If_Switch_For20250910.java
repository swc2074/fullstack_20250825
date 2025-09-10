package com.company.java0905;

import java.util.Scanner;

public class If_Switch_For20250910 {
	public static void main(String[] args) {
		// 변수

		Scanner scanner = new Scanner(System.in);

		// 입력
		System.out.println("문자를 입력하세요 >");
		char moon = ' ';
		moon = scanner.next().charAt(0);
		if (moon == 'a') {
			System.out.println("apple");
		} else if (moon == 'b') {
			System.out.println("banana");
		} else if (moon == 'c') {
			System.out.println("coconut");
		} else {
			System.out.println(" a,b,c 가 아니다.");
		}
	}

}
