package com.company.java005_ex;

import java.util.Arrays;
import java.util.Scanner;

public class Bank002_Array {
	public static void main(String[] args) {
		//변수                          0  1  2
		String []id=new String[3];
		String []pass=new String[3];
		double []balance = new double[3];
		int num=-1;
		Scanner scanner = new Scanner(System.in);
		
		// 입력 + 처리 + 출력
		while(num !=9) { // 9가아니라면 계속 무한 반복
			System.out.println( Arrays.toString(id));
			System.out.println( Arrays.toString(pass));
			System.out.println( Arrays.toString(balance));
			//■ 기능 1. 메뉴판
			System.out.println("===== CODE BANK =====\n*" + 
			"🎀1. 추가\n*🎎2. 조회\n*💎3. 입금\n*🛒4. 출금\n*🎡5. 삭제\n*🎃9. 종료\n 번호를 선택하세요>>>");
			num = scanner.nextInt();
			// if ( 1 이라면){ 1-1. 빈칸인지 확인 후 1-2. 유저 계정에 입력받기}
			if (num == 1) {
				// 1-1. 빈칸인지 확인 후 find
				// ver -1 if( 0번이 빈칸이라면) { find는 0} if (1번이 빈칸이라면){ find는 1}
				// ver -2 if( 0번이 null) { find는 0} if (1번이 null){ find는 1}
				// ver -3 if( id [0] == null ) { find=0;} if (id[1] == null){ find= 1;}
				// ver -4 찾았으면 나오기 추가 - 백만개의 자료있다고하면 ~ ! 시간오래걸림.
				int find=-1;
			    for (int i=0; i<id.length; i++) {if (id[i] == null) {find=i;break;
			    }
			    }
				
				System.out.println(" [1] 아이디  입력 >"); id[find] = scanner.next();
				System.out.println(" [2] 비밀번호 입력 >"); pass[find] = scanner.next();
				System.out.println(" [3] 금액    입력 >"); balance[find] = scanner.nextDouble();
				
			}
			else if (num == 2 || num == 3|| num == 4 || num == 5) {
				/* 2-1. 인증정보 */
				//1. 사용자에게 아이디 입력받기
				//2. 사용장에게 비밀번호 입력받기
				//3. ver -0 int find =-1; 없는 번호
				//3. ver -1 사용자에게 입력받은 아이디와 id[0]번이 같고 사용자에게입력받은 비밀번호와 pass[0]번이면 사용자번호 0
				//3. ver -1 사용자에게 입력받은 아이디와 id[1]번이 같고 사용자에게입력받은 비밀번호와 pass[1]번이면 사용자번호 1
				//3. ver -2 if( 사용자에게 입력받은 아이디와 id[1]번이 같고 사용자에게입력받은 비밀번호와 pass[1]번이면 {사용자번호는 1}
				//4. 만약 find ==-1 이라면 유저정보 못찾음!
				
				/* 2-2 find 번호로 각각의 처리 */
			}
			else { System.out.println(" 메뉴를 확인해주세요");
			
			}
			}
			

			// else if ( 2,3,4,5){2-1. 인증정보, 2-2. 각각의 처리}
			// else {메뉴를 확인해주세요.}
					
		}
	}


