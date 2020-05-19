package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");

		MyInfo mi = ctx.getBean("myinfo", MyInfo.class);
		
		mi.getInfo();
		
	}

}
