package com.debug.test;

import com.debug.aop.StudentService;
import com.debug.aop.design.AppConfig;
import com.debug.aop.design.OrderDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * https://www.eclipse.org/aspectj/doc/released/devguide/compatibility.html
 */
public class AopTests {
	@Test
	public void testBeanAop(){
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring-aop.xml");
		StudentService studentService = context.getBean("studentService", StudentService.class);
		studentService.addStudent();
	}

	@Test
	public void testDesignCglib(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		OrderDao orderDao = applicationContext.getBean("orderDao", OrderDao.class);
		AppConfig appConfig = applicationContext.getBean(AppConfig.class);
		System.out.println();
	}
}
