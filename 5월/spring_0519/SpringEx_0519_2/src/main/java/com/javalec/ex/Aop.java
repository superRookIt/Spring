package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class Aop {

	public Object logger(ProceedingJoinPoint joinpoint) throws Throwable {

		System.out.println("around 시작");

		try {

			return joinpoint.proceed();

		} finally {

			System.out.println("around 끝");

		}

	}

	public void before() {

		System.out.println("before");

	}

	public void after() {

		System.out.println("after");

	}

}
