package com.debug.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 1. 前置通知
 * 2. 环绕通知前
 * 3. 返回通知
 * 4. 环绕通知后
 * 5. 后置通知
 * @author
 */
public class StudentServiceAspect {
	//前置通知，在方法之前通知
	public void before(JoinPoint jp){
		System.out.println();
		System.out.println("开始添加学生");
	}
	//后置通知
	public void doAfter(JoinPoint jp){
		System.out.println();
		System.out.println("添加学生结束");
	}
	//环绕通知
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println();
		System.out.println("添加学生前");
		Object retVal=pjp.proceed();
		System.out.println(retVal);
		System.out.println("添加学生后");
		return retVal;
	}
	//返回通知
	public void doAfterReturning(JoinPoint jp){
		System.out.println();
		System.out.println("返回通知");
	}
	//异常通知
	public void doAfterThrowing(JoinPoint jp,Throwable ex){
		System.out.println();
		System.out.println("异常通知");
		System.out.println("异常信息："+ex.getMessage());
	}
}
