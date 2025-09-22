package com.company.java009_ex;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수) 와 행위(멤버함수)

class Score {

	String stdid;
	int kor, eng, math, total, avg;

	void total() {
		this.total = this.kor + this.eng + this.math;
	}

	void avg() {
		this.avg = this.total / 3;
	}

	void info() {
		this.total();
		this.avg();
		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\n", "학번", " KOR", "ENG", "MATH", "TOTAL", "AVG");
		System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%-5d\n", stdid, kor, eng, math, total, avg);

	}

	public Score(String stdid, int kor, int eng, int math) {

		this.stdid = stdid;
		this.kor = kor;
		this.eng = eng;
		this.math = math;

	}

	public Score() {
		super();
	}
}

///////////////////////////////////////////
public class ClassEx006 {
	public static void main(String[] args) {

		Score s1 = new Score("std1234", 100, 100, 99);
		s1.info();

	}

}
////////////////////////////////////////////