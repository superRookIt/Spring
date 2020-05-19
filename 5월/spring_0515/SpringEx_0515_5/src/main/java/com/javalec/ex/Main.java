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
		
		//configur~가 조상 generic은 자손

		ConfigurableEnvironment env = ctx.getEnvironment();

		MutablePropertySources ps = env.getPropertySources();
		
		try {
			
			ps.addLast(new ResourcePropertySource("classpath:admin.properties"));
			System.out.println(env.getProperty("admin.id"));
			System.out.println(env.getProperty("admin.pw")); //env에 값이 들어감
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		
		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext) ctx;
		
		ctx2.load("ctx.xml");
		
		ctx2.refresh(); //AdminConnection의 init() method 실행 -> id, pw에 값 할당
		
		//id, pw, env값이 들어가 있는 상태
		AdminConnection admin = ctx2.getBean("admin",AdminConnection.class);
		
		System.out.println("Id : "+admin.getAdminId());
		System.out.println("Pw : "+admin.getAdminPw());
		
		ctx.close();
		

	}

}
