package com.company.java009_ex;

import java.util.Scanner;

class AnimalCharacter {

	// 상태 - 멤버변수
	String name;
	String type; // 육식 or 초식
	int baseSpeed;
	int specialBoost;
	double finalSpeed;

	// 행위 - 멤버함수
	void input() {

		Scanner sc = new Scanner(System.in);
		System.out.println(" 동물 이름>");
		this.name = sc.next();
		System.out.println(" 동물 타입 (육식/초식)>");
		this.type = sc.next();
		System.out.println(" 기본 속도>");
		this.baseSpeed = sc.nextInt();
		System.out.println(" 특수 능력치>");
		this.specialBoost = sc.nextInt();
		sc.close();
	}
	
	void calculateSpeed() {

		if (type.equals("육식")) {
			this.finalSpeed = this.baseSpeed + (this.specialBoost * 0.2);
		} else {
			this.finalSpeed = this.baseSpeed + (this.specialBoost * 0.1);
		}

	}

	void show() {
		this.calculateSpeed();
		System.out.println("■ 출력내용");
		System.out.println("동물 캐릭터:" + this.name);
		System.out.println("타입:" + this.type);
		System.out.println("최종 속도:" + this.finalSpeed);

	}

	public AnimalCharacter() {
		super();
		
	}

	public AnimalCharacter(String name, String type, int baseSpeed, int specialBoost) {
		super();
		this.name = name;
		this.type = type;
		this.baseSpeed = baseSpeed;
		this.specialBoost = specialBoost;
		
	}

	@Override
	public String toString() {
		return "AnimalCharacter [name=" + name + ", type=" + type + ", baseSpeed=" + baseSpeed + ", specialBoost="
				+ specialBoost + ", finalSpeed=" + finalSpeed + "]";
	}

}

/////////////////////////////////////////////////////

public class ClassEx008 {

	public static void main(String[] args) {

		AnimalCharacter a1 = new AnimalCharacter("치타", "육식", 100, 30);
		a1.show();

		AnimalCharacter a2 = new AnimalCharacter();
		a2.input();
		a2.show();

	}

}
//////////////////////////////////////////////////////

/*
 * ------------------------[ runtime data area] [method: 정보, static, final :
 * 공용정보] Calc.class , public ClassEx007.class 클래스 (설계도)
 * 
 * 
 * 
 * 
 * ------------------------------------ [heap: 동적] | [stack : 잠깐빌리기] c2.show(){}
 * c2.input(); 2번지 {num1=3, num2=4, op=*, result=12 c2 [2번지] c1 . show(){} 1번지
 * {num1=10, num2=3, op = '+' , result = 13 c1[1번지 ] Calc c1 = new Calc (10,3,
 * '+') | main
 * 
 * ------------------------------------ 객체(new) / 인스턴스 - c2(2번지의).num1, c1(1번지의
 * ) .num1
 */
