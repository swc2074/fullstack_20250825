package com.company.java1017;


interface  Ex2{  void print(String s);     }  // (String s)-> x


public class Interface_Inter_test_20251017 {

	public static void main(String[] args) {
		Ex2 ex3 = new Ex2() {

			@Override public void print(String s) { }
			
		};
		ex3.print(ex3."hello");
	
		Ex2 ex4 = System.out::println;
		ex4.print("hello");

	}//end main

}// end class
