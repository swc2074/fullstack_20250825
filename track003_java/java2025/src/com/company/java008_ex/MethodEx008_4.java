package com.company.java008_ex;

import java.util.Arrays;

public class MethodEx008_4 {
	
	/////////////////////////////////////////
	public static void main(String[] args) {
		String[][] apt = {
				{"아이유", "손흥민", "BTS"},
				{"이정재", "리사", "유재석"},
				{"박지성", " 강호동", "마동석"},
		};
		
		System.out.println("MAIN > APT - \n" + Arrays.deepToString(apt));
		ringBell( apt);
		System.out.println("MAIN > APT - BELL\n" + Arrays.deepToString(apt));
	}
	////////////////////////////////////////
	public static void ringBell(String[][] apt) {apt[1][1] = "🎉🎉"; }
}

/* 

[heap]									[stack]
1000번지 apt[3][3]                        apt[1000번지]
apt [  0층 1001번지 | 1층 1002번지
  0층   1001번지 | {"아이유", "손흥민", "BTS"},
  1층 1002번지		{"이정재", "리사", "유재석"},
  2층  1003번지 ]	{"박지성", " 강호동", "마동석"},
    |
 */
