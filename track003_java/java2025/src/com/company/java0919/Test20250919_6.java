package com.company.java0919;

public class Test20250919_6 {
	
	public static void alph(char ch) {
		char[][] arr = new char[2][3];
		
		char data = 'A';
		for(int i=0;i<arr.length; i++) {
			
			for(int j=0;j<arr[i].length; j++) {
				arr[i][j]=data++;
				
			}
		    data = 'a';
		}
		
		for(int i=0;i<arr.length; i++) {
			
			for(int j=0;j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
		}
		
		
		
	}
	
	/////////////////////////////////////////
	public static void main(String[] args) {
		
		alph('A');
		
	}

		
	
	/////////////////////////////////////////
}
