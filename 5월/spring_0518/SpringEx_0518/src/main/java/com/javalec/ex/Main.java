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

		ConfigurableEnvironment env = ctx.getEnvironment(); // 외부문서 가져올때

		MutablePropertySources mps = env.getPropertySources();

		try {
			
			mps.addLast(new ResourcePropertySource("classpath:admin.properties"));
			System.out.println(env.getProperty("admin.id"));
			System.out.println(env.getProperty("admin.pw"));
			
		} 
		
		catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		
		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext) ctx;
		
		ctx2.load("appCTX.xml");
		
		ctx2.refresh(); //bean 객체가 실행됨, admin.id와 admin.pw에 env에서 값을 주입
		
		
		AdminConnection admin = ctx2.getBean("admin",AdminConnection.class);
		
		
		System.out.println(admin.getAdminId());
		System.out.println(admin.getAdminPw());
		System.out.println(admin.getEnv());
		
		ctx2.close();
		ctx.close();
		
		

	}

}
