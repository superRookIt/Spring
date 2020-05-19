package com.javalec.ex;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:ctx.xml");
		
		BookLoan book= ctx.getBean("book", BookLoan.class);
		
		book.printBook();
		
		StudentInfo info = ctx.getBean("info",StudentInfo.class);
		
		info.printInfo();
		
		StudentScore scroe= ctx.getBean("score",StudentScore.class);
		
		scroe.printScore();
		
		ctx.close();
		
		
	}
	
	
}
