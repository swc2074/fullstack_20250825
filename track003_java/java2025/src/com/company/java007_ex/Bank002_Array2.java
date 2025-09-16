package com.company.java007_ex;

import java.util.Arrays;
import java.util.Scanner;

public class Bank002_Array2 {
   public static void main(String[] args) {
      //변수                          0   1    2
      String []id=new String[3];       //  one two three
      String []pass = new String[3];   // 1111 2222 3333
      double []balance = new double[3];// 1100 2200 3300   
      int num=-1;  
      Scanner scanner = new Scanner(System.in);
      
      //입력 + 처리 + 출력
      //Q1. 9가 아니라면 계속무한반복  for(;;)  while(조건)
      while(num != 9) {
         System.out.println(Arrays.toString(id));
         System.out.println(Arrays.toString(pass));
         System.out.println(Arrays.toString(balance));
         System.out.print("\n\n🌟💰 WELCOME TO BANK SYSTEM 💰🌟\n" + 
             "\n[1] ➕ 계좌 추가" + "\n[2] 🔍 계좌 조회" + "\n[3] 💵 입금하기" + "\n[4] 💸 출금하기" + "\n[5] 🗑️ 계좌 삭제  "
             +"\n\n👉 번호를 선택하세요:"
          );
         num = scanner.nextInt();
         
         //Q2. if else if ( 전체적인 큰틀)
         if(num==1) {
            //1. 빈칸인지 확인 >  if( 만약 0번째 가 빈칸이라면 ){ find는 0 }    원하는한줄 , 구조, 코드변환 , break
            int find=-1;   //find 빈칸찾아서 넣을 번호
            for(int i=0; i<id.length; i++) { if(id[i] == null) {  find = i;  break; }  }
            if(find == -1) {   System.out.println("계좌를 생성할수 없습니다."); continue;  } 
            //2. 빈칸에 입력받기
            System.out.print("[1]아이디 입력 > ");  id[find] = scanner.next();
            System.out.print("[2]비밀번호입력 > ");  pass[find] = scanner.next();
            System.out.print("[3]금액   입력 > ");  balance[find] = scanner.nextDouble();
         }else if(num==2 ||num==3 ||num==4 ||num==5) {
            //1. 사용자인증  아이디를입력받아 id[0]와 같고  비밀번호입력받아 pass[0]와 같다면 찾은번호는 0
            int find=-1;
            System.out.print("[1]아이디 입력 > ");  String tempid = scanner.next();
            System.out.print("[2]비밀번호입력 > ");  String temppass = scanner.next();
        	for (int i=0; i<id.length; i++) {
        		if(tempid.equals(id[i]) && temppass.equals(pass[i])) {find=i; break;}
        		
        	}
        	if(find == -1) {System.out.println("아이디와 비밀번호를 확인해주세요!");continue;
        	
        	}
        	 
            //2. 각각의 처리
            switch(num) {
               case 2: System.out.println("[1]아이디 > " + id[0] 
                                    + "\n[2]비밀번호>" + pass[0]  + "\n[3]잔액>" + balance[0] ); 
               break;
               case 3: System.out.println("입금할 금액>"); double temp1 = scanner.nextDouble();
                     balance[0] += temp1;
               break;
               case 4: System.out.println("출금할 금액>"); double temp2 = scanner.nextDouble();
                     balance[0] -= temp2;
               break;
               case 5: System.out.println("정말로 삭제하시겠습니까?"); 
                     if( scanner.next().toLowerCase().equals("y") ) {
                        id[0] = null;  pass[0]=null;  balance[0] = 0;
                     }
               break;
            }
            
         } else {  System.out.println("메뉴를 확인해주세요~!"); }
         
      } // end while
   }// end main
}//end class