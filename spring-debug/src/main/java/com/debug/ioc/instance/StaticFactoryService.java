package com.debug.ioc.instance;

/**
 * 用静态工厂方法实例化
 */
public class StaticFactoryService {
	private static StaticFactoryService factoryService = new StaticFactoryService();
	private StaticFactoryService() {
		System.out.println(" StaticFactoryService 初始化...");
	}

	public static StaticFactoryService createInstance() {
		return factoryService;
	}

	public void sayHello(){
		System.out.println("StaticFactoryService hello");
	}
}
