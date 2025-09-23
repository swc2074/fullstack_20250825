package com.company.java010_ex;

class Mobile2 {
	// 변수
	String serialNo;  // 인스턴스 변수 , heap area, new 0  , this, 생성자 0
	static int count = 0; // 클래스 변수 , method , new x , this x , 생성자 x  지금당장바로 ~ !
	
	//행위 : 멤버함수
	
	public Mobile2() {
		// 객체를 한개씩 만들때마다  serialNo에 숫자를 한개씩 증가시키는데   ++ count
			this.serialNo = "2030-" + ++count;

}
}
/////////////////////////////////////////////////////

public class StaticEx002 {

	public static void main(String[] args) {
		   Mobile2 m1 = new Mobile2(); //1. new 공간빌리기  2. 생성자()  3. 번지
		   Mobile2 m2 = new Mobile2(); 
		   Mobile2 m3 = new Mobile2();  
		   Mobile2 m4 = new Mobile2();  

		   System.out.println("모바일 갯수는 모두 "+ Mobile2.count +"개 입니다.");  // 클래스명.변수   클래스변수  4 
		   System.out.println("m1의 제품번호 " + m1.serialNo);  //1  m1(1번지).변수명     2023-1
		   System.out.println("m2의 제품번호 " + m2.serialNo);  //2
		   System.out.println("m3의 제품번호 " + m3.serialNo);  //3
		   System.out.println("m4의 제품번호 " + m4.serialNo);  //4
		  }
	}


/////////////////////////////////////////////////////

/*
 * ------------------------[ runtime data area] [method: 정보, static, final :
 * 공용정보]
 * 
 * Area1.pi, Area1.rect(), Area1.triangle() ------------------------------------
 * [heap: 동적] | [stack : 잠깐빌리기] ------------------------------------
 * 
 * 
 * 
 * 
 */