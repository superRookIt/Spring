package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigCTX.class);
		
		Student stu1 = ctx.getBean("student1",Student.class);
		Student stu2 = ctx.getBean("student2",Student.class);
		
		
		System.out.println(""+stu1.getName());
		System.out.println(""+stu1.getAge());
		System.out.println(""+stu1.getHobbys());
		
		System.out.println(""+stu2.getName());
		System.out.println(""+stu2.getAge());
		System.out.println(""+stu2.getHobbys());
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
