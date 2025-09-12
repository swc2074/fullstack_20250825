package com.company.java_homework_adTest20250912; 
import java.util.Scanner;

public class AdTest_20250912_ver01 {
   public static void main(String[] args) {
      // =====================================================
      // 📊 Advertising Statistics Manager (Mini DEMO)
      // =====================================================
      // ✔ 콘셉트: "광고주/마케터가 한눈에 보는 미니 광고 통계 관리"
      // - ID/PASS: 광고주 로그인
      // - balance: 광고 예산 (Budget)으로 해석
      // - CRUD 기능:
      //    1. 캠페인 등록 (광고주 계정 + 초기 예산)
      //    2. 통계 조회 (노출수, 클릭수, 전환율, 예산 소진율 등 표시 가능)
      //    3. 광고비 충전 (예산 추가)
      //    4. 광고비 집행 (출금 → 광고비 소진으로 해석)
      //    5. 캠페인 삭제 (종료)
      // - 제어문, 반복문, switch문 활용 → 실무적 흐름 제어
      //
      // 🚀 확장 아이디어:
      //    ▸ 광고 채널(Naver, Google, Meta 등) 별 예산 분배
      //    ▸ 입금=충전 → 리워드 포인트 지급
      //    ▸ 출금=광고집행 → 랜덤 클릭수/노출수 생성 (의사 데이터)
      //    ▸ 통계 조회 시 CTR, CPC, ROI 계산
      //    ▸ 일/주/월 단위 보고서 자동화 (PDF/Excel)
      // =====================================================

      // 변수
      int num = -1; 
      String id = "", pass="";  
      double balance=0; // balance → 광고 예산 (budget)
      Scanner scanner = new Scanner(System.in);
      
      // 입력 + 처리 + 출력
       for(;;){  
          // ■ 기능 1. 메뉴판
          System.out.print("\n\n== Advertising Stats Manager ==" + 
             "\n1. 캠페인 등록" + 
             "\n2. 광고 통계 조회" + 
             "\n3. 예산 충전" + 
             "\n4. 광고비 집행" + 
             "\n5. 캠페인 삭제" + 
             "\n9. 종료 > "     
          );  
          num= scanner.nextInt();

          // ■ 기능 2. 종료
          if(num==9){ 
              System.out.println("📴 시스템을 종료합니다.");  
              break;   
          }
          // ■ 기능 3. 캠페인 등록
          else if(num==1){ 
             System.out.print("광고주 ID 입력 > "); id=scanner.next();
             System.out.print("비밀번호 입력 > "); pass=scanner.next();
             System.out.print("초기 예산 입력(₩) > "); balance=scanner.nextDouble();    
             System.out.println("✅ 캠페인이 등록되었습니다!");
          }
          // ■ 기능 4. 조회/충전/집행/삭제
          else if(num==2 || num==3|| num==4|| num==5){ 
             // 1. 사용자 인증
             System.out.print("ID   입력 > "); String tempId=scanner.next();
             System.out.print("PASS 입력 > "); String tempPass=scanner.next();
             if( !(id.equals(tempId)  && pass.equals(tempPass) )) {
                System.out.println("🚨 계정 정보가 올바르지 않습니다!");
                continue; // 인증 실패 시 리턴
             }

             // 2. switch문으로 각 기능 실행
             switch(num){
                case 2 : 
                   // 광고 통계 조회
                   System.out.println("\n📊 [광고 캠페인 통계]");
                   System.out.println("광고주 ID > " + id);
                   System.out.println("예산 잔액 > " + balance + " 원");
                   // 👉 향후 확장: 노출수, 클릭수, CTR(클릭률), CPC, ROI 계산 추가
                break;

                case 3 : 
                   // 예산 충전
                   System.out.print("충전할 금액(₩) > ");  
                   double input = scanner.nextDouble();
                   balance +=input;  
                   System.out.println("💰 " + input + " 원 충전 완료!");
                   System.out.println("총 예산: " + balance + " 원");
                   // 👉 아이디어: 일정 금액 이상 충전 시 “보너스 광고 포인트” 지급
                break;

                case 4 : 
                   // 광고비 집행
                   System.out.print("집행할 금액(₩) > ");  
                   double output = scanner.nextDouble();
                   if(output>balance) { 
                      System.out.println("⚠️ 예산이 부족합니다!");  
                      continue; 
                   }
                   balance -=output;  
                   System.out.println("📢 광고비 " + output + " 원 집행 완료!");
                   System.out.println("남은 예산: " + balance + " 원"); 
                   // 👉 아이디어: 집행 시 가상 클릭수/노출수 랜덤 생성 → CTR 시뮬레이션
                break;

                case 5 : 
                   // 캠페인 삭제
                   System.out.println("캠페인을 종료하시겠습니까? (y/n)");  
                   String answer = scanner.next();  
                   if(!answer.toLowerCase().equals("y")) {
                      System.out.println("❌ 삭제 취소"); 
                      continue;
                   }
                   id=pass=""; balance=0;
                   System.out.println("🔥 캠페인이 종료되었습니다.");
                break;
             }
         } // end else if
           
      }// end for 
   }// end main
}//end class
