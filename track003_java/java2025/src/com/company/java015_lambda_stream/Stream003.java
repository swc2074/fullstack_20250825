package com.company.java015_lambda_stream;

import java.util.Arrays;
import java.util.List;

public class Stream003 {

	public static void main(String[] args) {
		Integer[] ages = {17,21,26,45,18};
		
		double ave = Arrays.stream(ages)
							.mapToInt(age -> age)// 객체는 기본값
							.average() //평균값 처리
							.orElse(0.0); // 값없으면 0.0
		System.out.println("평균나이:" + ave);
		
		 System.out.println("\n\nEx2");
		//Ex2 짝수만 출력
		//step1) 스트림 만들기
		//
		//boolean java.util.function.Predicate.test( T t )
		Arrays.stream(ages)
		      .filter(t->t%2 ==0)
		      .forEach(System.out::print);
		//step2) 짝수필터링 - filter 이용
			  
		//step3) 출력 - forEach	
		//Ex3 성이 김씨인 친구들
		
		 System.out.println("\n\nEx3");
		List<String> names = Arrays.asList("김수지","아나영","김나영","유재석","강호동");
		System.out.println(names.get(0).startsWith("김"));// 문자열에서 startsWith("문자") 시작하는
		//step1) 스트림만들기
		 names.stream()
		      .filter(name ->name.startsWith("김"))
		      .forEach(System.out::print);
		 
		//step2) 김으로 시작하는 값찾기 - filter이용
		//step3) 출력 - forEach
		 System.out.println("\n\nEx4");
		 names.stream()
		      .sorted()
		      .forEach(System.out::print);
		 
		 System.out.println("\n\nEx5");
		 int max = Arrays.stream(ages).mapToInt(age->age).max().orElse(-1);
		 System.out.println(max);
		
	}// end main

}// end class
