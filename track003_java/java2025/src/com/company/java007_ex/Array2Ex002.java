package com.company.java007_ex;

public class Array2Ex002 {
	public static void main(String[] args) {
		
		int[][] arr2= {
				{101,102,103}, {201,202,203}
		};
		
		for(int ch=0;ch<arr2.length; ch ++)  {
			for (int kan=0; kan<arr2[ch].length; kan++) {
				System.out.print(arr2[ch][kan] + "\t");
			}
			System.out.println();
		}
	
	}

}
