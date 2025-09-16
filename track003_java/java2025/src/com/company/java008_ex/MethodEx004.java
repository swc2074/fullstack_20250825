package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx004 {

	public static int num() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. 내가 좋아하는 숫자 >");
		int luck_num = scanner.nextInt();
		return luck_num;
	}

	public static double d_num() {
		double result = 10 / 3.0;
		return result;

	}
	
	public static String color() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n3. 내가 좋아하는 칼라는>");
		String color = scanner.next();
		return color;
	}

	public static String ch() {
	    String ch = "★★★★★";
		return ch;
	}
	
	public static int hap(int a, int b) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" a 값 입력: " + a);
		System.out.println(" b 값 입력: " + b);
		 a = scanner.nextInt();
		 b = scanner.nextInt();
		int result = a + b;
		return result;
		
	}
	
	//////////////////////////////////////////
	public static void main(String[] args) {

		System.out.print("1. 내가좋아하는 숫자 :" + num());
		System.out.print("\n2. 10/3.0 을 실수로 표현:" + d_num());
        System.out.print("\n3. BEST COLOR:" + color());
        System.out.println("\n4. 장수돌침대 별이:" + ch());
        System.out.println("5. 10+20= " + myadd(10,20));
        System.out.println("6. 반(노랑조/주황조)=" + myban('B'));
        System.out.println("7. 당신의 학번은?" + stdId(1111));
        System.out.println("8.당신의 평균은?" + stdAvg(88));
	}// end main

	///////////////////////////////////////////
	public static int myadd(int a, int b) { return a+b;}
	public static String myban(char ch) { if(ch=='A'){return " 노랑조";} else {return "주황조";}}
	public static String stdId(int a) { return "G" + a;}
	public static char stdAvg(int avg) { return avg>=90 ? 'A' : avg >=80 ? 'B' : avg >=70 ? 'C' : 'D';}
	
}// end class

/*
 * 연습문제4) method 패키지명 : com.company.java008_ex 클래스명 : MethodEx004
 * 
 * System.out.println("1. 내가 좋아하는 숫자    :" + return_num()); // 1을 결과값으로 줌 //
 * public static void num(int luck_num){ Scanner scanner = new
 * Scanner(System.in); ///return luck_num = scanner.nextInt();}
 * 
 * System.out.println("2. 10/3.0을 실수로 표현 :" + return_float()); // 3.3333을 결과값으로
 * 줌 System.out.println("3. BEST COLOR        :" + mycolor()); // PURPLE을 결과값으로
 * 줌 System.out.println("4. 장수돌침대 별이       :" + jangsu()); // ★★★★★을 결과값으로 줌
 * System.out.println("5. 10+20= " + myadd(10,20)); // 두숫자를 더한값을 결과값으로 줌
 * public static int myadd(int a, int b) { return a+b;}
 * System.out.println("6. 반(노랑조/주황조)=" + myban('B')); // A이면 노랑조 , B이면 주황조
 * 
 * System.out.println("7. 당신의 학번은?" + stdId(1111)); // G하고 넣어준 학번 나오게
 * public static String stdId(int a) { return "G" + a;}
 * System.out.println("8.당신의 평균은?" + stdAvg(88)); // 90점이상이면 A , 80점이상이면 B ,
 * 70점이상이면 C , 아니라면 D
 * 
 * 출력결과 : 1. 내가 좋아하는 숫자 : 1 2. 10/3.0을 실수로 표현 : 3.3333 3. BEST COLOR : PURPLE 4.
 * 장수돌침대 별이 : ★★★★★ 5. 10+20= 30 6. 반(노랑조/주황조)= 나는 노랑조 7. 당신의 학번은? G1111 8. 당신의
 * 평균은? B
 * 
 * 
 * 
 * 
 * 연습문제5) method 패키지명 : com.company.java008_ex 클래스명 : MethodEx005
 * 
 * public class MethodEx005{ public static void main(String[] args) {
 * /////////////////////(1) 변수 String name = ""; int kor, eng, math, total ;
 * float avg = 0.0f; String pass = ""; String jang = ""; String star= "";
 * Scanner scanner = new Scanner(System.in);
 * 
 * /////////////////////(2) 입력 : 이름, 국어, 영어, 수학점수를 입력받으시오.
 * 
 * /////////////////////(3) 처리 : total = process_total(kor , eng, math); // 1.
 * 총점처리
 * 
 * avg = process_avg(total); //2. 평균처리
 * 
 * ////////3. 합격 평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면 pass =
 * process_pass(avg , kor, eng, math);
 * 
 * //////// 4. 평균이 95점이상이면 장학생 jang = process_scholar( avg );
 * 
 * //////// 5. 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면
 * 별10개 star = process_star(avg);
 * 
 * 
 * /////////////////////(4) 출력 process_show(name, kor, eng, math, total, avg,
 * pass, jang, star);
 * 
 * 
 * }// end main
 * 
 * 
 * }// end class
 * 
 * 
 * :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
 * :::::::::::::::::::: 이름 국어 영어 수학 총점 평균 합격여부 장학생 랭킹
 * -----------------------------------------------------------------------------
 * --------------- 아이언맨 100 100 100 300 100.0 합격 장학생 **********
 * -----------------------------------------------------------------------------
 * ---------------
 * 
 */