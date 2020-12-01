package com.cts;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectDemo {
	@After("execution(public * com.cts.EmployeeService.*(..))")
	public void log() {
		System.out.println("----log method is called---");
	}
	@After("execution(public void com.cts.EmployeeService.*(int))")
	public void loge() {
		System.out.println("---loge method is called----");
	}
	@Before("execution(public String com.cts.EmployeeService.*(..))")
    public void loger() {
		System.out.println("---loger method is called----");
	}
	@After("execution(public * com.cts.EmployeeService.*(int,String))")
	public void logger() {
		System.out.println("---logger method is called");
	}
	@Before("execution(public void com.cts.EmployeeService.*(int,..))")
	public void loggeer() {
		System.out.println("-----loggeer method is called--");
	}
}
