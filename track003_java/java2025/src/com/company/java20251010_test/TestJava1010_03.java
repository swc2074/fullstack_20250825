package com.company.java20251010_test;

class Sawon005{
	int pay = 10000;
	
	static int su = 10;
//static int basicpay = 0; ////###000  ==> pay 가 상수값 
	static int basicpay2;
	static {basicpay2 = 20000;}
	
	public static void showSu() {System.out.println(su);}////###001
//==> 필요없음.
	//public static void showPay() {System.out.println(this.pay);}////###002
	public void showAll001() { //// ###003
		System.out.println(su);
		System.out.println(this.pay);
	}
//==> showAll002 필요없음
	//public static void showAll002{////###004
	//showAll001();
	//System.out.println(this.pay);
		
	//}
	
}// end class

public class TestJava1010_03 {
	public static void main(String[] args) {
		Sawon005 sola = new Sawon005();
		sola.showAll001();
	}// end main

}// end class
