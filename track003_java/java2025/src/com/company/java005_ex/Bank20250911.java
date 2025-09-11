package com.company.java005_ex;

import java.util.Scanner;

public class Bank20250911 {
   public static void main(String[] args) {
      // 변수
      int num;
      String id = null, pass = null;
      double balance = 0;
      Scanner scanner = new Scanner(System.in);

      // 입력 + 처리 + 출력
      System.out.println("WELCOME ! (주) CODE BANK");
      for (;;) {
         System.out.print("===== CODE BANK =====\n*" + " 1. 추가\n* 2. 조회\n* 3. 입금\n* 4. 출금\n* 5. 삭제\n* 9. 종료\n입력>>>");
         num = scanner.nextInt();
         if (num == 9) { System.out.println(" ATM을 종료합니다."); break; }
         
         switch (num) {
         case 1:
            System.out.println(" 1. 추가기능입니다.");
            System.out.println("아이디 입력");
            id = scanner.next();
            System.out.println("비밀번호 입력");
            pass = scanner.next();
            System.out.println("잔액입력");
            balance = scanner.nextDouble();
            // 아이디입력 > _입력받기
            // 비밀번호입력 > _입력받기
            // 잔액입력 > _입력받기
            break;
         case 2: {
            //System.out.println(" 2. 조회기능입니다.");
            String temid, tempass;
            // 입력 2-1 사용자에게 임시아이디와 임시비밀번호 입력 받기
            // 2-2 아이디와 임시아이디가 같아야한고 비번과 임시비밀번호가 같다면 사용자정보 출력
            // 2-3 다르면 정보를 확인해 주세요.
            System.out.println("아이디:");
            temid = scanner.next();
            System.out.println("비밀번호:");
            tempass = scanner.next();
            if (id.equals(tempass) && pass.equals(tempass)) {
               System.out.print("==🎈🎈 조회\n" + "ID:" + id + "\n" + "pass:" + pass + "\n" + "나이: 1" + "\n"
                     + "잔액:" + balance+"\n");
            } else { System.out.println("정보를 확인해주세요"); }

         }
            break;
         case 3:{
            //System.out.println(" 3. 입금기능입니다.");
            
            // 변수 
            String temid = null, tempass = null;
            double income = 0 ;
            // 입력 사용자에게 임시아이디와 임시비밀번호 입력받기
            // 처리 if ( 아이디와 임시아이디가 같고 비번과 임시비번이 같다면 ) { 돈입력 받아서, 잔액에서 추가}
            // 출력 else { 아니라면 정보를 확인해주세요.}
            System.out.println("아이디:");temid = scanner.next();
            System.out.println("비밀번호:");tempass = scanner.next();

            if(id.equals(temid) && pass.equals(tempass)) {            
               System.out.println("입금");income = scanner.nextDouble();
               balance += income;
               System.out.print("==입금완료\n" + "잔액:" + balance + "\n");
            }else {System.out.println(" 정보를 확인해 주세요");}
            
         }break;
         case 4:{
            //System.out.println(" 4. 출금기능입니다.");
            

            // 변수 
            // 입력 사용자에게 임시아이디와 임시비밀번호 입력받기
            // 처리 if ( 아이디와 임시아이디가 같고 비번과 임시비번이 같다면 ) { 돈입력 받아서, 잔액에서 빼기}
            // 출력 else { 아니라면 정보를 확인해주세요.}
            String temid1 = null, tempass1 = null;
            double outcome = 0;
            System.out.println("아이디:");temid1 = scanner.next();
            System.out.println("비밀번호:"); tempass1 = scanner.next();
            if(id.equals(temid1) && pass.equals(tempass1)) {
               System.out.println("출금"); outcome = scanner.nextDouble();
               if(balance < outcome) {System.out.println("잔액이 부족합니다. 잔액확인후 진행해 주세요");}
               else if(balance >= outcome) {
               balance -= outcome;
               System.out.print("==출금완료\n" + "잔액:" + balance + "\n");}
               
         }
         }break;
         case 5:{
           // System.out.println(" 5. 삭제기능입니다.");
            // 변수 
            // 입력 사용자에게 임시아이디와 임시비밀번호 입력받기
            // 처리 if ( 아이디와 임시아이디가 같고 비번과 임시비번이 같다면 ) { 
            //      삭제하시겠습니까? 묻고 yes면 정보삭제 -  id = null, pass = null;  balance = 0;    }
            // 출력 else { 아니라면 정보를 확인해주세요.}
            String temid2 = null, tempass2 = null; 
            char Del = ' ';
            System.out.println("아이디:"); temid2 = scanner.next();
            System.out.println("비밀번호:"); tempass2 = scanner.next();

            if(id.equals(temid2) && pass.equals(tempass2)) {
            	System.out.println(" 삭제하시겠습니까(y/n)?"); 
	            Del = scanner.next().charAt(0);
				if (Del == 'y') {
					id = null;
					pass = null;
					balance = 0;
					System.out.println("id:" + id + "\n" + "pass:" + pass + "\n" + "잔액:" + balance);
				} else { System.out.println(" 정보를 확인해 주세요"); }
            }
         }break;
         
         }
      }
   }

}