package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("ctx.xml");
		
		ctx.refresh();
		
		Subway subway = ctx.getBean("subway",Subway.class);
		
		System.out.println(subway.getLine());
		System.out.println(subway.getAddress());
		System.out.println(subway.getAddress2());
		System.out.println(subway.getStat());
		System.out.println(subway.getTel());
		
		
		ctx.close();
		
		

	}

}
