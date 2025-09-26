package com.company.java010_bank;


import java.util.Arrays;
import java.util.Scanner;

public class AdBank_Arraytest001 {
    public static void main(String[] args) {
        // 최대 고객 수
        final int MAX = 5;
        int num = -1;

        // 배열 선언
        String[] name = new String[MAX];     // 고객 이름
        String[] phone = new String[MAX];    // 고객 전화번호
        String[] interest = new String[MAX]; // 고객 관심 분야

        Scanner scanner = new Scanner(System.in);

        // 입력 + 처리 + 출력
        while (num != 9) {

            System.out.println("\n현재 고객명: " + Arrays.toString(name));
            System.out.println("현재 연락처: " + Arrays.toString(phone));
            System.out.println("현재 관심분야: " + Arrays.toString(interest));

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

            switch (num) {
                case 1: // 추가
                    int idx = -1;
                    for (int i = 0; i < MAX; i++) {
                        if (name[i] == null) {
                            idx = i;
                            break;
                        }
                    }
                    if (idx == -1) {
                        System.out.println("⚠️ 더 이상 고객을 추가할 수 없습니다.");
                    } else {
                        System.out.print("이름 입력 > ");
                        name[idx] = scanner.nextLine();
                        System.out.print("연락처 입력 > ");
                        phone[idx] = scanner.nextLine();
                        System.out.print("관심 광고 분야 입력 > ");
                        interest[idx] = scanner.nextLine();
                        System.out.println("✅ 고객 정보가 등록되었습니다.");
                    }
                    break;

                case 2: // 조회
                    System.out.println("\n=== 고객 정보 전체 조회 ===");
                    boolean exist = false;
                    for (int i = 0; i < MAX; i++) {
                        if (name[i] != null) {
                            System.out.println("[" + (i + 1) + "]");
                            System.out.println("이름     : " + name[i]);
                            System.out.println("연락처   : " + phone[i]);
                            System.out.println("관심광고 : " + interest[i]);
                            exist = true;
                        }
                    }
                    if (!exist) {
                        System.out.println("⚠️ 등록된 고객 정보가 없습니다.");
                    }
                    break;

                case 3: // 관심 광고 수정
                    System.out.print("수정할 고객 번호(1~" + MAX + ") 입력 > ");
                    int editIdx = scanner.nextInt() - 1;
                    scanner.nextLine();
                    if (editIdx < 0 || editIdx >= MAX || name[editIdx] == null) {
                        System.out.println("⚠️ 해당 고객이 존재하지 않습니다.");
                    } else {
                        System.out.print("새로운 관심 광고 분야 입력 > ");
                        interest[editIdx] = scanner.nextLine();
                        System.out.println("✅ 관심 광고가 수정되었습니다.");
                    }
                    break;

                case 4: // 삭제
                    System.out.print("삭제할 고객 번호(1~" + MAX + ") 입력 > ");
                    int delIdx = scanner.nextInt() - 1;
                    scanner.nextLine();
                    if (delIdx < 0 || delIdx >= MAX || name[delIdx] == null) {
                        System.out.println("⚠️ 해당 고객이 존재하지 않습니다.");
                    } else {
                        System.out.print("정말 삭제하시겠습니까? (Y/N) > ");
                        String confirm = scanner.nextLine();
                        if (confirm.equalsIgnoreCase("Y")) {
                            name[delIdx] = null;
                            phone[delIdx] = null;
                            interest[delIdx] = null;
                            System.out.println("🗑️ 고객 정보가 삭제되었습니다.");
                        } else {
                            System.out.println("삭제를 취소했습니다.");
                        }
                    }
                    break;

                case 9: // 종료
                    System.out.println("프로그램을 종료합니다. 감사합니다!");
                    break;

                default:
                    System.out.println("⚠️ 잘못된 번호입니다. 다시 입력해주세요.");
            }
        }

        scanner.close();
    }
}
