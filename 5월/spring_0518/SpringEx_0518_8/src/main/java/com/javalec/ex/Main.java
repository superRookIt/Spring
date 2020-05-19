package com.javalec.ex;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		String config = "";

		System.out.println("환경을 선택해주세요 1)windows 2)tablet 3)mobile");

		Scanner scan = new Scanner(System.in);

		switch (scan.nextInt()) {
		
		case 1:
			
			config="chrome";

			break;

		case 2:
			
			config="tablet";

			break;

		case 3:

			config="mobile";
			
			break;

		} //switch
		
		scan.close();
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		
		ctx.getEnvironment().setActiveProfiles(config); //★★★★★
		
		ctx.load("ctx1.xml","ctx2.xml","ctx3.xml");
		
		ctx.refresh();
		
		Browser browser = ctx.getBean("browser", Browser.class);
		
		System.out.println(browser.getBrow());
		System.out.println(browser.getIp());
		System.out.println(browser.getCon());
		
		ctx.close();
		

	}

}
