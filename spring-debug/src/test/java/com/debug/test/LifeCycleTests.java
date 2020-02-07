package com.debug.test;

import com.debug.ioc.lifecycle.LifeCycleService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTests {
	@Test
	public void testLifeCycle(){
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:bean.xml");
		LifeCycleService lifeCycleService = context.getBean("lifeCycleService", LifeCycleService.class);
	}
}
