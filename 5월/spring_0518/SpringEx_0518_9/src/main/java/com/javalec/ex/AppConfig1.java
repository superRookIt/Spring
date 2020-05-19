package com.javalec.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class AppConfig1 {

	
	@Bean
	public ServerInfo serverInfo() {

		ServerInfo serverInfo = new ServerInfo();
		
		serverInfo.setIp("211.107.108.1");
		serverInfo.setPort("8181");

		return serverInfo;

	}
	
	

}
