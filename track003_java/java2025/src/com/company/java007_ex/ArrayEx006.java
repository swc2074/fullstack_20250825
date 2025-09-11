package com.company.java007_ex;

public class ArrayEx006 {
	public static void main(String[] args) {
		// 변수
		
		double[] arr = new double[5];
		double data = 1.1;
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = data;
			data += 0.1;
		}
		for (int i = 0; i<arr.length; i++) {
			System.out.printf("%.1f\t",arr[i]);
		}
		
	}// end main

}// end class
