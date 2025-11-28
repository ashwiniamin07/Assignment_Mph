package com.mph.DesignPatterns;

public abstract class DrinkMaker {
	public final void prepareDrink() {
		boilWater();
		makeDrink();
		addExtras();
		serve();
	}
	public void boilWater() {
		System.out.println("Water boiled");
	}
	public void serve() {
		System.out.println("Drink served");
	}
	abstract void makeDrink();
	abstract void addExtras();

}
