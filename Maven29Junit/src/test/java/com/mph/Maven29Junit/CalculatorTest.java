package com.mph.Maven29Junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	public void addTest() {
		int expected=10;
		int actual=new Calculator().add(5,5);
		assertEquals(expected,actual);
	}
	@Test
	public void subTest() {
		int expected=3;
		int actual=new Calculator().sub(6,3);
		assertEquals(expected,actual);
	}
	@Test
	public void multTest() {
		int expected=12;
		int actual=new Calculator().mult(6,2);
		assertEquals(expected,actual);
	}
	@Test
	public void divTest() {
		int expected=3;
		int actual=new Calculator().div(21,7);
		assertEquals(expected,actual);
	}
	@Test
	public void isEvenTest() {
		assertTrue(new Calculator().isEven(4),"for input 4 result must be true");
		assertFalse(new Calculator().isEven(5));
	}
	
	@Test
	public void checkArraysTest() {
		int brr[]= {1,2,3,4,5};
		assertArrayEquals(brr,new Calculator().checkArrays());
		//assertSame(brr,new Calculator().checkArrays());
	}
	@Test
	public void checkAETest() {
		assertTrue(new Calculator().checkAE() instanceof ArithmeticException);
	}
}
