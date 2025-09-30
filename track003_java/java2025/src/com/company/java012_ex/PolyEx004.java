package com.company.java012_ex; 
//Q1. 상속도 그리기 
     //                                        생성자     객체
/* 
              Object                            3           4
                ↑									
* 		     Papa  {money = 10000/ sing - GOD}       2           5
* 		        ↑
             Son  {money = 1500/ @sing - 빅뱅}         1		    6
	
*/

//Q2. 각클래스에서 사용할수있는 멤버변수/멤버메서드
class Papa extends Object{ 
	int money = 10000;  // 멤버 변수
	public Papa() { super(); } //멤버 메서드
	public void sing() {  System.out.println("GOD-거짓말");  } // 멤버 메서드
}// end class


class Son extends Papa{ 
	int money = 1500; // 멤버 변수
	public Son() { super(); } //멤버 메서드
	@Override public void sing() {  System.out.println("빅뱅-거짓말"); } //멤버 메서드
} // end class


public class PolyEx004 {
public static void main(String[] args) { 
   Papa mypapa = new Son();    // 부모 = 자식 ( 업캐스팅/ 타입캐스팅 x)
   // Q3. Papa mypapa 의미?
         // ==> A: Papa 자료형 쓸수 있어! {int money = 10000 /sing()} - {} 
   // Q4. 인스턴스화한 실제 메모리 빌려온그림
         // ==> {int money = 1500/  [@sing()-빅뱅} - { int money =1000] /----}
   System.out.println(mypapa.money); // Q5.  출력   10000
     
   mypapa.sing();  //Q6. 출력 빅뱅 - 거짓말
    // ★ Q7. mypapa.money 를 이용해서  1500 출력되게 해주세요.
    System.out.println(((Son)mypapa).money);
    
}
}


/////////////////////////////////////////////////