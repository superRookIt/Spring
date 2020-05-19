package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:ctx.xml");
		
		Student student = ctx.getBean("student",Student.class);
		
		student.getStudentInfo();
		
		Worker worker = ctx.getBean("worker",Worker.class);
		
		worker.getWorkInfo();
		
		ctx.close();
		

	}

}
