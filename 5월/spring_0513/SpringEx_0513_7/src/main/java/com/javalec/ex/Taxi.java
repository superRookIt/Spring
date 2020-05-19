package com.javalec.ex;

public class Taxi implements Car {

	public void use() {

		System.out.println("미터기 기능");

	}

	public void run() {
		System.out.println("시속 250km입니다");

	}

	public void stop() {
		System.out.println("빨리 멈춤");

	}

}
