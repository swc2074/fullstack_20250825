package com.company.java1017;


interface InterC2{String hi();}
interface  REx2{  void print(String s);     } 

public class Interface_Inter_test_20251017_1 {

	public static void main(String[] args) {
		// 1) 익명객체
		InterC2 c = new InterC2() {

			@Override public String hi() {  return "hello"; }
			
		};
			System.out.println(c.hi());
			
		// 2) 람다식
			InterC2 c2 = () -> "hello2";
			System.out.println(c2.hi());
			

			REx2 ex4 = System.out::println;
			ex4.print("hello");

	}//end main

}// end class
