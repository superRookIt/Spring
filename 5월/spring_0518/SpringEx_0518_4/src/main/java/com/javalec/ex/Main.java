package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCTX.class);
		
		ServerInfo serverinfo =  ctx.getBean("serverInfo", ServerInfo.class);
		
		System.out.println(serverinfo.getAuth());
		System.out.println(serverinfo.getDriver());
		System.out.println(serverinfo.getName());
		System.out.println(serverinfo.getPw());
		System.out.println(serverinfo.getUrl());
		
		ctx.close();
		
		

	}

}
