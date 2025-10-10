package com.company.java20251010_test;

class Coffee012{
	String name;
	int price, num;
	
	void show() {
		System.out.println("===== 커피"
				+"\n커피명: " + this.name
				+"\n커피잔수: " + this.num
				+"\n커피가격: " + this.price);
	}

	

	public Coffee012(String name, int price, int num) {
		super();
		this.name = name;
		this.price = price;
		this.num = num;
	}

	@Override
	public String toString() {
		return "Coffee012 [name=" + name + ", price=" + price + ", num=" + num + "]";
	}
	
	Coffee012(){this.name = "아메리카노"; this.num = 1; this.price = 2000;
	
	}
	
}//end class




public class TestJava1010_01 {
	public static void main(String[] args) {
		Coffee012 a1 = new Coffee012("까페라떼",2,4000);
		a1.show();
		Coffee012 a2 = new Coffee012();
		a2.show();
		
	}//end main

}// end class main
