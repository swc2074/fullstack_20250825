package com.company.java013;

/* Abstract ( is A)  일반클래스 + 설계
 * 		고양이는 동물이다.
 * 		개도 동물이다.
 * 
 * 			Animal { name / eat(), sleep(), poo()}
 *          ↑   ↑
 * 		  Cat  Dog { @eat(), @sleep(), @poo() }
 * 
 * 
 */
abstract class Animal{   // 일반클래스 + 설계
	String name; 
	abstract void eat(); // 추상메서드가 있으면 반드시 추상클래스로 만들어줘야함.
	abstract void sleep();// 구현부가 없음{}
	abstract void poo();  // 추상화, 일반화, 설계: 공통의 속성, 구체적인 내용이 없음
}

class Cat extends Animal{
	@Override  void eat() {System.out.println(super.name + "고양이 냠냡!");} // 추상메서드가 있으면 반드시 추상클래스로 만들어줘야함.
	@Override void sleep() {System.out.println(super.name + "고양이 수면!");}// 구현부가 없음{}
	@Override void poo() {System.out.println(super.name + "고양이 시원");}  //	
}

class Dog extends Animal{
	@Override  void eat() {System.out.println(super.name + "강아지 냠냡!");} // 추상메서드가 있으면 반드시 추상클래스로 만들어줘야함.
	@Override void sleep() {System.out.println(super.name + "강아지 수면!");}// 구현부가 없음{}
	@Override void poo() {System.out.println(super.name + "강아지 시원");}  //
	
}
class Person extends Animal{
	@Override  void eat() {System.out.println(super.name + "사람냡!");} // 추상메서드가 있으면 반드시 추상클래스로 만들어줘야함.
	@Override void sleep() {System.out.println(super.name + "사람 수면!");}// 구현부가 없음{}
	@Override void poo() {System.out.println(super.name + "사람 시원");}  //
	
}


public class Abstract001 {
	public static void main(String[] args) {
		// Animal ani = new Animal(); 일반클래스 + 설계
		// Animal ani = new Animal(); new 메모리빌리고, 객체생성 / Animal() 초기화, {} 구현부 없음.
		
		Animal ani = null;
		ani = new Cat(); // 부모는 = 자식 , 업캐스팅, 타입캐스팅 필요없음.
		ani.name = "sally"; ani.eat();
		
		ani = new Dog(); // 부모는 = 자식 , 업캐스팅, 타입캐스팅 필요없음.
		ani.name = "alpha"; ani.eat();
		
		// 2. 사용목적
		Animal [] arr = {new Person(),new Cat(), new Cat(), new Dog(), new Dog(),};
		int cnt = 0;
		for (Animal a : arr) { a.name = "ani" + ++cnt; a.eat();  a.sleep();a.poo();
		}
		
	}

}

/*
heap 									 				stack
 2번지 {name="alpha", eat() , sleep(), poo()}             ani[2번지]          
 1번지 {name="sally", eat() , sleep(), poo()}             ani[1번지]          
 														 ani=null 39번재줄	
 														  main
 */
