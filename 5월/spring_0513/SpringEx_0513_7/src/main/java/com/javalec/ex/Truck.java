package com.javalec.ex;

public class Truck implements Car {

	public void use() {
		System.out.println("짐을 옮깁니다 + 덮개 기능");
	}

	public void run() {

		System.out.println("시속 200km입니다");

	}

	public void stop() {

		System.out.println("늦게 멈춤");

	}

}
