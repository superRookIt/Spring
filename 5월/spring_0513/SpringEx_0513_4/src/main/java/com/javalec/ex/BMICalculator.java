package com.javalec.ex;

public class BMICalculator {

	private double lowWeight; // 저체중
	private double normal; // 정상체중
	private double overWeight;// 과체중
	private double obesity; // 고비만

	
	
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}

	public void setNormal(double normal) {
		this.normal = normal;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}

	
	
	public void BMIcalculation(double weight, double height) {

		double h = height * 0.01;

		double result = weight / (h * h); // BMI 지수??

		System.out.println("당신의 BMI 지수 : " + result + "입니다");

		if (result > obesity) {
			System.out.println("고비만입니다");
		} else if (result > overWeight) {
			System.out.println("과체중입니다");
		} else if (result > normal) {
			System.out.println("보통입니다");
		} else {
			System.out.println("저체중입니다.");
		}

	}

}
