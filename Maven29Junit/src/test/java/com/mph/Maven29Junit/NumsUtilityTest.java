package com.mph.Maven29Junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumsUtilityTest {
	@ParameterizedTest
	@ValueSource(ints= {2,4,6,8})
	public void isEvenTest(int n) {
		assertTrue(NumsUtility.isEven(n));
	}
}
