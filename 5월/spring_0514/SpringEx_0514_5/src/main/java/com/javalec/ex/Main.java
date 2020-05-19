package com.javalec.ex;

import java.io.ObjectInputStream.GetField;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCTX.class);
		
		Student st1 = ctx.getBean("student2",Student.class);
		
		st1.result();
		

	}

}
