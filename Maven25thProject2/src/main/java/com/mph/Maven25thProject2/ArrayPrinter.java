package com.mph.Maven25thProject2;

import java.util.Arrays;

public class ArrayPrinter <T> {
	private T[] arr;

	public ArrayPrinter(T[] arr) {
		super();
		this.arr = arr;
	}

	
	public ArrayPrinter() {
		super();
		// TODO Auto-generated constructor stub
	}


	public T[] getArr() {
		return arr;
	}

	public void setArr(T[] arr) {
		this.arr = arr;
	}

	@Override
	public String toString() {
		return "ArrayPrinter [arr=" + Arrays.toString(arr) + "]";
	}
	
	
}
