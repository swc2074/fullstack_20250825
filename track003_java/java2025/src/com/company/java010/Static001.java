package com.company.java010;

//1. 클래스는 부품객체

//2. 클래스는 상태(멤버변수)와 행위(멤버함수)

class Farm {
	// 상태 - 멤버변수
	String name; // 인스턴스변수 - heap area - new 0 - 생성자 / cat(1번지). name, dog ( 1번지).age

	int age; // 인스턴스변수 - heap area 0 - new 0 - 생성자 / dog(2번지).name, dog (2번지).age
	static String FarmName = "(주)동물농장"; // 클래스.변수 - Farm.FarmName (명시적초기화)
	static int FarmNum; // 클래스 변수 - method area - new x - 생성자 x
	static String FarmBoss;
	static {
		FarmNum = 2;
		FarmBoss = " 신동엽";
	} // 초기화 블록

	// 행위 - 멤버함수
	static void num_plus() {
		FarmNum++; /* this.age++; */ // 클래스. 메서드 static 에서 this.사용불가//
	}// 클래스 메서드

	void show() { // 인스턴스 메서드
		System.out.println("\n\n ::::::::::::::::::::::::");
		System.out.println("::이름 : " + this.name);
		System.out.println("::나이 : " + this.age);
		System.out.println("::인원 :" + Farm.FarmNum);

	}
}

/////////////////////////////////////////////////
public class Static001 {

	public static void main(String[] args) {
		System.out.println("\n\n0. 동물농장");
		System.out.println(":: 회사이름 > " + Farm.FarmName);
		System.out.println(":: 회사사장 > " + Farm.FarmBoss);
		System.out.println(":: 회사인원 > " + Farm.FarmNum);

		System.out.println(Farm.FarmName);

		Farm cat = new Farm(); // 조립: 1) new : 메모리빌리기, 객체 생성 2) Farm() 초기화 3) cat 번지
		cat.name = "sally";
		cat.age = 10;
		cat.show(); // 갖고놀기 사용하기
		Farm dog = new Farm();
		dog.name = "alpha";
		dog.age = 7;
		dog.show();
		Farm.num_plus();/* dog.num_plus(); */

	}

}
	
	
	 /////////////////////////////////////////////////
	 /* 
	 * 초기화 순서 : 기본값 명시적초기화 초기화블록 생성자 FarmNum 0 null (0) 2 x FarmBoss null null (0)
	 * 신동엽 x FarmName null (주)동물농장 (x)(주) 동물농장 x
	 ////////////////////////////////////////////////////////////////////

	*cat name = null, age = 0(x)name=null,age=0(x) name=null,age=0  name=null,age=0
	*dog name = null, age = 0(x)name=null,age=0(x) name=null,age=0  name=null,age=0

	/////////////////////////////////////////////////////////////////////
	------------------------[runtime data area][method:정보,static,final:공용정보]Farm.call,Static001.class★클래스:설계도

	------------------------------------[heap:동적]|[stack:잠깐빌리기]2 번지
	{name =
 null, age = 0}<--dog[2 번지]1 번지
	{name = null, age = 0}<--cat[1 번지]

|main------------------------------------


*/