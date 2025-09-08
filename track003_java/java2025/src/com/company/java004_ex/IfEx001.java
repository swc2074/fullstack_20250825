package com.company.java004_ex;

import java.util.Scanner;

public class IfEx001 {
	public static void main(String[] args) {
		
	//변수
		String result = "불합격";
		Scanner scanner = new Scanner(System.in);
		
		
		//입력 
		System.out.println("평균 점수을 입력하시오>");
		int avg = scanner.nextInt();
		
		//처리
		if (avg>= 60 ) { System.out.println("합격");}
		else {            System.out.println("불합격");}
		
		//출력
		System.out.println( avg>=60 ? "합격" : "불합격");
		scanner.close();
	}

}
