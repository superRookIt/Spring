package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Ctx.class);
		
		Subway subway = ctx.getBean("subway",Subway.class);
		
		System.out.println(subway.getLine());
		System.out.println(subway.getAddress());
		System.out.println(subway.getAddress2());
		System.out.println(subway.getStat());
		System.out.println(subway.getTel());
		
	}

}
