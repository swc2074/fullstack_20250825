package com.company.java002;

import java.util.Scanner;

public class InputEx2001 {
	public static void main(String[] args) {
		//변수
	
		Scanner scanner = new Scanner(System.in);
		
		//입력
		
		System.out.println("파이값을 입력하시오>");
		double pi = scanner.nextDouble();
		
		System.out.println("파이값은 " + pi + "입니다.");
		scanner.close();
		
	}

}
