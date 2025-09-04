package com.company.java004_ex;

import java.util.Scanner;

public class IfEx004 {
	public static void main(String[] args) {
		
		//변수
		char ch='\u0000';
		Scanner scanner = new Scanner(System.in);
		
		
		//입력
		System.out.println("문자한개을 입력하시오>");
		ch = scanner.next().charAt(0);
		
		//처리
		if (ch>='A' && ch<='Z') { System.out.println(ch + "는대문자 입니다. ");}
		else if (ch>='a' && ch<='z') { // ch>=97 && ch<= 122 
			 System.out.println(ch + "는 소문자입니다ㅣ.");}
		
		else {    System.out.println(" 영문 소문자, 대문자가 아니다.");}
		
		//출력
		
		scanner.close();
	}

}
