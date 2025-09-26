package com.company.java011;

class Toy{
	//상태 : 멤버변수
	private String name;     //인스턴스변수 - heap area  - new o - 생성자 o  - this (각각)
	private int age;

	static final String company = "(주) 703ToyLand";  // Toy.company  클래스.변수, 클래스변수 - method - new x - (now)
	static int num;                            // 클래스변수 (공용)

	
	//행위 : 멤버함수
	
	
	public void show() { System.out.println("Name :" + this.name); System.out.println("Age :" + this.age); }
	// getter + setter
	
	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public int getAge() { return age; }

	public void setAge(int age) { this.age = age; }

	public Toy() { super();  }

	public Toy(String name, int age) { super(); this.name = name; this.age = age; }

	@Override
	public String toString() {
		return "Toy [name=" + name + ", age=" + age + "]";
	}

	

	
	
	
}

