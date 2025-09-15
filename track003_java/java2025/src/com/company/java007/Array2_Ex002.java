package com.company.java007;

import java.util.Arrays;

public class Array2_Ex002 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, // 00 01 02
				{ 4, 5, 6 } // 10 11 12
		};
		System.out.println(arr); // [[I@28a418fc
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr));

		// ver-1 눈에 보이는대로
		System.out.print(arr[0][0] + "\t");
		System.out.print(arr[0][1] + "\t");
		System.out.print(arr[0][2] + "\t");
		System.out.println();
		System.out.print(arr[1][0] + "\t");
		System.out.print(arr[1][1] + "\t");
		System.out.print(arr[1][2] + "\t");
		System.out.println();

		// ver-2 칸정리 {반복} {변수} for ( 시작, 종료, 변화)
		for (int kan = 0; kan <= 2; kan++) {
			System.out.print(arr[0][kan] + "\t");
		}
		System.out.println();
		for (int kan = 0; kan <= 2; kan++) {
			System.out.print(arr[1][kan] + "\t");
		}
		System.out.println();

		// ver-3 층정리
		System.out.println("ver-3");
		for (int ch = 0; ch <= 1; ch++) {
			for (int kan = 0; kan <= 2; kan++) {
				System.out.print(arr[ch][kan] + "\t");

			}
			System.out.println();
		}

		System.out.println("ver-4");
		for (int ch = 0; ch < arr.length; ch++) {
			for (int kan = 0; kan < arr[ch].length; kan++) {
				System.out.print(arr[ch][kan] + "\t");

			}
			System.out.println();
		}

	} // end main

} // end class
