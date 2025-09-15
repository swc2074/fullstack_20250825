package com.company.java007_ex;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Array2Ex008 {

	public static void main(String[] args) {

		// data 및 변수
		int[][] datas = { { 10, 10, 10, 10 }, { 20, 20, 20, 20 }, { 30, 30, 30, 30 } };

		int[][] result = new int[datas.length + 1][datas[0].length + 1];

		// 입력
		// 처리(1) 가로방향
		
		// 처리(2) 세로방향
		// 처리(3) 전체데이터

		for (int ch = 0; ch < result.length; ch++) {

			for (int kan = 0; kan < result[ch].length; kan++) {
				
				result[ch][kan] = datas[ch][kan];

			} // end for 2
			System.out.println();

		} // end for 1

		for (int ch=0;ch<result.length-1; ch++) {
			
			for (int kan = 0; kan < )
		}
		
		
		// 출력
		for (int ch = 0; ch < result.length; ch++) {

			for (int kan = 0; kan < result[ch].length; kan++) {
				System.out.print(result[ch][kan] + "\t");
				
				

			} // end for 2
			System.out.println();

		} // end for 1

	}// end main

}// end class
