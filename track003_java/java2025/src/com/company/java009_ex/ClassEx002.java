package com.company.java009_ex;

import java.util.Scanner;

class MyPrice002 {
	String name;
	int price;

	void input() {

		Scanner sc = new Scanner(System.in);
		System.out.println("상품이름 입력>");
		this.name = sc.next();
		System.out.println("상품가격 입력>");
		this.price = sc.nextInt();
	}

	void show() {
		System.out.println(" 상품정보입니다.");
		System.out.printf(" 상품이름: %s / 상품가격 : %d", this.name, this.price);
	}
}

//////////////////////////////////////////////////
public class ClassEx002 {

	public static void main(String[] args) {
		MyPrice002 p1 = new MyPrice002();
		// 1) new (번지, 객체생성) 2) 생성자 MyPrice001() 초기화 3) p1 = 1번지
		p1.input();
		p1.show();

	}

}
////////////////////////////////////////////////
/*
 * 
 * 
 * MyPrice001 ------------------------[ runtime data area] [method: 정보, static,
 * final : 공용정보]
 * 
 * MyPrice001.class, ClassEx002.class 클래스 (설계도)
 * 
 * ------------------------------------ 객체 (p1) 인스턴스(p1.name = " apple" /
 * p1.price=1500) [heap: 동적] | [stack : 잠깐빌리기]
 * 
 * p1.show(){} 1번지 p1.input(){} { name, price, input(), show() } <- p1 [1번지]
 * 
 * | main ------------------------------------
 * 
 */
