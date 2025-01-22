package com.nt.calculator;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("CalculatorTest.beforeAll()");
	}
	
	
	@BeforeEach
	public void beforeEach()
	{
		System.out.println("CalculatorTest.beforeEach()");
	}
	
	@Test
	public void addTest() {
		int actualResult = Calculator.add(12, 12);

		int expectedResult = 24;

		Assertions.assertEquals(actualResult, expectedResult);
	}

	@Test
	public void subTest() {
		int actualResult = Calculator.sub(12, 10);

		int expectedResult = 2;
		Assertions.assertEquals(actualResult, expectedResult);

	}

	@Test
	public void mulTest() {
		int actualResult = Calculator.mul(12, 4);

		int expectedResult = 48;
		Assertions.assertEquals(actualResult, expectedResult);

	}
	
	@AfterAll
	public static void afterAll()
	{
		System.out.println("CalculatorTest.afterAll()");
	}
	
	

}
