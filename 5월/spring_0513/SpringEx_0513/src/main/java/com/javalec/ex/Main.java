package com.javalec.ex;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Main {
	

	public static void main(String[] args) {
		
		
		String configLocation = "classpath:applicationCTX.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		MyCalculator mycal = ctx.getBean("mycalculator", MyCalculator.class);
		
		mycal.add();
		mycal.sub();
		mycal.mul();
		mycal.div();
		
		
		
//		MyCalculator mycal = new MyCalculator();
//		
//		mycal.setCalculator(new Calculator());
//		mycal.setFirstNum(10);
//		mycal.setSecondNum(2);
//		
//		mycal.add();
//		mycal.sub();
//		mycal.mul();
//		mycal.div();
		
		

	}

}
