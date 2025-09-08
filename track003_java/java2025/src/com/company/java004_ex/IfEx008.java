package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008 {
	public static void main(String[] args) {
		//변수
		int kor, math, eng, total;
		double avg;
		String std, pass="불합격",  jang ="-";
		String lv="가";
		
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println("학번 입력하시오>");
		std = scanner.next();
		
		System.out.println("국어점수 입력하시오>");
		kor = scanner.nextInt();
		
		System.out.println("영어점수 입력하시오>");
		math = scanner.nextInt();
		
		System.out.println("수학점수 입력하시오>");
		eng = scanner.nextInt();
		//처리
	    total = kor + math + eng;
	    avg = total/3.0;
	    
	    pass = avg<60 ? "불합격" : kor >=40 && eng>=40 && math>=40 ? "합격": "";
	    
	    if (avg >= 60 && kor > 40 && math >40 && eng >40) {System.out.println("합격");}
	    else {System.out.println("불합격");}
	    // if(avg  ) { pass="합격";}
	    if (avg >= 95) {System.out.println("장학생");}
	    if (avg >= 90) {System.out.println(" 수");}
	    else if(avg < 90 && avg >= 80) { System.out.println(" 우");}
	    else if(avg < 80 && avg >= 70) { System.out.println(" 미");}
	    else if(avg < 70 && avg >= 60) { System.out.println(" 양");}
	    else {System.out.println("가");}
		//출력
		System.out.println("=================================================================");
	    System.out.printf("%-5s\t%-5s \t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\n",
	    		"학번","국어","영어","수학","총점","평균","합격여부","레벨","장학생");
		
				System.out.printf("%-5s\t%-5s \t%-5s\t%-5s\t%-5s\t%.2f\t%-5s\t%-5s\n",
			    		std,kor,math,eng,total,avg,pass,lv,jang);
		scanner.close();
	}

}
