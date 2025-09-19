package com.company.java0919;

public class Test20250919_2 {

	public static void main(String[] args) {

		int[][] ch = new int[2][3];
		int data = 101;
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				ch[i][j] = data++;
			}
             data = 201; // 각 층마다 끝나고 해야 할일
		}
        
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.print(ch[i][j] + " ");
			}
			System.out.println();
		}
	}
}
