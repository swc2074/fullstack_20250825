package com.company.java0919;

import java.util.Scanner;

public class Test20250919_5 {
	
	public static void stdId(int num) {
		System.out.println("당신의 학번은?"+ "G" + num);
	}
	
	/////////////////////////////////////////
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 학번을 기입하세요>");
		num = sc.nextInt();
		stdId(num);
		
	}
	
	/////////////////////////////////////////
}
