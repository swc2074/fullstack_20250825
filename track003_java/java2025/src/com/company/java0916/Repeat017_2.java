package com.company.java0916;

public class Repeat017_2 {
	public static void main(String[] args) {
		// 변수
		char[][] arr = new char[2][3];
		
		char data = 'A';
		
		// 입력 
		for(int ch=0; ch<arr.length; ch++) {
			
			for(int kan=0; kan<arr[ch].length; kan++) {
				arr[ch][kan]=data++;
				
			}
			data = 'B';
		}
		
		//출력
			for(int ch=0; ch<arr.length; ch++) {
			
			for(int kan=0; kan<arr[ch].length; kan++) 
				{System.out.printf(arr[ch][kan] + " ");
			}
			System.out.println();
			}
			
			
	}//end main

}//end class
