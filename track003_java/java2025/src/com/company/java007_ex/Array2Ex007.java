package com.company.java007_ex;

public class Array2Ex007 {
	
	public static void main(String[] args) {
		
		int[][] i = new int [4][4];
		
		int data = 1;
		
		for (int ch=0;ch<i.length; ch++) {
			
			for (int kan=0; kan<i[ch].length; kan++) {i[ch][kan] = data++;
				
			} //for 2  칸 4개에 data 입력
			
			data=1;// 다음칸 1로 리셋
			
		} //for 1
		
		for (int ch=0;ch<i.length; ch++) {
			
			for (int kan = 0; kan<i[ch].length; kan++) {
				System.out.print(i[ch][kan] + " ");
			}// 칸 출력
			
			System.out.println();
		}// 층 출력
		
	}// end main

}// end class
