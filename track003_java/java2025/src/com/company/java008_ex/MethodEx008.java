package com.company.java008_ex;

import java.util.Arrays;

public class MethodEx008 {
	
	public static void upper(char[] ch) {
		System.out.println(ch);
		// 'A'(65) = 'a' (97) -32
		for (int i=0; i<ch.length; i++) { ch[i]-=32;}
			System.out.println("upper.배열값:" + ch + Arrays.toString(ch));
		}
		
	
	
	//////////////////////////////////////////
	public static void main(String[] args) {
		char[] ch= {'a', 'b', 'c'};
		upper(ch);
		System.out.println("main. 배열값:" + Arrays.toString(ch));
		
		
	}// end main
    /////////////////////////////////////////



	
	
}// end class
