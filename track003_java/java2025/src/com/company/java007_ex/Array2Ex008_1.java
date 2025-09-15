package com.company.java007_ex;
import java.util.Arrays;

public class Array2Ex008_1 {
   public static void main(String[] args) { 
      //변수
      int[][] datas = {  {  10, 10, 10 ,10},    // 00 01 02 03 04  # → 04+=00 04+=01...
                        {  20, 20, 20 ,20},    // 10 11 12 13 14  # → 14+=10 14+=11...
                        {  30, 30, 30 ,30},    // 20 21 22 23 24  # → 24+=20 24+=21...
      };  // 3층 4칸                        // 30 31 32 33 34      
                                      // #↓ 30+= 00  30+=10.... 
      int[][] result = new int[datas.length+1][datas[0].length+1];
      
      //입력  result[0][0] = datas[0][0]
      //     새로은 result 아파트 = 기존 datas 아파트 
      for(int ch=0; ch<datas.length;  ch++){//아파트의 층
         for(int kan=0; kan<datas[ch].length;  kan++) {//아파트의 칸수
            result[ch][kan] = datas[ch][kan];
         }    
      }
      
      //처리(1)  가로방향     10   10   10   10   0      // 00 01 02 03 04
      //ver-1
      //      result[0][4] += result[0][0];  
      //      result[0][4] += result[0][1]; 
      //      result[0][4] += result[0][2];
      //      result[0][4] += result[0][3];

      //      result[1][4] += result[1][0];  
      //      result[1][4] += result[1][1]; 
      //      result[1][4] += result[1][2];
      //      result[1][4] += result[1][3];

      //      result[2][4] += result[2][0];  
      //      result[2][4] += result[2][1]; 
      //      result[2][4] += result[2][2];
      //      result[2][4] += result[2][3];

      //ver-2
      //      for(int kan=0; kan<result[0].length-1; kan++) {   result[0][4] += result[0][kan];   }  
      //      for(int kan=0; kan<result[1].length-1; kan++) {   result[1][4] += result[1][kan];   }  
      //      for(int kan=0; kan<result[2].length-1; kan++) {   result[2][4] += result[2][kan];   }  

      //ver-3
      for (int ch = 0; ch < result.length - 1; ch++) {
         for (int kan = 0; kan < result[ch].length - 1; kan++) { 
        	 result[ch][4] += result[ch][kan];  // 4칸
             result[3][kan] += result[ch][0];   // 3층
             result[3][4] += result[ch][kan];   // 3층 4칸
      }
      //처리(2)  세로방향
      // ver-1
      // result 
     
      
      }
      
    
      //처리(3)  전체데이터
      
      //출력
      for(int ch=0; ch<result.length;  ch++){//아파트의 층
         for(int kan=0; kan<result[ch].length;  kan++) {//아파트의 칸수
            System.out.print( result[ch][kan] + "\t" );
         }   
         System.out.println();  //한층이 끝나면 해야할일
      }
   }// end main
}// end class

