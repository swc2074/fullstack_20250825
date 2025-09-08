package com.company.java004_ex;

import java.util.Scanner;

public class SwitchEx003 {
	public static void main(String[] args) {
		
		// 변수 
		int num1, num2;
		char ch;
		String result = " ";
		Scanner scanner = new Scanner(System.in);
		
		
		// 입력
		System.out.println("정수를 하나 입력해주세요>");
		num1 = scanner.nextInt();
		
		System.out.println("정수를 하나 입력해주세요>");
		num2 = scanner.nextInt();
		
		System.out.println("연산자를 입력해주세요(+,-,*,/)>");
		ch = scanner.next().charAt(0);
		
		// 처리
		result =  num1 + ch + num2 + "=";
		switch(ch) {
		case '+' : System.out.println(result += (num1 + num2));break;
		case '-' : System.out.println(result += (num1 / num2));break;
		case '*' : System.out.println(result += (num1* num2));break;
		case '/' : System.out.println(result += String.format("%.2f",((double)num1)/num2));break;
		
		}
		
		scanner.close();
		// 출력
		
		
	}

}
