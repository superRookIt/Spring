package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		String configLo ="classpath:appCTX.xml";
		
		AbstractApplicationContext actx= new GenericXmlApplicationContext(configLo);
		
		Student stu = actx.getBean("student",Student.class);
		Student stu2 = actx.getBean("student2",Student.class);
		
		stu.print();
		stu2.print();
		

	}

}
