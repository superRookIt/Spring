package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.load("appCTX.xml"); //abstract는 load가 안됨
		
		ctx.refresh();
		
		AdminConnection admin = ctx.getBean("admin",AdminConnection.class);
		
		System.out.println(admin.getAdminId());
		System.out.println(admin.getAdminPw());
		System.out.println(admin.getSub_adminId());
		System.out.println(admin.getSub_adminPw());
		
		ctx.close();
		
		

	}

}
