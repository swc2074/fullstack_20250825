package com.company.java014;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

// 1. 콜렉션프레임워크  - 동적배열
// 2. 배열의 단점개선 - 한가지자료형으로 사이즈 고정

public class List001 {

	public static void main(String[] args) {
		// Step1. Array
		String[] arr = new String[3]; // String 자료형 공간3개 [고정]
		arr[0] = "헐크";
		System.out.println(Arrays.toString(arr));
		// Step2. 동적배열 - List 사용법(1)
		// 부모
		List list = null;
		     list = new ArrayList();
		     list = new LinkedList();
		     list = new Vector();

		
		     
		
		     
		// Step3. <>동적배열 - List 사용법
		     List<String> list2 = new ArrayList<String>();  // 자료형 상관없이 내가 넣고 싶은 만큼
		     
		     list2.add("one"); // Object obj = "one";
		     //list2.add(1);     // Object obj = 1;
		     list2.add(new String("two")); // Object obj = new String("two");
		     //list2.add(3.14);
		     //list2.add('A');
		     System.out.println(list2);
		// Step4. add(추가), get(가져오기) size(갯수), remove(삭제), contains  ■ 
		     List<String>list3 = new ArrayList<String>();
		     list3.add("apple");
		     list3.add("banana");
		     list3.add("apple");
		     list3.add("coconut");
		     System.out.println(list3);
		     System.out.println(list3.get(0));
		     System.out.println(list3.size());
		     System.out.println(list3.remove(0) + "/" + list3);
		     System.out.println(list3.contains("melon"));
		     System.out.println(list3.contains("coconut"));
	}

}
