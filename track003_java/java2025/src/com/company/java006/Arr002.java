package com.company.java006;

import java.util.Arrays;

public class Arr002 {
	public static void main(String[] args) {
		// 1. new
		// 주소담을꺼야! 1000번지 - 같은 자료혀 연달아서 저장
		// arr(1000번지) [0][1][2]
		int[] arr = { 1, 2, 3 };

		int[] arr2 = new int[3]; // new 공간빌리기 int형태의 자료형 몇개
		System.out.println(arr2); //
		System.out.println(Arrays.toString(arr2)); // [0,0,0]

		// for 로 줄이기
		int data = 10;
		arr2[0] = data;
		/* 10 */ data += 10; /* data (20) */
		arr2[1] = data;
		/* 20 */ data += 10; /* data (30) */
		arr2[2] = data;
		/* 30 */ data += 10; /* data (40) */
        data = 10;
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = data;
			data += 10;
		} // 데이트 넣고, 10 증가

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");

		}
	}// end main

} // end class
