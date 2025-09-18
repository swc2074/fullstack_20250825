package com.company.java008_ex;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEx010 {
	///////////////////////////////////////
	public static void main(String[] args) {
		// 변수
		int num = -1;
		Scanner sc = new Scanner(System.in);
		String[][] pets = { { "콩이", "010-1234-5678", "예방접종" }, { "초코", "010-3254-2587", "건강검진" },
				{ "보리", "010-9543-2547", "치아관리" }, };

		// 입력
		while (num != 3) {
			System.out.println();
			num = sys_menu();
			switch (num) {
			case 1:
				process_check(pets);
				break;
			case 2:
				process_change(pets);
				break;
			case 3:
				process_end();
				break;
			}
		}
	}// end main
		///////////////////////////////////////

	public static int sys_menu() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("동물 병원 시스템 메뉴");
		System.out.println("1.진료 항목 조회");
		System.out.println("2.진료 항목 변경");
		System.out.println("3.종료");
		System.out.println("메뉴 번호를 선택해주세요>");
		return sc.nextInt();
	}

	// 1. 진료 항목 조회
	public static void process_check(String[][] pets) {
		String tempname = " ";
		Scanner sc = new Scanner(System.in);
		System.out.println("동물 이름을 입력해주세요> ");
		tempname = sc.next();
		// if "콩이 면 예방접종
		// if tempname(콩이) == pet [0][0] {출력 pet[0][0] + "는 " + pet[0][2] + "예약이 되어
		// 있어요."}
		// if tempname(초코) == pet [1][0] {출력 pet[1][0] pet[1][2]

		for (int i = 0; i < pets.length; i++) {
			if (pets[i][0].equals(tempname)) {
				System.out.println(pets[i][0] + "는" + pets[i][2] + "예약이 되어 있어요.");
				break;}
		}

	}
	// 2. 진료 항목 변경

	public static void process_change(String[][] pets) {
		// 이름, 번호 바꾸기
		String tempname = " ", tempph = " ";
		Scanner sc = new Scanner(System.in);
		// 입력
		System.out.println("동물이름 입력해주세요>");
		tempname = sc.next();
		System.out.println("전화번호를 입력해주세요>");
		tempph = sc.next();

		int findIndex = -1;

		for (int i = 0; i < pets.length; i++) {
			if (tempname.equals(pets[i][0]) && tempph.equals(pets[i][1])) {
				System.out.println("변경하실 진료항목을 입력해주세요");
				pets[i][2] = sc.next();
				findIndex = i;
				break;
			}
		}
		
		if (findIndex != -1) {
			System.out.println("예약정보 확인 : " + Arrays.toString(pets[findIndex]));
		} else {
			System.out.println(" X 등록 정보를 확인해 주세요");
		}

	}

	// 3. 종료
	public static void process_end() {
		System.out.println(" 시스템을 종료합니다. 안녕히 가세요!");
		
		
	}
}// end class
