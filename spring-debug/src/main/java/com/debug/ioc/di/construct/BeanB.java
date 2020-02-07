package com.debug.ioc.di.construct;

/**
 * 测试循环引用 -- 构造器循环引用
 */
public class BeanB {
	private BeanA beanA;

	public BeanB(BeanA beanA) {
		this.beanA = beanA;
	}
}
