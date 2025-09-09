package com.company.java006_ex;

import java.util.Scanner;

public class ForEx007 {
	public static void main(String[] args) {
		//변수
		int kor = 0, math =0, eng =0, total = 0;
		double ave;
		String std = " ";
		String pass, lev, jang;
		Scanner scanner = new Scanner(System.in);
		
	    // 입력
		System.out.println(" 학번 입력 >");
		std = scanner.next();
		for(;;) {System.out.println("국어점수 입력>");
		kor = scanner.nextInt();
			if (kor>=0 && kor <=100) {break;
			}
		}
	    for (;;) {System.out.println("수학점수 입력>");
	    math = scanner.nextInt();
			if (math>=0 && math <=100) {break;
			}
			
	    }
	    for (;;) {System.out.println("영어점수 입력>");
	    eng = scanner.nextInt();
			if (eng >=0 && eng <=100) {
				
				break;
			}
	    
	    }
		
		//처리
		
		total = kor + math + eng;
		ave = (double)total/3.0;
		pass = ave < 60 ? "불합격" : kor<40 || eng < 40 || math <40 ? "불합격" : "합격";
		jang = ave <95 ? "": "장학생";
		lev = ave >= 90 ? "수" :ave >=80 ? "우":ave >=70 ? "미" :ave >= 60 ? "양" : "가";
		
	
		
		// 출력
		System.out.println("======================================================================");
		System.out.printf("%-5s\t%-5s \t%-5s \t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\n",
				"학번","국어","영어","수학","총점","평균","합격여부","레벨","장학생");
		System.out.println("======================================================================");
		System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%-5.2f\t%-5s\t%-5s\t%-5s\t"
				 ,std,kor,eng,math,total,ave,pass,lev,jang);
		
	    }
		
	}
	

		
		
		
		


