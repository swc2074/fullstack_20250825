package com.company.java0918;

public class Repeat019 {

	// 메서드
	public static void start() {
		System.out.println("부우웅...");
	}

	public static void scan(int sc, char ch) {
		for (int i = 0; i < sc; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}

	public static String signalGrade(int st) {
		if (st >= 90) {
			return "A";
		} else if (st >= 80) {
			return "B";
		} else if (st >= 70) {
			return "C";

		} else if (st >= 60) {
			return "D";
		} else {
			return "강도 없음";
		}
	}

	public static int charge(int a, int b) {
		return a + b;
	}

	////////////////////////////////////////////

	public static void main(String[] args) {

		System.out.println(" 탐사 로봇이 기동합니다!");
		start();

		System.out.println("행성스캔 중...");
		scan(5, '#');

		System.out.println(" 신호 강도 분석 결과:");
		System.out.println(" 신호등급:" + signalGrade(65));

		System.out.println(" 배터리 충전 중...");
		System.out.println(" 충전완료:" + charge(40, 40) + "%");

	}// end main

}// end class
