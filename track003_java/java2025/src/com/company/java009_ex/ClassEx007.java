package com.company.java009_ex;

import java.util.Scanner;

class Calc{
	
	int num1, num2; char op; double result;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n숫자 1 입력>");
		this.num1 = sc.nextInt();
		System.out.print("숫자 2 입력>");
		this.num2 = sc.nextInt();
		System.out.print("연산자 입력>");
		this.op = sc.next().charAt(0);
		
	}
	void opcale() {
		if (this.op == '+') {this.result = this.num1 + this.num2;}
		else if (this.op == '-') {this.result = this.num1 + this.num2;}
		else if (this.op == '*') {this.result = this.num1 * this.num2;}
		else if (this.op == '/') {this.result = this.num1 / (double)this.num2;}
	}
	void show() {
		this.opcale();
		if(this.op == '/') {
			System.out.printf("%d%c%d = %.2f", this.num1, this.op, this.num2, this.result);
		}else {
			System.out.printf("%d%c%d = %d", this.num1, this.op, this.num2, (int)this.result);
		
		}
	}
	public Calc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calc(int num1, int num2, char op) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
		
	}
	 
}




/////////////////////////////////////////////////////

public class ClassEx007 {

	public static void main(String[] args) {
		Calc c1= new Calc(10,3, '+');
		c1.show();
		
		Calc c2= new Calc();
		c2.input();
		c2.show();
	}

}
//////////////////////////////////////////////////////


/*
------------------------[ runtime data area]
[method: 정보, static, final : 공용정보] Calc.class , public ClassEx007.class 클래스 (설계도)




------------------------------------
[heap: 동적]            | [stack : 잠깐빌리기]
                           c2.show(){}
  						   c2.input();
2번지 {num1=3, num2=4, op=*, result=12   c2 [2번지]
  						   				c1 . show(){}
1번지 {num1=10, num2=3, op = '+' , result = 13  c1[1번지 ] Calc c1 = new Calc (10,3, '+')
                        | main  						   				

------------------------------------
객체(new) / 인스턴스 - c2(2번지의).num1, c1(1번지의 ) .num1
*/


