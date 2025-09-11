package com.company.java007_ex;

public class ArrayEx008_2 {
	public static void main(String[] args) {
		// 변수
		
		String[] name = {"아이언맨","헐크","캡틴", "토르","호크아이"};
		int[] kor = {100,20,90,70,35};
		for(int i=0;i<kor.length;i++) {System.out.println(i);}
		
		int[] eng = {100,50,95,80,100};
		for(int i=0;i<kor.length;i++) {System.out.println(i);}
		
		int[] mat = {100,30,90,60,100};
		double[] aver= new double[5];
		int[] total = new int[5];
		String[] pass = new String[5];
		String[] jang = new String[5];
	
		for (int i=0;i<name.length;i++) {System.out.print(name[i] + " ");
		}
		System.out.println();
		
		for (int i=0;i<kor.length;i++) {System.out.print(kor[i] + " ");
		}
		System.out.println();
		
		for (int i=0;i<eng.length;i++) {System.out.print(eng[i] + " ");
		}
		System.out.println();
		
		for (int i=0;i<mat.length;i++) {System.out.print(mat[i] + " ");
		}
		
		System.out.println();
		int i=0;
		total[i] = kor[i] + eng[i] + mat[i];
		for (i=0;i<total.length;i++) {System.out.println(aver[i] + " ");
		}
		
		aver[i] = total [i]/3.0;
		for (i=0;i<aver.length;i++) {System.out.println(aver[i] + " ");
		}
		
		
		/*
		//처리
		int total[i] = kor[i] + eng[i] + mat[i];
	
		for (int i = 0; i < aver.length; i++) {
			
		
		}
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		//출력
		
		
		for
		System.out.println("=============================================");
		System.out.print("이름\t국어\t영어\t수학\t평균\t합격여부\t장학생");
		System.out.println("=============================================");
		System.out.print("%-5s\t%-5d\t%-5d\t%-5d\t%-5.2f\t%-5s\t%-5s",
				name,kor,eng,mat,avg,pass,jang);
		
		
		System.out.println("==============================================");
		*/
	}// end main

}// end class
