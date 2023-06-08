package org.java.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	final float num1 = 10.0f,
				num2 = 20.0f;
	
	final Calculator c = new Calculator(num1, num2);
	
	@Test
	public void add() {
		
		final float attRes = 30.0f;
		
		final float res = c.add(num1, num2);
		
		assertEquals(attRes, res);		
	}
	
	@Test
	public void subtract() {
		
		final float attRes = -10.0f;
		
		final float res = c.subtract(num1, num2);
		
		assertEquals(attRes, res);		
	}
	
	@Test
	public void divide() {
		
		final float attRes = 0.5f;
		
		final float res = c.divide(num1, num2);
		
		assertEquals(attRes, res);		
	}
	
	@Test
	public void multiply() {
		
		final float attRes = 200.0f;
		
		final float res = c.multiply(num1, num2);
		
		assertEquals(attRes, res);		
	}
}
