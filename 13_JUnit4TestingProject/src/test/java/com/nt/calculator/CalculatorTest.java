package com.nt.calculator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {

	@AfterClass
	public static void afterClass()
	{
		System.out.println("CalculatorTest.afterClass()");
	}
	
	@Test
	public void addTest()
	{
		int actualResult = Calculator.add(12, 12);
		
		int expectedResult=24;
		
		Assert.assertEquals(actualResult, expectedResult);
	}
	@Test
	public void subTest()
	{
		int actualResult = Calculator.sub(12, 10);
		
		int expectedResult=2;
		
		Assert.assertEquals(actualResult, expectedResult);
	}
	@Test
	public void mulTest()
	{
		int actualResult = Calculator.mul(12, 4);
		
		int expectedResult=48;
		
		Assert.assertEquals(actualResult, expectedResult);
	}
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("CalculatorTest.beforeClass()");
	}
}
