package com.company.java003_ex;

import java.util.Scanner;

public class Reapeat009 {
	public static void main(String[] args) {
		//변수
		int num1, num2;
		Scanner scanner = new Scanner(System.in);
		
		
		//입력
		System.out.println("숫자 입력1 >");
		num1 = scanner.nextInt();
		
		System.out.println("숫자 입력2 >");
		num2 = scanner.nextInt();
		
		
		//처리
		// 출력
		double resulte = (double)num1 / num2;
		System.out.printf("%d/%d=%.2f\n",num1,num2,resulte);
		
		scanner.close();
		
	
	}

}
