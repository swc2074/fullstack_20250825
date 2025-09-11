package com.company.java007_ex;

public class ArrayEx007 {
	public static void main(String[] args) {
		// 변수
		
		char[] arr = new char[5];	
		char data = 'A';
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = data++;
		
		
		}
		//출력
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}// end main

}// end class
