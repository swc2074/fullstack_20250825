package com.company.java012_ex; 
//Q1. 상속도를 그리시오. 
     //                                     생성자     객체
/* 
              Object                       3           4
                ↑									
* 		     TestA4  {a = 10, -----}       2           5
* 		        ↑
             TestB4  {b = 20, @toString}   1		   6
	
*/
class TestA4  extends Object{  
	   int a=10;
	   @Override public String toString() { return "TestA4 [a=" + a + "]"; }
	}
	class TestB4  extends TestA4{  
	   int b=20;
	   @Override public String toString() { return "TestB4 [b=" + b + "]"; }
	}
	/////////////////////////////////////////////////
	public class PolyEx004 {
		   public static void main(String[] args) {
		      TestA4  ta = new TestA4();
		      //Q2. TestA4  ta 사용할수 있는범위는?  { a=10 / toString}
		      //Q3. new TestA4() 는  heap area 에서 호출되는 생성자의 순서와 객체가 만들어지는 순서는?
		      // A: 생성자 호출  TestA4 -> Object () / 객체 4->5 -> Object -> TestA4
		      //  ta {a=10 /toString} = 1000번지 {a=10 / toString} --{Object} 
		      TestB4  tb = new TestB4();  
		      //Q4. TestB4  tb 사용할수 있는범위는? A : {b=20 / @toString} -{a=10 / -----------}
		      		      
		      //Q5. new TestB4() 는  heap area 에서 호출되는 생성자의 순서와 객체가 만들어지는 순서는?
		      // A: 생성자 : 1 2 3 TestB4() -> TestA4() -> Object() / 객체 : 4 -> 5 -> 6
		      // tb {b=20/@toString}-{a=10 / -----} = 2000번지 {b=20 / @toString} -{a=10 /------}
		      
		      //부모 = 자식 / 업캐스팅 / 타입캐스팅       
		      
		      ta = new TestB4();
		      //Q6. ta가 사용할수 있는 보장하는 변수와 메서드는? A: {a=10 / toString}
		      //Q7.ta = new TestB4(); 에서 new TestB4() 에서 사용할수 있는 범위는? 
		      // ta{a=10 /toString} = 3000번지 {b=20 / [@toString} -{a=10] /--------}
		      //
		      tb         = (TestB4) ta;   
		      //Q8. tb         = (TestB4) ta;   에서 tb가 사용할수 있는 범위는? A: {b=20 / @toString} - {a=10 /-----------}
		      //Q9. 컴파일러시  tb         = (TestB4) ta;  오류가 안나는 이유는?
		      // A : tb{b=20 /@toString} - {a=10 /-----------} = 3000번지 {b=20 / [@toString} - { a=10 ] / ------}
		      
		      System.out.println(tb);  //Q10. 출력내용과 그이유는?TestB4
		      System.out.println(((TestB4)ta).b);//Q11. 출력내용? 20
		      System.out.println(tb.a);//Q12. 출력내용? 10
		      
		   }
		}

/////////////////////////////////////////////////