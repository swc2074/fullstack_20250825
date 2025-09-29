package com.company.java012;

/*
 * 1. 클래스는 부품 객체
 * 2. 상태와 행위
 * 2. 상속은 재활용
       Object                             
         ↑									
 * 		Test A2  (int a, toString)	110v, 1						
 * 							
 * 		 ↑
       Test B2 (int b , toString) 220v, + 나사
       
       class TestA2 extends Object{}
       class TestB2 extends TestA2{}
 */
class TestA2 extends Object {
	int a = 10;
	@Override public String toString() { return "TestA2 [a=" + a + "]"; }
}

class TestB2 extends TestA2 {
	int b = 20;
	@Override public String toString() { return "TestB2 [b=" + b + "]"; }

}

///////////////////////////////////////////////////////////////////
public class Poly003 {
	public static void main(String[] args) {
		//부모   = 자식
		//1. TestA2  ta{int a, toString}
		//2.         1번지 TestB2(){int b=20, toString } -> TestA1(){int a=10, toString} -> Object(){}
		// 생성자는  인스턴스 변수를 초기화해서 사용할 수 있게 해줌.
		//3. ta{int a, toString} [1번지]= 1번지 {int b=20, @toString} - {int a=10, ----------------}
		TestA2 ta = new TestB2(); 
		System.out.println(ta); // TestB2[b=20]
		System.out.println(ta.a);// 10
		System.out.println(((TestB2)ta).b); //20
	}

}
////////////////////////////////////////////////////////////////////