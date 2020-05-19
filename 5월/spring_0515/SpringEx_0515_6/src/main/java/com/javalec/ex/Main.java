package com.javalec.ex;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class Main {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		
		ConfigurableEnvironment env = ctx.getEnvironment();
		
		MutablePropertySources ps = env.getPropertySources();
		
		
		try {
			
			ps.addLast(new ResourcePropertySource("classpath:server.properties"));
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		
		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext) ctx;
		
		ctx2.load("ctx.xml");
		
		ctx2.refresh();
		
		ServerConn server = ctx.getBean("server",ServerConn.class);
		
		System.out.println(server.getAuth());
		System.out.println(server.getDriver());
		System.out.println(server.getMaxactive());
		System.out.println(server.getMaxwait());
		System.out.println(server.getName());
		System.out.println(server.getPassword());
		System.out.println(server.getType());
		System.out.println(server.getUrl());
		System.out.println(server.getUsername());
		
		
		ctx2.close();

	}

}
