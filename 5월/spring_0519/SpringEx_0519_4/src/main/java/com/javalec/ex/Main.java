package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:ctx.xml");

		Book book = ctx.getBean("book", Book.class);

		Rental rental = ctx.getBean("rental", Rental.class);

		book.b_print();

		rental.r_print();
		
		ctx.close();

	}

}
