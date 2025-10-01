package com.company.java014;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx002 {

	public static void main(String[] args) {
		//변수
		List<String> numbers = new ArrayList<String>(); // 자료형 상관없이 내가 넣고 싶은 만큼  add, get, size, remove, contains

		//입력
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");

		System.out.println(numbers);

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하시오 > ");
		int num = 0;
		num = sc.nextInt();
		
		// 처리

		System.out.println(numbers.get(num - 1));

	}

}
/*
연습문제1)  Collection  Framework
패키지명 : com.company.java014_ex
클래스명 : ListEx001
다음과 같이 코드를 작성하시오.
 1.  ArrayList이용해서 colors 만들기
 2. red, green, blue 데이터 추가
 3. 출력

연습문제2)  Collection  Framework
패키지명 : com.company.java014_ex
클래스명 : ListEx002
1.  numbers ArrayList 만들기
2.  one, two, three 데이터 추가
3.  사용자에게 1,2,3 입력받기
4.  1을 입력받으면 one 출력
    2를입력받으면 two 출력
    3을입력받으면 three 출력
*/