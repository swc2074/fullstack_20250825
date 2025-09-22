package com.company.java009;

	
	// 클래스 정의
	class Animal {
	    void sound() {
	        System.out.println("소리를 낸다");
	    }
	}

	// 상속
	class Dog extends Animal {
	    @Override
	    void sound() {
	        System.out.println("멍멍!");
	    }
	}

	class Cat extends Animal {
	    @Override
	    void sound() {
	        System.out.println("야옹!");
	    }
	}

	public class test0922 {
	    public static void main(String[] args) {
	        Animal a1 = new Dog(); // 다형성
	        Animal a2 = new Cat();
          
	        a1.sound(); // 멍멍!
	        a2.sound(); // 야옹!
	    }

		
	}



