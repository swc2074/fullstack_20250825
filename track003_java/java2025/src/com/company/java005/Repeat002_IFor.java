package com.company.java005;

import java.util.Scanner;

public class Repeat002_IFor {
	public static void main(String[] args) {
		// 1. 무한반복  for (;;) {}  /2. break 나갈조건
		// for(;;) {System.out.println("Hello"); }
		Scanner scanner = new Scanner(System.in);
		for(;;) {
			System.out.println("숫자 1을 입력하시오>");
			int a = scanner.nextInt();
			if(a == 1) { break;}
			scanner.close();
		}
		// for - break
		for (int i=1; i<=10 ; i ++) {
			if (i==3) {break;}
			System.out.print(i + "\t");
		}
		System.out.println();
		
		// for - continue (건너뛰기 ) 12() 45678910
		for (int i=1; i<=10; i++) {
			if (i ==3) {continue;}
			System.out.print(i + "\t");
			
		
		}
		
		
	}

}
