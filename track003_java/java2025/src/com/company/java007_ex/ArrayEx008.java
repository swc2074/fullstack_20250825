package com.company.java007_ex;

public class ArrayEx008 {
	public static void main(String[] args) {
		// 변수
		
		String[] name = {"아이언맨","헐크","캡틴", "토르","호크아이"};
		int[] kor = {100,20,90,70,35};
		int[] eng = {100,50,95,80,100};	
		int[] mat = {100,30,90,60,100};
		int[] aver= new int[5];
		
		String[] pass = new String[5];
		String[] jang = new String[5];
	
		for (int i=0; i<name.length;i++) {
		aver[i] = (kor[i] + eng[i] + mat[i])/3;
		pass[i] = aver[i] >=60 ? "합격" : "불합격";
		jang[i] = aver[i] >=95 ? "장학생" : "-";
		}
		
		//출력
		
		System.out.println("====================================================");
		System.out.print("이름\t국어\t영어\t수학\t평균\t합격여부\t장학생\n");
		System.out.println("====================================================");
		
		for(int i=0; i<name.length;i++) {
		System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%-5s\t%-5s\n",
				name[i],kor[i],eng[i],mat[i],aver[i],pass[i],jang[i]);
		}
		
		System.out.println("====================================================");
	
	}// end main

}// end class
