package com.javalec.ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource; //
 
@Configuration
public class AppCTX {
	
	@Value("${auth}")
	private String auth;
	@Value("${driver}")
	private String driver;
	@Value("${url}")
	private String url;
	@Value("${username1}")
	private String username1;
	@Value("${pw}")
	private String pw;
	
	@Value("${name}")
	private String name;
	@Value("${type}")
	private String type;
	@Value("${maxactive}")
	private String maxactive;
	@Value("${maxwait}")
	private String maxwait;
	
	
	
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer Properties() {
		
		PropertySourcesPlaceholderConfigurer configure = new PropertySourcesPlaceholderConfigurer();
		
	    Resource[] location = new Resource[2];
	    
		location[0] = new ClassPathResource("server1.properties");
		location[1] = new ClassPathResource("server2.properties");
		
		configure.setLocations(location);
		
		// Resource location = new ClassPathResource("server.properties");
		
		return configure;
		
	}
	
	
	
	
	@Bean
	public ServerInfo serverInfo() {
		
		ServerInfo serverInfo = new ServerInfo();
		
		serverInfo.setAuth(auth);
		serverInfo.setDriver(driver);
		serverInfo.setName(name);
		serverInfo.setPw(pw);
		serverInfo.setType(type);
		serverInfo.setUsername1(username1);
		serverInfo.setUrl(url);
		
		return serverInfo;
		
	}
	
	
	
	
	

}
