package com.company.java011;



//1. 클래스는 부품 객체
//2. 클래스는 상태와 행위

class Toy{
	//상태 : 멤버변수
	private String name;     //인스턴스변수 - heap area  - new o - 생성자 o  - this (각각)
	private int age;

	static final String company = "(주) 703ToyLand";  // Toy.company  클래스.변수, 클래스변수 - method - new x - (now)
	static int num;                            // 클래스변수 (공용)

	
	//행위 : 멤버함수
	public void show() { System.out.println("Name :" + this.name); System.out.println("Age :" + this.age); }
	
	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public int getAge() { return age; }

	public void setAge(int age) { this.age = age; }

	public Toy() { super();  }

	public Toy(String name, int age) { super(); this.name = name; this.age = age; }

	
// getter + setter
	
	
	
}

/////////////////////////////////////////////////
public class Class_Repeat {
	public static void main(String[] args) {
		Toy kitty = new Toy();//장난감 2단계   1) new 메모리, 객체 생성    2) 생성자   3) kitty 번지
		//kitty.name = " 할로윈키티";                      //갖고 놀기 3단계
		kitty.setName("할로위키티");
		kitty.setAge(3);
		kitty.show();
		Toy gundam = new Toy("건담", 47);//장난감 2단계
		gundam.show();//갖고 놀기 3단계
	}

}
////////////////////////////////////////////////
/*
기본값      명시적  초기화            초기화 블록                  생성자
(static)company     null	 ="(주) 703ToyLand"	    "(주) 703ToyLand"		    x    Toy.name
(static)num          0 			x   0				o     0                     x    Toy.age
===============================================================================================
kitty     {name = null, age = 0}      유지				유지						유지                     this.name
gundam    {name = null, age = 0}	  유지				유지						{name = "건담", age = 40}this.name


*/







/* 
 * =================================================================
 * method[클래스정보]
 * >Toy.class , Class_Repeat.class  , Toy.company = "(주) 703 " , Toy.num =0
 * =================================================================
 * heap[동적]                                     | stack[임시저장공간]
 * 
 * 
 * 
 * 
 * 
 * 
 * =================================================================
 */


