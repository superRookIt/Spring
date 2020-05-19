package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		String cl = "classpath:CTX.xml";

		AbstractApplicationContext ac = new GenericXmlApplicationContext(cl);

		Avante a1 = ac.getBean("a1", Avante.class);
		Avante a2 = ac.getBean("a2", Avante.class);
		Avante a3 = ac.getBean("a3", Avante.class);
		
		a1.basic();
		a1.option();
		
		a2.basic();
		a2.option();
		
		a3.basic();
		a3.option();

	}

}
