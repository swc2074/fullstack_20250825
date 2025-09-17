package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx006 {

	////////////////////////////////////////// 메서드
	public static int process_total(int attack, int defense, int speed) {

		return attack + defense + speed;
	}

	public static float process_avg(int total) {
		return total / 3f;
	}

	public static String process_grade(float avg, int attack, int defense, int grade) {
		return avg > 90 ? "S등급" : avg > 80 ? "A등급" : avg > 70 ? " B등급" :
			   avg > 60 ? "C등급" : avg > 50 ? "D등급" : "등급없음";
	}

	public static String process_star(float avg) {
		String result = " ";
		for (int i = 0; i < (int) (avg / 10); i++) {
			result += "★";
		}
		return result;
	}
	public static String process_quest(float avg) {
		return avg > 90 ? "전설의 용 퇴치" : avg > 80 ? "사자 퇴치" : avg > 70 ? "늑대 퇴치" :
			   avg > 60 ? "들개 퇴치" : avg > 50 ? "비둘기 퇴치" : "벌레 퇴치";
	}
	
	
	
	public static String process_type(float avg) {
		return avg == 100 ? "전설의 영웅" : avg >= 95 ? "도적형": " ";
	}

	//////////////////////////////////////////// 메인
	public static void main(String[] args) {

		///////////////////// (1) 변수
		String name = "";
		int attack, defense, speed, total = 0;
		float avg = 0.0f;
		String grade = "";
		String star = "";
		String quest = "";
		String type = "";
		
		Scanner scanner = new Scanner(System.in);
		
		///////////////////// (2) 입력
		System.out.println("다음 정보를 입력하시오>");
		System.out.print("캐릭터 이름>");
		name = scanner.next();
		System.out.print("공격력>");
		attack = scanner.nextInt();
		System.out.print("방어력>");
		defense = scanner.nextInt();
		System.out.print("민첩성>");
		speed = scanner.nextInt();

		///////////////////// (3) 처리 :
		total = process_total(attack, defense, speed); // 1. 총합계산

		avg = process_avg(total); // 2. 평균계산

		grade = process_grade(avg, attack, defense, speed);//3. 등급

		star = process_star(avg); //4. 별 처리
		
		quest = process_quest(avg); //5. 퀘스트
		
		type = process_type(avg); //6. 타입

		
	  process_show(name, attack, defense, speed, total, avg, grade, star, quest, type);

	}// end main
		////////////////////////////////////////

	public static void process_show(String name, int attack, int defense, int speed, int total, float avg, String grade,
			String star, String quest, String type) {
		System.out.println(
				"::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-10s\t%-10s\t%-5s\n", "캐릭터", "공격력", "방어력", "민첩성",
				"총합", "평균", "등급", "랭킹", "추천퀘스트","캐릭터타입");
		System.out.println(
				"--------------------------------------------------------------------------------------------");
		System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%-5.1f\t%-5s\t%-10s\t%-5s\t%-5s\n", name, attack, defense, speed, total,
				avg, grade, star, quest,type);
		System.out.println(
				"--------------------------------------------------------------------------------------------");
	}
	///////////////////////////////////////
}// end class
