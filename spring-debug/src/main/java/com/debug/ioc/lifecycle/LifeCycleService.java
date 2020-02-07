package com.debug.ioc.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


/**
 * bean生命周期分析
 *
 *
 * 通常，JSR-250
 * @PostConstruct和@PreDestroy注释被认为是在现代Spring应用程序中接收生命周期回调的最佳实践。
 * 使用这些注释意味着您的bean没有耦合到特定于Spring的接口。
 * 有关详细信息，请参见使用@PostConstruct和@PreDestroy
 *
 * 初始化
 * 1. 在@PostConstruct和@PreDestroy 注释。您可以结合使用这些机制来控制给定的bean。
 * 2. 在InitializingBean和 DisposableBean回调接口
 * 3. 习惯init()和destroy()方法
 *
 * 监控 各种Aware
 * 1. ApplicationContextAware
 *
 * 扩展点
 *
 */
@Component("lifeCycleService")
public class LifeCycleService implements InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware {
	public LifeCycleService() {
		System.out.println();
		System.out.println();
		System.out.println("============> LifeCycleService 初始化");
	}

	@PostConstruct
	public void postConstruct(){
		System.out.println("============> LifeCycleService 注解postConstruct");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("============> LifeCycleService afterPropertiesSet");
	}

	public void init(){
		System.out.println("============> LifeCycleService init");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("============> LifeCycleService destroy");
	}

	public void cdestroy(){
		System.out.println("============> LifeCycleService init");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("LifeCycleService setApplicationContext");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("LifeCycleService setBeanName");
	}
}
