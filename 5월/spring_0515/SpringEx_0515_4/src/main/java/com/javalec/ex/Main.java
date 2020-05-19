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

		MutablePropertySources PropertySources = env.getPropertySources();

		try {

			PropertySources.addLast(new ResourcePropertySource("classpath:admin.properties")); // env에 값을 넣음

			// System.out.println(env.getProperty("admin.id"));
			// System.out.println(env.getProperty("admin.pw"));

		} catch (IOException e) {

			e.printStackTrace();
		}

		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext) ctx;

		ctx2.load("classpath:ctx.xml");
		
		ctx2.refresh(); //이때 이미 값이 넣어짐
		
		Admin admin = ctx2.getBean("admin", Admin.class);

		System.out.println("ID : " + admin.getAdminId());
		System.out.println("PW : " + admin.getAdminPw());
		
		ctx2.close();

	}

}
