package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		//ctrl + t
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCTX.class);

		Student stu1 = ctx.getBean("student1",Student.class);
		
		System.out.println(stu1.getName());
		System.out.println(stu1.getHobbys());
		

	}

}
