package com.company.java010_ex;

/*
 * 
 * 연습문제1)  final
패키지명 : com.company.java011_ex
클래스명 : FinalEx
다음코드에서 오류나는 부분을 찾아 주석달고 이유를 적으시오.
 */

//1. 클래스는 부품 객체이다.
//2. 클래스는 상태 (멤버변수)와 행위 (멤버함수)

/////////////////////////////////////////////////////////////////////
class User002 {
	
	// 멤버 변수
	   final String nation = "Korea";   
	   final String jumin;   
	   String name;
	   
	   // 멤버 함수
	   public User002() { jumin="00000"; }

	   
	   public User002(String jumin, String name) {
		super();
		this.jumin = jumin;
		this.name = name;
	   }
	   
	}

////////////////////////////////////////////////////////////////////
	 public class FinalEx {
	   public static void main(String[] args) {
	      User002 user1 = new User002("123456-1234567", "아이유");
	      System.out.println(user1);   
	      
	      //user1.nation = "USA";       		// final 은 재할당 불가 cannot be assigned
	      //user1.jumin  = "123123-1234321";  // final 재할당 불가 
	      
	      user1.name = "IU"; 
	      System.out.println(user1);   
	   }
	}
	 //////////////////////////////////////////////////////////////
	 
	 /*
	 ------------------------[ runtime data area]
	 [method: 정보, static, final : 공용정보]
	 ------------------------------------
	 [heap: 동적]            | [stack : 잠깐빌리기]
	 ------------------------------------
	 */