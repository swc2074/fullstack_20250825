package com.company.java003_ex;

public class OperatorEx002 {
	public static void main(String[] args) {
		
		int x = 5; char ch = '\u0000';
		
		/*클래스명 : OperatorEx001
	    int a=3, b=10;
	    System.out.println(  b+=10 - a-- );   
	    System.out.println(  a+=5 );
	    System.out.println(  a>=10 || a<0 && a>3);*/

	//연습문제2)  다음에 해당하는 클래스의 조건을 출력하시오.
	//클래스명 : OperatorEx002
	//q1-1 int형 변수 x가 3보다 크고 10보다 작을때 true인 조건식 
		System.out.println( x > 3 && x<10);
	
	//q1-2 char형 변수 ch가 'a' 또는 'A'일때   true인 조건식 
		System.out.println( ch == 'a'  || ch == 'A');
	
	   
	//q1-3 char형 변수 ch가 숫자('0'~'9')일때   true인 조건식    
		System.out.println( ch >='0' && ch <= '9');
		
	//q1-4 char형 변수 ch가 영문자(대문자 또는 소문자) 일때   true인 조건식
		ch = 'A';
		System.out.println( ch>='A' && ch<='z'  || ch>='a' && ch<='z');
		
	}

}
