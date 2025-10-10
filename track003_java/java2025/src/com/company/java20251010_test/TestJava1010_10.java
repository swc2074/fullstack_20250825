package com.company.java20251010_test;

import java.util.Scanner;

public class TestJava1010_10 {
	public static int nextInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1을 입력하세요");
		return scanner.nextInt();
	}
	public static void main(String[] args) {
		int one = 0;
		while(true) {one = nextInt();
		if(one == 1) {break;}
		}
	}

}
