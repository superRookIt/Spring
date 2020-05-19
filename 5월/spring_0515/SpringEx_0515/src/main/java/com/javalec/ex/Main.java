package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("classpath:ctx.xml");
		
		ctx.refresh();//InitializingBean()
		
		Student stu = ctx.getBean("stu",Student.class);
		
		System.out.println(stu.getAge());
		
		ctx.close(); //DisposableBean()
		

	}

}
