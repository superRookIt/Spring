package com.javalec.ex;

public class Server {

	private String auth;
	private String driver;
	private String url;
	private String username;
	private String password;

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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	//

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

}
