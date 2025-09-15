package com.company.java007_ex;

public class Array2Ex004_1 {

	public static void main(String[] args) {

		char[][] chars = new char[2][3];

		char data = 'A';

		for (int ch1 = 0; ch1 < chars.length; ch1++) {
			
			for (int kan = 0; kan < chars[ch1].length; kan++) {
				chars[ch1][kan] = data++;
			}
			 data = 'B'; // 한층이 끝나면 해야할일
	
		}

		for (int ch = 0; ch < chars.length; ch++) {
			for (int kan = 0; kan < chars[ch].length; kan++) {
				System.out.print(chars[ch][kan] + " ");
			}

			System.out.println();
		}
	}

}
