package com.mph.Nov24;

import java.util.function.Supplier;

public class DemoSupplier {
	public static void main(String[] args) {
		String name="swapna";
		Supplier<String> supplier=()->name.toUpperCase();
		System.out.println(supplier.get());
		
		Supplier<Integer> randomSupplier=()->(int)Math.round(Math.random()*10000);
		System.out.println(randomSupplier.get());
		
		int a=89;
		int b=32;
		
		Supplier<Integer> maxSupplier=()->a>b?a:b;
		System.out.println(maxSupplier.get());
	}

}
