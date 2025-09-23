package com.company.java010_ex;


/*
 * 1. 인스턴스변수, 클래스변수, 지역변수 를 구분하시오.
2. 인스턴스메서드, 클래스메서드 구분하시오.
3. 오류나는 이유는?
*/

class Sawon3{ 
	
    int pay      =10000;  // 1. 인스턴스변수  - heap area  - new 0  - 생성자
    
    static int su=10;     // 클래스 변수  - method area   - new x  - 생성자 x  > 바로 사용
    //static int basicpay=pay;    // 클래스 변수 - method area - new x - 생성자 x  > 바로사용 클래스명. basicpay
    							// static은 this사용 불가 / 당장사용해야하는데 this를 쓰려면 new 하고 난 다음에
    static int basicpay2;    // 클래스 변수 - method area  - new x - 생성자 x  > 바로 사용가능
    
    //클래스 메서드 - method area  - new x - 생성자 x - Sawon3.showSu() > 바로 사용
    public static void showSu() {   System.out.println(su);  }   
    
  //클래스 메서드 - method area  - new x - 생성자 x - Sawon3.showPay() > 바로 사용
    // static은 this 사용 불가 / this. (각각) new 사용
    //public static void showPay() {   System.out.println(this.pay);  }    
  
    // 인스턴스메서드  - heap area  - new o - 생성자  o
    public  void  showAll001() {   
       System.out.println(su);  // static 사용가능 - new 전에 메모리상에 static 올라가 있었어
       System.out.println(this.pay);  // this 사용가능
    } 
    
    //클래스메서드  - method area - new x - 생성자x  Sawon3.showAll002()
    public static  void  showAll002() {   
        //showAll001();    // static this 사용(인스턴스) 불가  
       // System.out.println(this.pay);
    } 
} 




///////////////////////////////////////////////////////////////
public class MemberVarEx001 {

	public static void main(String[] args) { // args 지역변수
		Sawon3   sola = new Sawon3();    // 1) new 번지, 객체생성 2) 생성자초기화  3) sola 번지 (지역변수)
		   sola.showAll001();

	}

}
///////////////////////////////////////////////////////////////



/*
------------------------[ runtime data area]
[method: 정보, static, final : 공용정보]
>Sawon3.Class / MemberVarEx001.class
>static: Sawon3.su, Sawon3.basicpay2 , Sawon3.showSu() , Sawon3. showAll002()


------------------------------------
[heap: 동적]            | [stack : 잠깐빌리기]

						showAll001()
1번지 {pay = 0, showAll001() }  <- sola[1번지]  46번째줄
						| main


*/