package com.company.java20251010_test;

class User004 {
	final char division; // A,B,C,D 4가지 타입으로 분류할 수 있다.
	final String jumin;

	@Override
	public String toString() {
		return "User004 [division=" + division + ", jumin=" + jumin + "]";
	}

	public User004(char division, String jumin) {
		super();
		this.division = division;
		this.jumin = jumin;
	}

	public User004() {
		division = 'A';
		jumin = "123456-1234567";
	}
	
}
	//////////////////////////////////////////////
public class TestJava1010_04{
	public static void main(String[] args) {
		User004 c1 = new User004('B', "200101-1234567");
		System.out.println(c1);
		User004 c2 = new User004();
		System.out.println(c2);
	}

}
///////////////////////////////////////////////////