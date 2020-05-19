package com.javalec.ex;

public class Score_Process {

	
	
	
	
	public double process(int a, int b, int c) {

		double avg = a + b + c / 3;
		
		return avg;

	}

	
	
	
	public void rank(double a) {
		
		if(a>=90) {
			System.out.println("A등급");
		} else if(a>=80 && a<90) {
			System.out.println("B등급");
		}else if(a>=70 && a<80) {
			System.out.println("C등급");
		}else {
			System.out.println("D등급");
		}
		
		
	}

	
	
	
	
}
