package com.mph.DesignPatterns;

public class CoffeeMaker extends DrinkMaker{

	@Override
	void makeDrink() {
		System.out.println("Making Coffee");
		
	}

	@Override
	void addExtras() {
		System.out.println("Adding sugar");
		
	}

}
