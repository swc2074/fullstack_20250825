package com.company.java006_ex;

public class ArrayEx3 {
	public static void main(String[] args) {

		// 변수
		int count = 0;

		// 입력
		// 처리
		// ver -1 만약 'B'가 'a' 라면 카운트 , 만약 'a' 가 'a' 라면 카운트
		// ver -2 if('B' 가 'a' 라면) if (만약 'a' 가 'a'라면){카운트}

		char[] arr = { 'B', 'a', 'n', 'a', 'n', 'a' };

		for (int d = 0; d < arr.length; d++) {
			if (arr[d] == 'a') {
				count++;
			}
			
		}
		System.out.print(count);
	} // end main

}// end class
