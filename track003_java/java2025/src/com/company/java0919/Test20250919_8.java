package com.company.java0919;

import java.util.Arrays;

public class Test20250919_8 {

	
	  public static void print(int[]arr) { for(int i=0; i<arr.length; i++) {
	  arr[i]+=10; } }

	   ////////////////////////////////////////////////
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		System.out.println(print(arr[1]));
		// ==>1. 예상되는 결과: 출력 2  arr[1]의 주소에 있는 값 2

		print(arr);
		System.out.println(Arrays.toString(arr));
		// ==>2. 예상되는 결과: 출력 11,12,13 출력 

		////////////////////////////////////////////

	}// end main

	   private static int print(int i) {
		
		return i;
	   }

}// end class
