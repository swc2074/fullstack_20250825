package com.company.java0917;

public class Repeat018 {

	// method
	public static void dog() {
		System.out.print("멍멍");
	}

	public static void disp(int a, char ch) {
		for (int i = 0; i < a; i++) {
			System.out.print(ch);
		}
			
	}

	public static String stdAvg(int score) {
		if (score >= 90) {
			return "A";
		} else if (score >= 80) {
			return "B";
		} else if (score >= 70) {
			return "c";
		} else {
			return "D";

		}
	}

	//////////////////////////////////////////
	public static void main(String[] args) {

		System.out.println("🐶 강아지가 등장합니다. !");
		dog();

		System.out.println("\n🎯 강아지가 시험을 봤습니다. 점수를 공개합니다!");
		disp(7, '*');

		System.out.println("\n📊 평가 결과는?");
		System.out.println("당신의 평균은?" + stdAvg(60));

	}// end main

	//////////////////////////////////////////

}// end class
