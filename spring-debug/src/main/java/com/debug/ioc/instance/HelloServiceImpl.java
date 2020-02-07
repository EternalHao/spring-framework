package com.debug.ioc.instance;

interface HelloServcie{
	void sayHello();
}

public class HelloServiceImpl implements HelloServcie {
	public HelloServiceImpl() {
		System.out.println("我被初始化了。。。");
	}

	@Override
	public void sayHello() {
		System.out.println("bean hello");
	}
}

