package com.company.java20251010_test;

//Q1. 상속이유 :   재사용
//Q2. 상속 형식 :  extends  상위 class
//Q3. ##을 채우고 출력되는 결과 적으시오.

/*
 1. 클래스는 부품객체
 2. 상태와 행위
 3. 상속? 재사용  >>
        Object
          ↑
          A1 {a}
          ↑
 		  B1 {b}
          ↑
          C1 {c}
         객체 호출순서 : c1()  b1() a1() object()
         객체 생성순서 : object a1  b1   c1
 
 /************** 
[method : 정보보관] 
------------------------------------------------------------
[heap:동적]                             |       [stack:지역] 
------------------------------------------------------------
                                      myc(1번지).a = 10;
                                      myc(1번지).b = 20;
                                      myc(1번지).c = 30;
   		Object(){}
   		A1() {   a=0}
        B1() {   b=0}
1번지    C1() {   c=0}                       mcy[1번지]
	                                        | main
 
*/

class A1 extends Object{
	int a;
	public A1() {super();}
	public A1(int a) {super();this.a=a;}
}

class B1 extends A1{ // A1을 상속받는다
	int b;
	public B1() {super();}
	public B1(int b) {this.b = b;}
	public B1(int a, int b) {super(a);this.b = b;}
}

class C1 extends B1{ // B1을 상속받는다
	int c;
	public void showC() {

		System.out.println("상속받은 A클래스의 a: " + a);
		System.out.println("상속받은 B클래스의 b: " + b);
		System.out.println("상속받은 C클래스의 c: " + c);
	}
}

public class TestJava1010_06 {
	
	public static void main(String[] args) {
		C1 myc = new C1();
		myc.a = 10;
		myc.b = 20;
		myc.c = 30;
		myc.showC();
	}

}
