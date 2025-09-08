package com.company.java004_ex;

import java.util.Scanner;

public class IfEx006 {
	public static void main(String[] args) {
		//변수
		int num;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("숫자를 입력하시오>");
		num = scanner.nextInt();
		
		System.out.println(num%2==0 ? "짝수" : "홀수");
		//처리
		
		//출력
		scanner.close();
	}

}
