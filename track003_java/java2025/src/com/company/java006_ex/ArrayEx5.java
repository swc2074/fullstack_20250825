package com.company.java006_ex;

public class ArrayEx5 {
	public static void main(String[] args) {
		
		// 변수
		int upper = 0, lower = 0;
		
		//입력
		//처리
		// ver -1 만약 'B'가 대문자라면 대문자 카운트, 소문자 라면 소문자 카운트
		// ver -2 if(만약 'B' 가 대문자라면) { 대문자 카운트}
		// else if (소문자라면){ 소문자타운트}
		// if(ch[0]>='A' && ch[]<='z'{upper++;}
		//                  else if(ch[0]>='A' && ch[]<='z'{lower++;}
		// 출력 - 대문자의 갯수카운트, 소문자의 갯수 카운트
		
		char [] arr = {'B','a','n','a','n','a'};
		
		for(int d = 0; d<arr.length; d++) {
			if (arr[d] >= 'A' && arr[d]<='Z') {upper++;
			}else if (arr[d]>='a' && arr[d]<= 'z') {lower++;
			
			}
			
		}
		System.out.print(" 대문자 갯수:" + upper);
		System.out.print(" 소문자 갯수:" + lower);
		
		
	} // end main

}// end class
