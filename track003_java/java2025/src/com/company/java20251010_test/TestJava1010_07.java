package com.company.java20251010_test;



class Papa extends Object{
	int money =10000;
	public Papa() {super();}
	public void sing() {System.out.println("GOD-거짓말");}
} // end class Papa

class Son2 extends Papa{
	int money = 1500;
	public Son2() {super();}
	@Override public void sing() { super.sing();System.out.println("빅뱅-거짓말");}
	
}// end class Son2

public class TestJava1010_07{
	public static void main(String[] args) {
		Papa mypapa = new Son2();
		System.out.println(mypapa.money);  // 예상되는 출력값: 10000
		mypapa.sing(); // 예상되는 출력값: 빅뱅-거짓말
		
		System.out.println(((Son2)mypapa).money);
	}
}

