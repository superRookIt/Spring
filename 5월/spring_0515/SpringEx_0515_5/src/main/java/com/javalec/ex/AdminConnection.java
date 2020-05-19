package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {

	Environment env;
	String adminId;
	String adminPw;

	// EnvironmentAware implements 오버라이딩 메소드
	public void setEnvironment(Environment env) {

		// EnvironmentAware -> AdminConnection보다 먼저
		System.out.println("AdminConnection env에 값을 설정");
		setEnv(env);

	}

	public void afterPropertiesSet() throws Exception { // InitializingBean

		System.out.println("AdminConnection 실행시  init 최초 메소드");
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));

	}

	public void destroy() throws Exception { // DisposableBean
		
		System.out.println("AdminConnection 종료시 destory 실행");

	}

	public String getAdminId() {
		return adminId;
	}

	public String getAdminPw() {
		return adminPw;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

}
