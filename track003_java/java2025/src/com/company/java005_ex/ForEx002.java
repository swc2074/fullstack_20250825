package com.company.java005_ex;

import java.util.Scanner;

public class ForEx002 {
	
	public static void main(String[] args) {
		// 변수
		int i, a; // 구구단 변수
		Scanner scanner = new Scanner(System.in);
		
		//입력
		
		System.out.println();
		System.out.println("구구단수을 입력하시오>");
		a = scanner.nextInt();
		
	
		for(i= 1; i <=9 ; i++){System.out.printf("%d*%d=%d\n",a,i,a*i);}
		System.out.println();
		
		
		
		scanner.close();
	}// main end
	
	
	
	

}
