package com.javalec.ex;

public class MyCalculator { // 계산만

	Calculator calculator;

	int firstNum;
	
	int secondNum;

	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	
	
	
	public void add() {

		calculator.add(firstNum, secondNum);

	}

	
	public void sub() {

		calculator.sub(firstNum, secondNum);

	}

	
	public void mul() {

		calculator.mul(firstNum, secondNum);

	}

	
	public void div() {

		calculator.div(firstNum, secondNum);

	}

}
