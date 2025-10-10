package com.company.java20251010_test;


class A{
	int a; // 인스턴스변수, heap new 0 - this 0
	static String company ; // 클래스변수,method -  new x  A.company  this x  
	void method() {int a = 0; System.out.println(a);
		
	} //지역변수, stack  void method() 안에서만 사용   오류나는 위치는 여기
}

public class TestJava1010_02 {
	public static void main(String[] args) {
		System.out.println(A.company);
	}

}
