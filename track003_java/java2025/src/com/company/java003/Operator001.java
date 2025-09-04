package com.company.java003;

import java.util.Scanner;

public class Operator001 {
	public static void main(String[] args) {
		// 먼저() 값(+,-,*,/,%,++,--) 비교(>,<)  조건 (&&, || , ?:)  후 대입(=)한다.
		
		// 1. 값
		int a = 10, b = 3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // 몫 3
		System.out.println(a%b); // 나머지 1
		
		//Q1. 나머지연산자 - 짝수니? 홀수니?
		// 0%2  1%2  2%2  3%2
		
		System.out.println(0%2 + "\t" + 1%2 + "\t" + 2%2 + "\t" + 3%2); // 0101
		//Q2. 3의 배수?
		// 3으로 나눴을때 0 / 나머지 0 1 2
		System.out.println(0%3 + "\t" + 1%3 + "\t" + 2%3 + "\t" + 3%3 + "\t" + 4%3); // 012012
		
		
		//2. 비교 (==, != , <, >,>=,<=)
		System.out.println(10 > 3);
		System.out.println(10 == 3);
		// Q1. a가 짝수니?
		
		System.out.println(a%2 == 0);
		// Q2. b가 3의 배수니? 
		System.out.println(b%3 == 0);
		
		//3. &&(모든조건만족시) || (여러조건중에 하나라도 만족하시 true)
		System.out.println(true & true); // true
		System.out.println(true && true); // 모든조건만족시 true
		System.out.println(false & true); // 처음에 false 뒤에 조건까지 읽음
		System.out.println(false && true); // Dead code
		
		System.out.println(true | true); // true
		System.out.println(true || true); // true : Dead code
		System.out.println(false | true); // true
		System.out.print(false ||true); // false
		
		//Q1. a가 2의 배수이면서 5의 배수라면 true/false
		System.out.println(a%2 == 0 && a%5 == 0);
		//Q2. a가 2의 배수이거나 3의 배수라면 true/false
		System.out.println(a%2 == 0 || a%3 == 0);
		
		//4. 삼항 연산자 (조건)? 참: 거짓
		System.out.print( a ==10 ? "10이다": " 10입니다.");
		
		//Q3. 숫자를 입력받아 0보다크면 양수, 0 보다 작으면 음수, 아니라면 0
		/*
		Scanner scanner = new Scanner(System.in);
		int q3 = scanner.nextInt();
		String result = q3 > 0 ? "양수" : q3 < 0 ? "음수" : "0";
		*/
		
		//5. 대입연산자
		a=10; b=3;
		System.out.println( "1: " +   ( a+= b));  // 1) a+b 2) a=13
		System.out.println( "2: " +   ( a-= b));  // 1) a-b 2) a=10
		
		
		//6. 단항
		int a1 = 1, b1 = 1, c1 = 1, d1 = 1;
		
		System.out.println( ++a1 ); //2  증가 출력
		System.out.println( a1 );   //2 
		
		System.out.println( b1++);  //1 출력 증가
		System.out.println( b1 );   //2 
		
		System.out.println( --c1 ); //0 감소 출력
		System.out.println( c1 );   //0
		
		System.out.println( d1-- ); //1  출력 감소
		System.out.println( d1 );   //0 
		
		
	}

}
