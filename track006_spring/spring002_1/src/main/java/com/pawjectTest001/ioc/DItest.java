package com.pawjectTest001.ioc;

//@Data
public class DItest {
	private String name;
	private int age;

	public DItest(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	@Override public String toString() { return "DItest [name=" + name + ", age=" + age + "]"; }

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public int getAge() { return age; }

	public void setAge(int age) { this.age = age; }

	public DItest() { super();  }
	
	// 생성자 + toString + getters/setters

	
}
