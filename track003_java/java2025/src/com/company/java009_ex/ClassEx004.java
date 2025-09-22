package com.company.java009_ex;

import java.util.Scanner;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)

class TV {
	// 상태 - 멤버변수 : 채널/볼륨
	String channel;
	int volume;

	// 행위 - 멤버함수 : 채널, 볼륨 입력 : input()/출력 : show()
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("* channel입력>");
		this.channel = sc.next();
		System.out.print("* volume 입력> ");
		this.volume = sc.nextInt();
	}

	void show() {
		System.out.println(this.channel + "\t" + this.volume);
	}

	public TV() {
		super();

	}

	public TV(String channel, int volume) {
		super();
		this.channel = channel;
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "TV [channel=" + channel + ", volume=" + volume + "]";
	}

}

////////////////////////////////////////////////
public class ClassEx004 {

	public static void main(String[] args) {
		TV t1 = new TV("JDBC", 8);
		t1.show();
		TV t2 = new TV();
		t2.input();
		t2.show();

	}

}
/////////////////////////////////////////////////