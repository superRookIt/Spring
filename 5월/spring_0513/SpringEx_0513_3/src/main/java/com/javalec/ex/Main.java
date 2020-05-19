package com.javalec.ex;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		String configLocation = "classpath:applicationCTX.xml";

		AbstractApplicationContext abc = new GenericXmlApplicationContext(configLocation);
		
		Temperature temp = abc.getBean("temperature", Temperature.class);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("섭씨를 입력하세요");
		
		double cc= scan.nextDouble();
		
		temp.setTemp(cc);
		
		System.out.println(temp.nav);
		
		temp.result();

	}

}
