package com.company.java008;

public class Method2 {
	//(1) 마법상자 정의 - 코드재사용
	//public static 리턴값(결과물)  메서드명(파라미터){ }
	public static void myint(int a) { System.out.println(a);}
	public static void ten(int money) { System.out.println( money*10);}
	public static void add(int money, int bitcoin) { System.out.println(money + bitcoin);}
	///////////////////////////////////////////////
	public static void main(String[] args) {
		//(2) 사용
		//public static void myint(int a) {System.out.println();}
								myint(1);
								myint(3);
								
		//public static void ten(int money) { System.out.println( money*10);}
								ten(1); // int money=1
		//public static void add(int money, int bitcoin) { System.out.println(money + bitcoin);}
								add(100, 20); // int money=100, int bitcoin=30
								add(200, 30); // int money=100, int bitcoin=30
		
	}// end main
    ///////////////////////////////////////////////
}// end class
