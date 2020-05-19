package com.javalec.ex;

public class Ambulence implements Car {

	public void use() {

		System.out.println("사이렌이 울립니다");

	}

	public void run() {
		System.out.println("시속 300km");

	}

	public void stop() {
		System.out.println("빨리 멈춤");
	}

}
