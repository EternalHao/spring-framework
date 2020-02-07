package com.debug.aop.design;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // cglib代理
@ComponentScan("com.debug.aop")
public class AppConfig {
	@Bean
	public OrderDao orderDao(){
		return new OrderDao();
	}
}

