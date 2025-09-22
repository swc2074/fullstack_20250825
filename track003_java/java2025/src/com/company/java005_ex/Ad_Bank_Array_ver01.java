package com.company.java005_ex;

import java.util.Arrays;
import java.util.Scanner;

public class Ad_Bank_Array_ver01 {
    public static void main(String[] args) {
        // 변수
        int num = -1;
        String name = "", 
        		//String [] name = new String [3]; // 고객이름 
        phone = "", 
        		//String [] phone = new String [3]; // 고객 전화 번호
        interest = "";
        		//String [] interest = new String [3]; // 고객 관심 분야
        
        Scanner scanner = new Scanner(System.in);

        // 입력 + 처리 + 출력
        while  ( num !=9){
        	
        	System.out.println(Arrays.toString(name));
        	System.out.println(Arrays.toString(phone));
        	System.out.println(Arrays.toString(interest));
            // 메뉴판
            System.out.print("\n===== 📢 광고 & 고객 연락처 관리 =====\n"
                    + "🎁1. 고객 정보 추가\n"
                    + "🕶2. 고객 정보 조회\n"
                    + "🛒3. 관심 광고 수정\n"
                    + "🛠4. 고객 삭제\n"
                    + "✂9. 종료\n"
                    + "번호를 선택하세요 >>> ");
            num = scanner.nextInt();
            scanner.nextLine(); // 버퍼 정리

            // 종료
            if (num == 1) {
               
            	int find=-1;
            	for(int i=0; i<name.length; i++) {if(name[i] == null ) { find = i; break;} }
            	if(find == -1) { System.out.println(" 회원")
            	
            	System.out.println("프로그램을 종료합니다. 감사합니다!");
                break;
            }

            switch (num) {
                case 1: // 추가
                    System.out.print("이름 입력 > ");
                    name = scanner.nextLine();
                    System.out.print("연락처 입력 > ");
                    phone = scanner.nextLine();
                    System.out.print("관심 광고 분야 입력 > ");
                    interest = scanner.nextLine();
                    System.out.println("✅ 고객 정보가 등록되었습니다.");
                    break;

                case 2: // 조회
                    if (name.isEmpty()) {
                        System.out.println("⚠️ 등록된 고객 정보가 없습니다.");
                    } else {
                        System.out.println("\n=== 고객 정보 ===");
                        System.out.println("이름     : " + name);
                        System.out.println("연락처   : " + phone);
                        System.out.println("관심광고 : " + interest);
                    }
                    break;

                case 3: // 관심 광고 수정
                    if (name.isEmpty()) {
                        System.out.println("⚠️ 먼저 고객 정보를 추가해주세요.");
                    } else {
                        System.out.print("새로운 관심 광고 분야 입력 > ");
                        interest = scanner.nextLine();
                        System.out.println("✅ 관심 광고가 수정되었습니다.");
                    }
                    break;

                case 4: // 삭제
                    if (name.isEmpty()) {
                        System.out.println("⚠️ 삭제할 고객 정보가 없습니다.");
                    } else {
                        System.out.print("정말 삭제하시겠습니까? (Y/N) > ");
                        String confirm = scanner.nextLine();
                        if (confirm.equalsIgnoreCase("Y")) {
                            name = phone = interest = "";
                            System.out.println("🗑️ 고객 정보가 삭제되었습니다.");
                        } else {
                            System.out.println("삭제를 취소했습니다.");
                        }
                    }
                    break;

                default:
                    System.out.println("⚠️ 잘못된 번호입니다. 다시 입력해주세요.");
            }
        }

        scanner.close();
    }
}
