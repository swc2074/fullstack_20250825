package com.company.java007_ex;

public class Array2Ex006 {
	public static void main(String[] args) {
		
		int[][] i= new int[5][5];
		
		
		int data = 1;
		for ( int ch=0 ; ch<i.length; ch++) {
			
			for (int kan=0 ; kan<i[ch].length; kan++) {
				i[ch][kan] =data++;
				
			} // end for 2
			
		}// end for 1
		
	
		for ( int ch=0; ch<i.length; ch++) {
			
			for (int kan=0; kan<i[ch].length; kan++) {
				System.out.print(i[ch][kan] + " ");
			}
			System.out.println(
					);
		}
	}// end main

}
// end class
