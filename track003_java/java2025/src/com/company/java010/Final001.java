package com.company.java010;

//1. final 변경하지마
// 클래스는 부품 객체
// 클래스는 상태 (멤버변수 ) 와 행위 (멤버함수)
// 상속 x    [상수: 변하지 않는 값]                             override x 



final class FinalEx extends Object{
	final static String gaecheon = "10-3"; // 클래스 변수  - method - new x - 생성자 - this x > now
	String name; // 인스턴스변수 - heap  - new o - 생성자 o - this o > 메모리 각각
	 final void show() {System.out.println( FinalEx.gaecheon + "\t" + name);}
		
}

/*
class FinalSon extends FinalEx{

	//@Overridevoid show() {super.show(); // 오버라이드  -상속시 자식클래스에서 부모의 클래스를 재수정}

		
	
}

*/

//////////////////////////////////////////////////////////

public class Final001 {

	public static void main(String[] args) {
		//FinalEx.gaecheon = "10-1";  // The final field FinalEx.gaecheon cannot be assigned
		FinalEx saram = new FinalEx();
		saram.name = "sally";
		saram.show();
	}

}
//////////////////////////////////////////////////////////