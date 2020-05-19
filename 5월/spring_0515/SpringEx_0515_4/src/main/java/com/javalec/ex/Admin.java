package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class Admin implements EnvironmentAware, InitializingBean, DisposableBean {

	private Environment env; //property를 모은 게 environment
	private String adminId;
	private String adminPw;

	public Environment getEnv() {
		return env;
	}

	public void setEnv(Environment env) {
		this.env = env;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPw() {
		return adminPw;
	}

	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}

	// Admin 시작전 실행해서 값을 할당
	public void setEnvironment(Environment env) {
		System.out.println("setEnvironment 설정 됨");
		setEnv(env);

	}

	// init() 객체생성시 실행
	public void afterPropertiesSet() throws Exception {

		System.out.println("객체 생성시 env에서 admin_id, pw 값을 할당");
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));

	}

	public void destroy() throws Exception {

		System.out.println("빈 객체 종료");

	}

	
}
