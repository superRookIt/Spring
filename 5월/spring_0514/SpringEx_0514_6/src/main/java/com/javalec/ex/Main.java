package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		
		Student stu1 = ctx.getBean("student1", Student.class);
		
		Student stu2 = ctx.getBean("student2", Student.class);
		
		
		stu1.get_stuPrint();
		
		stu2.get_stuPrint();
		

	}

}
