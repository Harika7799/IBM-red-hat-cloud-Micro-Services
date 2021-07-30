package com.example.junit_assertions_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private Calculator calculator = new Calculator();
	@Test
	public void testAddition() {

		assertEquals(6, calculator.addition(3, 3));
	}
	@Test 
	public void testSubtraction() {
		assertEquals(3 ,calculator.subtraction(8, 5));
	}
	@Test 
	public void testMultiplication() {
		assertEquals(40  ,calculator.multiplication(8, 5));
	}
	@Test 
	public void testDivision() {
		assertEquals(5 ,calculator.division(10, 2));
	}
	

}
