package com.company.java008;

import java.util.Arrays;

public class Method005 {
   
   public static void call (int a){System.out.println(a+">"+(a+=10));}
   ///////////////////////////////////////
   public static void main(String[]args) {
      int [] arr = {10,20,30};
      
                        // call by value : 배열값 변경[안됨]
      call(10);         // [값]+10을 해주는 마법상자  
      call(arr[0]);     // public static void call (int a){+10}
      
      System.out.println("[1]main >"+ System.identityHashCode(arr));
      System.out.println("[2]main >"+ Arrays.toString(arr));
                         
                        // call by reference : 배열값 변경[됨].
      call(arr);        // [값]+100 해주는 마법상자
                        // public static void call(int[] arr){+100}
      System.out.println("[3]main >"+ System.identityHashCode(arr));
      System.out.println("[4]main >"+ Arrays.toString(arr));
   }
   ///////////////////////////////////////
   private static void call (int[] arr) {
      for(int i=0; i<arr.length; i++) {arr[i]+=100;}
      System.out.println("call [주소]" + System.identityHashCode(arr) 
                                      + Arrays.toString(arr));
   }
}
