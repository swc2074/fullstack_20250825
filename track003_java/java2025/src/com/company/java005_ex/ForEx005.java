package com.company.java005_ex;

public class ForEx005 {
	public static void main(String[] args) {
		int cnt=0;
		char ch = ' ' ;
		
		
		// 입력 + 처리
		// 문제 파악
		
		//  구조
		
		// 코드 작성  {반복} {변수}
		//if ( ) { }
		
		
		
		for (ch = 'a'; ch <= 'z' ; ch++) {
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {cnt++;}
		}
		
		// 출력
		System.out.println("소문자 a~z 까지 모음의 갯수>" + cnt);
	}

}
