package com.mph.Nov24;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoObjectMethodReference {

	public static void main(String[] args) {
		String myName="Ashwini Amin";
		Supplier<Integer> lenUsingLambda=()->myName.length();
		Supplier<Integer> lenUsingMR=myName::length;
		System.out.println(lenUsingLambda.get());
		System.out.println(lenUsingMR.get());
		
		Hello h=new Hello();
		Supplier<String> helloUsingLambda=()->h.sayHello();
		Supplier<String> helloUsingMR=h::sayHello;
		
		System.out.println(helloUsingLambda.get());
		System.out.println(helloUsingMR.get());
		
		NumberUtilMR nu=new NumberUtilMR();
		Predicate<Integer> isEvenUsingMr=nu::isEven;
		System.out.println(isEvenUsingMr.test(45));
		
		Function<Integer,Integer> squareNumMr=nu::squareNum;
		System.out.println(squareNumMr.apply(10));
		
		Function<Double,Double> logMR=nu::log;
		System.out.println(logMR.apply(2.0));
		
		int arr[]= {1,2,3,4,5};
		
		Consumer<int[]> printMR=nu::printNum;
		printMR.accept(arr);
		
		

	}

}
class Hello{
	public String sayHello() {
		return "Hello....";
	}
}
class NumberUtilMR{
	public boolean isEven(int num) {
		return num%2==0;
	}
	public int squareNum(int num){
		return num*num;
	}
	public double log(double num) {
		return Math.log(num);
	}
	public void printNum(int arr[]) {
		for(int i:arr)
			System.out.println(i);
	}
}
