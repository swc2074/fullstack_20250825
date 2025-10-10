package com.company.java20251010_test;

//Q8. abstract vs interface의 공통점과 차이점
/*
  둘다 설계가 가능한 클래스
  공통점: 자식객체를 통해서 코드를 구현
  차이점: 추상화 정도가 interface가 더 크다.
  abstract  - 인스턴스변수, 인스턴스메서드 사용가능
  interface - 상수 (public static final), abstract 메서드
 */

//Q9. interface - can do this
/*  
 Driver  .............>   Vehicle { run() }
                  ..........△            ..........△
                   MoterCycle             Car
                   {helmet(), @run()}    {@run()}
 */

interface Vehicle16{public void run();}
class MotorCycle16 implements Vehicle16{
	@Override public void run() {
		System.out.println("오토바이가 달립니다.");}
	public void helmet() {System.out.println("헬멧을 착용합니다.");
	}
}

class Car16 implements vehicle16{
	@Override public void run() {System.out.println("자동차가 달립니다.");}
}

class Driver16{
	public void drive(Vehicle v) { // 의존관계 - 다형성 (부모객체로 여러자식객체들을 관리)/
		if(v instanceof MoterCycle) {((MotorCycle)v).helmet();}// helmet은 부모에게 없고 자식에게 있는 기술
		v.run();
	}
	
}

//////////////////////////////////////////////////////
public class TestJava1010_8_9 {
	public static void main(String[] args) {
		Driver16 driver16 = new Driver16();
		
		MoterCycle16 MotorCycle16 = new MotorCycle16();
		Car16 Car16 = new Car16();
		
		driver16.drive(Car16); // public void drive(Vehicle v) { 해야할일}
		System.out.println("\n\n >> 자동차가 고장나서 교통수단을 바꿉니다!");
		
		driver16.drive(MotorCycle16);// public void drive(Vehicle v) { 자동차일때는 자동차가 달립니다./ 오토바이 헬멧, 달린다}
	}
}
//////////////////////////////////////////////////////