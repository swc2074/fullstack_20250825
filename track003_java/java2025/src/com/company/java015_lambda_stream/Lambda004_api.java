package com.company.java015_lambda_stream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda004_api {

	public static void main(String[] args) {
		// () ->{}
		// void java.util.function.Consumer.accept(T t) / (T t) -> {x} / accept
		//Consumer<String> consumer = (t) -> {System.out.println("Hello" + t);} ;
		//Consumer<String> consumer = t -> System.out.println("Hello" + t);
		Consumer<String> consumer = System.out::println; // 클래스의 어떤기능
		consumer.accept("sally");
		consumer.accept("lambda");
		
        // T java.util.function.Supplier.get() / () -> {return} /get
		//Supplier<String> supplier = ()->{return "Hello";};
		Supplier<String> supplier = ()-> "Hello";
		System.out.println(supplier.get());
					
		//boolean java.util.function.Predicate.test(T t)/ () -> {}
		//Predicate<Integer> predicate = (t)-> {return t<0;};
		Predicate<Integer> predicate = t->  t<0;
		System.out.println(predicate.test(10));
		System.out.println(predicate.test(-10));
		
		//Open Declaration
		//R java.util.function.Function.apply(T t)
		//Function<String,Integer> function = (t)->{return Integer.parseInt(t);};
		//Function<String,Integer> function = t-> Integer.parseInt(t);
		Function<String,Integer> function = Integer::parseInt;
		System.out.println(function.apply("10")+3);
		
		//Open Declaration
		//int java.util.function.IntBinaryOperator.applyAsInt( int left, int right )
		//IntBinaryOperator operator = ( int left, int right ) -> {return left>right ? left:right;};
		IntBinaryOperator operator = ( left, right ) -> left>right ? left:right;
		System.out.println(operator.applyAsInt(10, 3));
		System.out.println(operator.applyAsInt(3,10));

	}

}
/*
 자바의 api 함수형인터페이스
 1. Consumer 받는용도    - /accept / (T t) -> {x}
 
    void java.util.function.Consumer.accept(T t)
 2. Supplier 제공용도
 3. Predicate 판단용도
 4. Function  처리용도
 5. Operator  연산용도
 
 */
