package com.mph.Maven29Junit;

public class Circle extends Shape {

	@Override
	public Shape type() {
		return new Triangle();
		
	}

}
