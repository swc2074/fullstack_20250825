package com.company.java009_ex;

import java.util.Scanner;

class MyPrice001{
	String name;
	int price;
	
	void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("상품이름 입력>");
		name = sc.next();
		System.out.println("상품가격 입력>");
		price = sc.nextInt();
				}
	void show() {
		System.out.println(" 상품정보입니다.");
		System.out.println(" 상품이름:" + name + "/" + "상품이름 :" + price);
	}
}




//////////////////////////////////////////////////
public class Class002 {

	
	public static void main(String[] args) {
		MyPrice001 p1 = new MyPrice001();
		p1.input();
		p1.show();

	}

}
////////////////////////////////////////////////