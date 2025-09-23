package com.company.java010_ex;

class Area1 {
	// 변수

	static double pi = 3.141592;

	// 멤버함수
	public static double rect(int a, int b) {
		return a * b;
	}

	public static double triangle(int a, int b) {
		return a * b * 0.5;
	}

}

/////////////////////////////////////////////////////

public class StaticEx001 {

	public static void main(String[] args) {
		System.out.println("원의 면적:" + 10 * 10 * Area1.pi);
		// public static 리턴값 메서드(파라미터) {해야할일}
		// public static double rect (10, 5) { return a*b ;사각형의 면적 }
		System.out.println("사각형의 면적:" + Area1.rect(10, 5));
		// public static double triangle(int a, int b){return a*b*0.5;}
		System.out.println("삼각형의 면적:" + Area1.triangle(10, 5));
	}

}
/////////////////////////////////////////////////////

/*
------------------------[ runtime data area]
[method: 정보, static, final : 공용정보]
>Sawon3.Class / MemberVarEx001.class
>static: Sawon3.su, Sawon3.basicpay2 , Sawon3.showSu() , Sawon3. showAll002()


------------------------------------
[heap: 동적]            | [stack : 잠깐빌리기]



					    | main

------------------------------------
*/