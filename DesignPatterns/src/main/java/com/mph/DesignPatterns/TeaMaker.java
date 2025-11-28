package com.mph.DesignPatterns;

public class TeaMaker extends DrinkMaker{

	@Override
	void makeDrink() {
		System.out.println("making Tea");
	}

	@Override
	void addExtras() {
		System.out.println("Adding sugar and ginger");
		
	}

}
