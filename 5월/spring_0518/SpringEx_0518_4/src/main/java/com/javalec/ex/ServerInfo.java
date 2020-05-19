package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ServerInfo implements InitializingBean, DisposableBean{
	
	
	private String auth;
	private String driver;
	private String url;
	private String username1;
	private String pw;
	
	private String name;
	private String type;
	private String maxactive;
	private String maxwait;
	
	

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername1() {
		return username1;
	}

	public void setUsername1(String username1) {
		this.username1 = username1;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMaxactive() {
		return maxactive;
	}

	public void setMaxactive(String maxactive) {
		this.maxactive = maxactive;
	}

	public String getMaxwait() {
		return maxwait;
	}

	public void setMaxwait(String maxwait) {
		this.maxwait = maxwait;
	}

	
	public void destroy() throws Exception {
		
		
		
	}

	public void afterPropertiesSet() throws Exception {
		
		
		
	}

	
	
	
}
