package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		String config= "classpath:appCTX.xml";
		
		AbstractApplicationContext ctx= new GenericXmlApplicationContext(config);
		
		Car car = ctx.getBean("car",Car.class);
		
		car.use();
		car.run();
		car.stop();
		
		ctx.close();
		
	}
	
	

}
