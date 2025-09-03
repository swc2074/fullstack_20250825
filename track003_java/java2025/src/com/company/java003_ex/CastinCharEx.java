package com.company.java003_ex;

import java.util.Scanner;

public class CastinCharEx {
	public static void main(String[] args) {
		//변수
		char ch1 = ' ';
		char ch2 = ' ';
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.print("대문자를 입력해주세요>");
		ch1 = scanner.next().charAt(0); // next() 문자열입력 charAt(0) 첫번째 문자
		
		//처리 대문자 'A' 65, 'B' 66,
		// 97 = 65 +32
		// char = char + int
		ch2 = (char)(ch1+32);
		
		
		//출력
		System.out.println("입력하신 대문자 :" + ch1 + ", 소문자 변환:" + ch2);
		scanner.close();
		
	}

}
