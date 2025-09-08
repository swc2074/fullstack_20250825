package com.company.java005_ex;

public class ForEx004 {
	public static void main(String[]args) {
		
		int i=0,cnt =0;
		
		for ( i=1;i<=10;i++) {
			if(i%3 ==0 ) {cnt++;}
			
		}
		
		System.out.println("1~10 까지의 3의배수 의 갯수 :" + cnt);
	}

}
