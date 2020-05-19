package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:ctx.xml");

		Event event = ctx.getBean("event", Event.class);

		event.e_print();

		Join join = ctx.getBean("join", Join.class);

		join.j_print();

		Notice notice = ctx.getBean("notice", Notice.class);

		notice.n_print();

	}

}
