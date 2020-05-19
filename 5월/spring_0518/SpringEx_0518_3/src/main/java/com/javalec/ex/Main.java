package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("ctx.xml");
		
		ctx.refresh();
		
		Server server = ctx.getBean("server",Server.class);
		
		System.out.println(server.getAuth());
		System.out.println(server.getDriver());
		System.out.println(server.getUrl());
		System.out.println(server.getUsername());
		System.out.println(server.getPassword());
		
		
		System.out.println("----------------------");
		
		System.out.println(server.getName());
		System.out.println(server.getType());
		System.out.println(server.getMaxactive());
		System.out.println(server.getMaxwait());
		
		ctx.close();
		
		
	}

}
