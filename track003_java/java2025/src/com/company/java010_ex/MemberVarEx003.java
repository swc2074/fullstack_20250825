package com.company.java010_ex;

//- 문제 1. 다음 코드에서 인스턴스변수, 클래스변수, 지역변수를 구분하시오.  ( 보관되는 영역도 추가 )
//- 문제 2. 인스턴스메서드와 클래스메서드를 구분하시오.  
//- 문제 3. 오류가 발생하는 이유를 설명하시오.
//- 문제 4. runtime data area 위치영역 그림그리기
//- 문제 5. 다음과 같이 출력되도록 코드를 작성하시오.
/*:: 주인 이름: std-1
총 음식량: 175
전체 급식판 수: 1


:: 주인 이름: std-2
총 음식량: 175
전체 급식판 수: 2

*/

//1. 클래스는 부품 객체
//2. 클래스는  상태 ( 멤버변수 ) 와 행위 (멤버함수)

/*
 *        초기화순서 : 초기값   명시적초기화   초기화 블록   생성자
 *   /////////////////////////////////////////////////////     
 *    trayCount      0       = 0          x 0        공용으로사용관련 x
 *        maxRice     0	     = 100		  x 100      생성자안에서 클래스변수 사용가능
 *   /////////////////////////////////////////////////////     
 * owner              null   x null       x null    x null
 * rice                0        90        x 90       x 90
 * soup				   0		85 		  x  85      x 85
 */

class LunchTray {
	//멤버 변수 (클래스변수 : 공용, 인스턴스변수:this (각각), 지역변수 : 임시
  String owner;                 	// 인스턴스 변수  - heap area - new 0  - 생성자 0 - this
  int rice = 90;        			//     
  int soup = 85;        			// 인스턴스 변수  - heap area - new 0  - 생성자 0 - this       

   
  static int trayCount = 0;     	// 클래스 변수 - method area  - new x 생성자 x  - now

  //static int totalFood = rice + soup; // static 은  this 사용 불가

  static int maxRice = 100;     	// 클래스 변수 - LunchTray.maxRice

  // 멤버함수
  public LunchTray() {
	  // owner 이름 : std-1 , 급식판수 숫자올리기
	  this.owner = "std-" + ++trayCount;
  }
  
  
  
  
  
  public int getFoodAmount() {      // 인스턴스 메서드  - heap - new 0 - 생성자 0 - this
      return rice + soup;         
  }

  public static void showTrayCount() { // 클래스 메서드 - 
      System.out.println("전체 급식판 수: " + trayCount);   
  }

  public static void showOwner() {     // 클래스 메서드
     //System.out.println(this.owner);       // static 은  this 사용 불가
	  
  }

  public void showTray() { 				//인스턴스 메서드
      System.out.println("\n\n:: 주인 이름: " + this.owner);   // this             
      System.out.println("총 음식량: " + getFoodAmount());     // static 
  }
}
// LunchTray() {  owner

//////////////////////////////////////////////////////////////////////////

public class MemberVarEx003 {
 public static void main(String[] args) {
      LunchTray tray1 = new LunchTray();   
      tray1.showTray();                    
      LunchTray.showTrayCount();       // 클래스.메서드  

      LunchTray tray2 = new LunchTray();   
      tray2.showTray();                   
      LunchTray.showTrayCount();         
 }
} 
//////////////////////////////////////////////////////////////////////////


/*
------------------------[ runtime data area]
[method: 정보, static, final : 공용정보]

trayCount, maxRice, getFoodAmount(), showTrayCount(), showOwner(), showTray()

------------------------------------


[heap: 동적]            | [stack : 잠깐빌리기]







------------------------------------






*/
