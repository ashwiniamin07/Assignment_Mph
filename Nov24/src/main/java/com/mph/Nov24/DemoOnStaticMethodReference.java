package com.mph.Nov24;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DemoOnStaticMethodReference {
	
	
	static class NumberUtil{
		public static int squareNum(int num) {
			return num*num;
		}
		public static double log(double num) {
			return Math.log(num);
		}
		public static boolean isEven(int num) {
			return num%2==0;
		}
		
	}
	static class StringUtil{
		public static int strLen(String s) {
			return s.length();
		}
	}
	public static void main(String[] args) {
		Function<Integer,Integer> squareFunctionUsingLambda=(num)->NumberUtil.squareNum(num);
		Function<Integer,Integer> squareFunctionUsingMR=NumberUtil::squareNum;
		System.out.println(squareFunctionUsingLambda.apply(6));
		System.out.println(squareFunctionUsingMR.apply(8));
		
		Function<Double,Double> logUsingMR=NumberUtil::log;
		Function<Double,Double> logUsingLambda=(num)->NumberUtil.log(num);
		
		System.out.println(logUsingMR.apply(6.0));
		System.out.println(logUsingLambda.apply(8.0));
		
		Predicate<Integer> isEvenUsingLambda=(num)->NumberUtil.isEven(num);
		Predicate<Integer> isEvenUsingMR=NumberUtil::isEven;
		
		System.out.println(isEvenUsingLambda.test(6));
		System.out.println(isEvenUsingMR.test(7));
		
		
		Function<String,Integer> strLenUsinglambda=(name)->StringUtil.strLen(name);
		Function<String,Integer> strLenUsingMR=StringUtil::strLen;
		System.out.println(strLenUsinglambda.apply("swapna"));
		
		
	}

}
