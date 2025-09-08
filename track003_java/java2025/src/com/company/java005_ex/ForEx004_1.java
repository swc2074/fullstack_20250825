package com.company.java005_ex;

public class ForEx004_1 {
	public static void main(String[]args) {
		
		int i=0,cnt =0;
		String result="";
		for ( i=1;i<=10;i++) {
			if(i%3 ==0 ) {cnt++; result += (i==3 ? "" : ",") + i ;} // () 3,6,9
			  
		}
		//출력
		System.out.println("3의 배수 :" + result);
		System.out.println("1~10 까지의 3의배수 의 갯수 :" + cnt);
	}

}
