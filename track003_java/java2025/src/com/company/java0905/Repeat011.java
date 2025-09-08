package com.company.java0905;

import java.util.Scanner;

public class Repeat011 {
	public static void main(String[] args) {
		//변수 
		int num1, num2; String result =" ";
		char ch;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println(" 정수를 하나 입력해주세요>");
		num1 = scanner.nextInt();
		
		System.out.println(" 정수를 하나 입력해주세요>");
		num2 = scanner.nextInt();
		
		System.out.println(" 연산자를 입력해주세요 (+,-,*,/)>");
		ch = scanner.next().charAt(0);
		
		//처리
		result = " " + num1 + ch + num2 + "=";
		
		if (ch == '+') {result += (num1 + num2);}
		else if (ch == '-') {result += (num1 - num2);}
		else if (ch == '*') {result += (num1 * num2);}
		else if (ch == '/') {result += String.format("%.2f",((double)num1/num2));}
		
		// 출력
		System.out.println(result);
		
	}

}
