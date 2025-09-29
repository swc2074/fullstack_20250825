package com.company.java012_ex;
 
//Q1. 상속도를 그리시오. 

/*
              Object                             
                ↑									
* 		     TestA2  {int a, toString()}
* 		       ↑
             TestB2  {int b, toString()}
	
*/

class TestA2 extends Object{  
   int a=10;
   @Override public String toString() { return "TestA2 [a=" + a + "]"; }    
}
class TestB2 extends TestA2{
   int b=10;
   @Override public String toString() { return "TestB2 [b=" + b + "]"; }   
}
/////////////////////////////////////////////////
public class PolyEx001 {
   public static void main(String[] args) {
      TestA2  ta = new TestB2();
      //Q2. 25번째줄에서   TestA2  ta 는 클래스의 무엇을 사용할수 있을까요? 코드의 의미
                     // {int a, toString}
      //Q3. 25번째줄에서   TestB2() 는 클래스의 무엇을 사용할 수 있을까요?
      			     // {int b, toString} - {int a, -----}
      
      System.out.println(ta); // Q4. 출력내용과 이유?   TestA2  vs  TestB2
                       // TestB2 [b= 10 ]
      System.out.println(ta.a); //Q5.사용가능?
                       // 사용가능 a=10
      //System.out.println(ta.b); //Q6.사용가능?
                       // 사용 못함.
                       // 타입캐스팅  사용시 가능 (((TestB2).ta).b);
   }
}
/////////////////////////////////////////////////