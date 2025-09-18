package com.company.java008_ex;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEx009 {

	public static void who_are_you(String[][] users) {// 아이디를 입력받아서 나라조회
		// 변수
		String tempid = "";
		String result = " ";
		Scanner scanner = new Scanner(System.in);
		// 입력 아이디를 입력해주세요> aaa
		System.out.println(" 아이디를 입력해주세요");
		tempid = scanner.next();
		// 처리 if(만약 tempid가 aaa라면){한국사람입니다. }
		// if(만약 tempid가 bbb라면){호주 사람입니다.}
		// 처리 if (tempid.equals(users[0][0])){result = users[0][2] + " 사람입니다.";}
		// 처리 if (tempid.equals(users[1][0])){result = users[1][2] + " 사람입니다.";}
		for (int i = 0; i < users.length; i++) {
			if (tempid.equals(users[i][0])) {
				result = users[i][2] + "사람입니다.";
				break;
			}
		}
		System.out.println(result);
		System.out.println();
	}

	public static void who_pass_change(String[][] users) {
		// 아이디, 비밀번호가 맞으면 비밀번호 바꾸기
		String tempid = " ", temppass = " ";
		Scanner sc = new Scanner(System.in);
		// 입력
		System.out.println("아이디를 입력해주세요>");
		tempid = sc.next();
		System.out.println("비밀번호를 입력해주세요>");
		temppass = sc.next();

		int findIndex = -1;

		for (int i = 0; i < users.length; i++) {
			if (tempid.equals(users[i][0]) && temppass.equals(users[i][1])) {
				System.out.println("변경하실 비밀번호를 입력해주세요");
				users[i][1] = sc.next();
				findIndex = i;
				break;
			}
		}
		// 출력

		if (findIndex != -1) {
			System.out.println("정보확인:" + Arrays.toString(users[findIndex]));

		} else {
			System.out.println("정보를 확인해주세요");

		}

	}

	/////////////////////////////////////////
	public static void main(String[] args) {
		// 변수

		String[][] users = { { "aaa", "111", "한국" }, { "bbb", "222", "호주" }, { "ccc", "333", "중국" }, };

		// 입력

		who_are_you(users);
		who_pass_change(users);

	}
	/////////////////////////////////////////

}
