package com.company.java010_ex;


/*
 - 문제 1. 다음 코드에서 인스턴스변수, 클래스변수, 지역변수를 구분하시오.  ( 보관되는 영역도 추가 )
- 문제 2. 인스턴스메서드와 클래스메서드를 구분하시오.  
- 문제 3. 오류가 발생하는 이유를 설명하시오.
- 문제 4. runtime data area 위치영역 그림그리기
 */


/*  초기화 :              기본값                   명시적초기화                                  초기화 블록   생성자
 * studentCount           0                      0                                         x             0
 * maxScore               0                      100                                       x            100
 * s1{name, kor, eng}    { name=null, kor =0, eng=0} {name = 홍, kor = 90, eng = 85}        x         {name = 홍, kor = 90, eng = 85}
 * s2{name, kor, eng}    { name=null, kor =0, eng=0} {name = 홍, kor = 90, eng = 85}        x         {name = 홍, kor = 90, eng = 85}

 */

class Student {
    String name = "홍길동";           // 인스턴스 - heap area - new O - 생성자 O  - this (각각)
    int kor = 90;                   // 인스턴스 - heap area - new O - 생성자 O   - this (각각)
    int eng = 85;                   // 인스턴스 - heap area - new O - 생성자 O   - this (각각)
    static int studentCount = 0;    // 클래스변수  - method area - new x - 생성자 x - static (now)

    //static int total = kor + eng; //클래스 변수 - method area - new x - 생성자 x
    								//static은 인스턴스(this) 사용불가

    static int maxScore = 100;      // 클래스변수  - method area - new x - 생성자 x - static (now)

    public Student() {              // - 생성자 
        studentCount++;             // static 사용가능 
    }

    public int getTotalScore() {     // 인스턴스 메서드 
        return this.kor + this.eng;        
    }

    public static void showStudentCount() {   // 클래스메서드  - method area - new x - 생성자 x - static (now)
        System.out.println("전체 학생 수: " + studentCount);  
    }

   public static void showName() {    // 클래스 메서드  - method area - new x - 생성자 x - static (now)
         //System.out.println(name);  //static은 인스턴스(this) 사용불가
   }

    public void showInfo() {          // 인스턴스 메서드  - heap area - new O - 생성자 O  - this (각각)
        System.out.println("이름: " + name);            
        System.out.println("총점: " + getTotalScore());    
    }
}




////////////////////////////////////////////////////

public class MemberVarEx002 {

	public static void main(String[] args) { // args 지역변수
		Student s1 = new Student();     //1. s1 new 번지 객체생성 , 2. 생성자 초기화, 3. s1 번지 (지역 변수)
        Student s2 = new Student();     //1. s2 new 번지 객체 생성, 2. 생성자 초기화, 3. s2 번지 (지역 변수)

        s1.showInfo();                  
        Student.showStudentCount();    

	}

}
////////////////////////////////////////////////////


/*
------------------------[ runtime data area]
[method: 정보, static, final : 공용정보]
>Student.Class / MemberVarEx002.class
>static: Student.studentCount, Student.maxScore , Student.Student() , Student. getTotalScore()
         Student.showStudentCount(), Student.showName(), Student.showInfo()


------------------------------------
[heap: 동적]                                                | [stack : 잠깐빌리기]
2번지 
	{name=홍, kor = 90, eng = 85/
					getTotalScore(),	showInfo()}     <- s2[2번지]
1번지 {pay = 0, showAll001() }  <- sola[1번지]  46번째줄

{name=홍, kor = 90, eng = 85/                            <- s1 [1번지]
					getTotalScore(),	showInfo()}
						                                   | main


*/