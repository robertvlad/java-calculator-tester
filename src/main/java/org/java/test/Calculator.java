package org.java.test;

public class Calculator {
	
	private float num1,
					num2;

	public Calculator(float num1, float num2) {

		setNum1(num1);
		setNum2(num2);
	}

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}
	
	
	public float add(float num1, float num2) {
		
		return num1 + num2;
	}
	
	public float subtract(float num1, float num2) {
		
		return num1 - num2;
	}

	public float divide(float num1, float num2) {
	
	return num1 / num2;
	}

	public float multiply(float num1, float num2) {
	
	return num1 * num2;
	}
}
