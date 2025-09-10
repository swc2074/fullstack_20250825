package com.company.java005_ex;

public class RepeatEx009 {
	public static void main(String[] args) {
		//2. 변수
		
		//3. 입력 + 처리
		  // ver 1 제일작은 단위 해야 할일 - 1이 3의 배수
		
		
		//1. 출력  1~10까지 
       int num = 0;
		for (int i = 1; i <= 10; i++) {
			if (i%3 == 0) {num+=i;}
		}
		System.out.println(num);
		
		
		
		num = 0;
		int i1 =1;
		while(i1<=10) {if (i1%3 == 0) {num+=i1;}
		i1++;
		}
		System.out.println(num);
		
		num = 0;
		int i2 = 1;
		do {if (i2%3 == 0) {num+=i2;}
		i2++;
		}while(i2<=10);
		System.out.println(num);
		
		
	}
}
	
		

		

	
