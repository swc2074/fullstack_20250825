package com.company.java007;

public class Arr2_002 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3]; // 2층 3칸
										// 00 01 02
										// 10 11 12
										// 20 21 22

		int data = 1;
		// arr[][] = data++; arr[][] = data ++ ; arr [][] = data ++ ;
		for (int ch = 0; ch < arr.length; ch++) {
			for (int kan = 0; kan < arr[ch].length; kan++) {
				arr[ch][kan] = data++;
			}
		}

		for (int ch = 0; ch < arr.length; ch++) { // 아파트 층 ( 몇층이니?)
			for (int kan = 0; kan < arr[ch].length; kan++) { // 층은 몇칸이니?
				System.out.print(arr[ch][kan] + " \t");
			}
			System.out.println();
		}

	}// end main

}// end class
