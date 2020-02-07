package com.debug.test;

import com.debug.ioc.di.construct.ConstructorDI;
import com.debug.ioc.di.setter.SetterDI;
import com.debug.ioc.instance.HelloServiceImpl;
import com.debug.ioc.instance.InstanceFactoryService;
import com.debug.ioc.instance.StaticFactoryService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTests {
	@Test
	public void testBeanGet(){
		// 实例化和初始化
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:bean.xml");
		HelloServiceImpl helloService = context.getBean("helloService", HelloServiceImpl.class);
		helloService.sayHello();

		HelloServiceImpl helloAlias = context.getBean("myAlias", HelloServiceImpl.class);
		helloAlias.sayHello();
	}

	@Test
	public void testStaticFactoryService(){
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:bean.xml");
		StaticFactoryService staticFactoryService = context.getBean("staticFactoryService", StaticFactoryService.class);
		staticFactoryService.sayHello();
	}

	@Test
	public void testInstanceFactoryService(){
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:bean.xml");
		InstanceFactoryService instanceFactoryService = context.getBean("instanceFactoryService", InstanceFactoryService.class);
		System.out.println(instanceFactoryService);

		Object accountService = context.getBean("accountService");
		Object clientService = context.getBean("clientService");
		System.out.println(accountService);
		System.out.println(clientService);
	}

	@Test
	public void testConstrustDI(){
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:bean.xml");
		ConstructorDI construst = context.getBean("constructorDI", ConstructorDI.class);
		System.out.println(construst);
	}

	@Test
	public void testSetterDI(){
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:bean.xml");
		SetterDI setterDI = context.getBean("setterDI", SetterDI.class);
		setterDI.sayHello();
	}
}

