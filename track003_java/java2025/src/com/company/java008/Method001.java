package com.company.java008;

public class Method001 {
	//(1) 마법상자 - 코드재사용
	//public static 리턴값(결과물)  메서드명(파라미터){ }
	public static void hell() { System.out.println("Hello");}
	
	public static void line() {System.out.println();}
	public static void smile() {System.out.print(":)");}
	///////////////////////////////////////////////
	public static void main(String[] args) {
		//(2) 마법상자사용
		smile();hell();
		line();
		hell();
		hell();
		line();
		smile();hell();
		hell();
		
	}// end main
    ///////////////////////////////////////////////
}// end class
