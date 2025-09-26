package com.company.java011;


class Animal{
   String name;
   int age;
   
   
   void eat( ) {System.out.println(" 먹고");}
   void sleep( ) {System.out.println(" 자고");}
   void poo( ) {System.out.println(" 배변");}
  
}

class Cat extends Animal{
	String animal_card;
	void qukquk() {System.out.println(this.name + "-꾹꾹이");}
}



class Person{}

/*  상속: 클래스의 재사용
 * 
 *       Object (실선 - 속이빈 화살표)
 *         ↑
 *       Animal {name, age / eat(),sleep(), poo()}
 *       ↑    ↑
 *    Person Cat {animal_card / qukquk()}
 * 
 *  ======================================
 *     Cat sally = new Cat(); 
 *    ==================================  
 * 1) Cat은 Animal 이다
 * 2) 생성자 호출: Cat() -> Animal () -> Object()
 * 3) 객체생성 : Object -> Animal -> Cat
 */



/////////////////////////////////////////////////
public class Extends002 {

	public static void main(String[] args) {
		Cat sally = new Cat();
		sally.name = "kitty"; sally.age=52;
		sally.animal_card = "ani-1234";
		sally.eat();
		sally.sleep();
		sally.poo();
		sally.qukquk();
		

	}

}

////////////////////////////////////////////////