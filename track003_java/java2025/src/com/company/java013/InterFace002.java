package com.company.java013;

//1. 클래스는 부품객체
//2. 부품객체는 상태(멤버변수)와 행위(멤버함수)
//3. 상속: 클래스의 재사용, 단일상속
//4. interface : can do this , 다중상속

/*
      Papa{brain}     Mama {brain}
      ↑					↑
                 Son()	
 
 */
class Papa2{int brain;}
class Mama2{int brain;}
// class Son extends Papa2, Mama2{}  //Syntax error on token ",", . expected

//2. 인터페이스는 다중상속 가능
interface Inter20{void inter();}
interface Inter21{void method1();}
interface Inter22{void method2();}
interface Inter23 extends Inter21, Inter22{  }

//3. 많이 쓰는 형식
class Using1 extends Papa2 implements Inter23, Inter20{

	@Override public void method1() { }
	@Override public void method2() { }
	@Override public void inter() { }
		
	}
	


public class InterFace002 {
	public static void main(String[] args) {
		//Inter23 my = new Inter23();
		Using1 my = new Using1();
		//instanceof 클래스확인 , 상속확인 ( 내부모? 족보확인)
		if (my instanceof Object) {System.out.println("1. Object ");}
		if (my instanceof Papa2) {System.out.println("2. Papa ");}
		//if (my instanceof Mama2) {System.out.println("3. Mama ");}
		//Incompatible conditional operand types Using1 and Mama2
		if (my instanceof Inter20) {System.out.println("4. Inter20 ");}
	}
}


