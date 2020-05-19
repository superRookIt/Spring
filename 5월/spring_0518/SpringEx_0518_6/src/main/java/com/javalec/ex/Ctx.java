package com.javalec.ex;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class Ctx {

	
	@Value("${line}")
	private String line;
	@Value("${stat}")
	private String stat;
	@Value("${address}")
	private String address;
	@Value("${address2}")
	private String address2;
	@Value("${tel}")
	private String tel;

	
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {

		PropertySourcesPlaceholderConfigurer configure = new PropertySourcesPlaceholderConfigurer();

		Resource location = new ClassPathResource("subway.properties");

//		Resource[] location = new Resource[1];
//		
//		location[0] = new ClassPathResource("subway.properties");

		configure.setLocations(location);

		return configure;

	}

	
	@Bean
	public Subway subway() {

		Subway subway = new Subway();

		subway.setLine(line);
		subway.setAddress(address);
		subway.setAddress2(address2);
		subway.setStat(stat);
		subway.setTel(tel);

		return subway;

	}

}
