package com.company.java0915;

public class ArrayTest0915 {
	public static void main(String[] args) {
		
		char[] ch = new char[3];
		
		char data = 'a';
		for (int i=0;i<ch.length;i++) {
			ch[i]=data++;
		}
		for (int i=0;i<ch.length;i++) {
			System.out.print(ch[i] + " ");
		}
		
	}

}
