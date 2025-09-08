package com.company.java005_ex;

public class ForEx005_1 {
	public static void main(String[] args) {
		int cnt=0;
		char ch=' ';
		for (ch = 'a';ch <='z'; ch++) {
		switch (ch) {
		case 'a' : case 'e' : case 'i' : case 'o' : case 'u': cnt++; break;
		}
	}
		
		System.out.println("소문자 a~z 까지 모음의 갯수>" + cnt);
	}
}

