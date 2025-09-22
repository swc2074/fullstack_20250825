package com.company.java009_ex;

import java.util.Scanner;

class Coffee {
	String name;
	int price, num;

	public Coffee() {
		this.name = "아메리카노";
		this.num = 1;
		this.price = 2000;

	} // 제일 많이 사용하는 기본값

	public Coffee(String name, int price, int num) {
		super();
		this.name = name;
		this.price = price;
		this.num = num;
	}

	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + ", num=" + num + "]";
	}

	void show() {
		System.out.println("======커피");
		System.out.println("커피명:" + this.name);
		System.out.println("커피잔수:" + this.num);
		System.out.println("커피가격:" + this.price * this.num);

	}

}

///////////////////////////////////////////////////
public class ClassEx003 {

	public static void main(String[] args) {
		Coffee a1 = new Coffee("까페라떼", 2, 4000);
		a1.show();
		Coffee a2 = new Coffee();
		a2.show();
	}

}
////////////////////////////////////////////////////