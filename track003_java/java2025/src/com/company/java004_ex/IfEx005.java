package com.company.java004_ex;

import java.util.Scanner;

public class IfEx005 {
	public static void main(String[] args) {
		// 변수
		System.out.println("문자한개를 입력하시오>");
		Scanner scanner = new Scanner(System.in);
		// 입력

		char ch = scanner.next().charAt(0);
		if (ch >= 'a' && ch <= 'z') {
			System.out.println(" 대문자" + (char) (ch - 32) + " 이다");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println(" 소문자 " + (char) (ch + 32) + "이다");
		} else {
			System.out.println("문자가 아니다");
		}
		// 처리
		// ver-1. 대문자인지 이면 소문자로, 소문자이면 대문자로 변경하는
		// ver-2. if(대문자인지 이면) { 소문자로} else if (소문자이면) { 대문자로 변경}
		/*
		 * ver-3. 'a' 97 , 'A' 65 'b' 98 , 'B' 66 if (대문자인지 ) { 소문자로 'a' = 'A' + 32; }
		 * else if (소문자이면) {대문자로 'A' = 'a' - 32; }
		 */

		// 출력

	}

}
