package com.company.java004_ex;

import java.util.Scanner;

public class IfEx007 {
	public static void main(String[] args) {
		// 변수
		int a, b; 
		double result = 0;
		char ca;
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.println("정수를 하나 입력해주세요>");
		a = scanner.nextInt();
		
		System.out.println("정수를 하나 입력해주세요>");
		b = scanner.nextInt();
		
		System.out.println("연산자를 입력해주세요(+,-,*,/)>");
		ca = scanner.next().charAt(0);
		// 처리       출력    숫자  연산자  숫자
		 // result = " " + num1 + op + num2 + "="; //
	    if (ca == '+'){result = a + b; System.out.printf("%d+%d=%d",a,b,result);}
	    else if  (ca == '-') {result = a - b; System.out.printf("%d-%d=%d",a,b,result);}
	    else if (ca == '*') {result = a * b; System.out.printf("%d*%d=%d",a,b,result);}
		else if (ca == '/'){ result = (double)a / b;   System.out.printf("%d/%d=%.2f",a,b,result);}
	    /* if(op == '+') { result += (num1 + num2);}
	     * else if (op == '-') { result += (num1 - num2);}
	     * else if (op == '*') { result += (num1 * num2);}
	     * else if (op == '/') { result += String.format("%.2f" , (double)(num1 /  num2);}
	     */
		// 출력
		
		
		
		scanner.close();
	}
}
