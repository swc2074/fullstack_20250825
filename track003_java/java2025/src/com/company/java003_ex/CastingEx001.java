package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx001 {
	public static void main(String[]args) {
		//변수
		int no1, no2;
		double a;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("숫자입력1>");
		no1 = scanner.nextInt();
		
		System.out.println("숫자입력2>");
		no2 = scanner.nextInt();
		
		//처리
		
	    a = (double)no1 / no2;
	    
	    //출력
		System.out.println(no1 + "/" + no2 + "=" + a);
		System.out.println(no1 + "/" + no2 + "=" + String.format("%.3f",a));
		System.out.printf("%d/%d=%.2f" , no1, no2, a);
		scanner.close();
	}

}
