package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class ServerConn implements EnvironmentAware, DisposableBean, InitializingBean {

	String auth;
	String driver;
	String url;
	String username;
	String password;
	String name;
	String type;
	String maxactive;
	String maxwait;

	Environment env;

	public ServerConn() {

	}

	public void afterPropertiesSet() throws Exception {

		setAuth(env.getProperty("auth"));
		setDriver(env.getProperty("driver"));
		setUrl(env.getProperty("url"));
		setUsername(env.getProperty("user_name"));
		setName(env.getProperty("name"));
		setPassword(env.getProperty("password"));
		setType(env.getProperty("type"));
		setMaxactive(env.getProperty("maxactive"));
		setMaxwait(env.getProperty("maxwait"));

	}

	public void destroy() throws Exception {

	}

	public String getAuth() {
		return auth;
	}

	public String getDriver() {
		return driver;
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getMaxactive() {
		return maxactive;
	}

	public String getMaxwait() {
		return maxwait;
	}

	public Environment getEnv() {
		return env;
	}

	public void setEnvironment(Environment env) {

		setEnv(env);

	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setMaxactive(String maxactive) {
		this.maxactive = maxactive;
	}

	public void setMaxwait(String maxwait) {
		this.maxwait = maxwait;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

}
