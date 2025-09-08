package com.company.java005_ex;

public class ForEx001 {
	public static void main(String[] args) {
		for (int i=1; i<=5; i++ ) {
			System.out.println(i + "\t");}
		
		System.out.println();
		for (int i=5; i>=1; i-- ) {
			System.out.println(i + "\t");}
		
		System.out.println();
		for (int i=1; i<=3; i++ ) {
			System.out.println("JAVA" + i + "\t");}
		
		System.out.println();
		for (int i=3; i>=1; i-- ) {
			System.out.println("HAPPY" + i + "\t");}
		
		System.out.println();
		for (int i=0; i<=2; i++ ) {
			System.out.println( i + "\t");}
		
		System.out.println("\n\nq5-2");
		for(int i=0; i<=2; i++) {System.out.print((i==0 ? " ": ",") + i );}
		
		System.out.println();
		for (int i=0; i<=99; i++ ) {
			System.out.println( i + "\t");}
		
		for (int i=0; i<=99; i++) {System.out.print((i==0 ? "" : ",")+i); }
		
		
		System.out.println();
		for (int i=10; i>=1; i-- ) {
			System.out.println( i + "\t");}
		
		for(int i=10; i>=1; i--) {System.out.println((i==10 ? "" : ",") + i);}

		System.out.println();
		for (int i=0; i<=8; i=i+2 ) {
			System.out.println( i + "\t");}
		
		for (int i=0; i<=8; i=i+2) {System.out.print((i==0 ? "":",") + i);}
		
		System.out.println();
		for (int i=0; i<=18; i=i+2 ) {
			System.out.println( i + "\t");}
		for (int i=0; i<=18; i=i+2) {System.out.print((i==0 ? " " : ",")+i);}
		
	}

}
