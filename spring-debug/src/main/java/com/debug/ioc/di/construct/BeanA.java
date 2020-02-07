package com.debug.ioc.di.construct;
/**
 * 测试循环引用 -- 构造器循环引用
 */
public class BeanA {
	private BeanB beanB;

	public BeanA(BeanB beanB) {
		this.beanB = beanB;
	}
}
