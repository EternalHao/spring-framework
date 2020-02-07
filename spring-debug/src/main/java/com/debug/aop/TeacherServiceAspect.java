package com.debug.aop;

import org.springframework.stereotype.Component;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.AfterReturning;


@Component("teacherServiceAspect")
@Aspect
public class TeacherServiceAspect {
	@Pointcut(value="execution(* com.debug.aop.*.*(..))")
	public void point(){}

	@Before(value = "point()")
	public void before(){
		System.out.println();
		System.out.println(" TeacherServiceAspect 前置通知");
	}

	@After(value = "point()")
	public void after(){}

	@Around(value = "point()")
	public void around(){}

	@AfterThrowing(value = "point()")
	public void afterThrowing(){}

	@AfterReturning(value = "point()")
	public void afterReturning(){}

}
