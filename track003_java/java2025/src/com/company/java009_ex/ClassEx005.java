package com.company.java009_ex;

import java.util.Scanner;

//1. 클래스는 부품객체
//2. 클래스는 상태 (멤버변수) 와 행위(멤버함수)
class Card {

	int cardNum;
	boolean isMembership;

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		cardNum = sc.nextInt();

	}

	void show() {
	}

	public Card() {
		super();

	}

	public Card(int cardNum, boolean isMembership) {
		super();
		this.cardNum = cardNum;
		this.isMembership = isMembership;
	}

	@Override
	public String toString() {
		return "Card [cardNum=" + cardNum + ", isMembership=" + isMembership + "]";
	}

}// end class

////////////////////////////////////////////////
public class ClassEx005 {

	public static void main(String[] args) {
		Card c1 = new Card();
		System.out.println(c1);

	}

}
///////////////////////////////////////////////