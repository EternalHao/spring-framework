package com.debug.ioc.di.construct;

/**
 * 构造器注入
 *
 * 构造器注入beanA 然后实例化ConstructorDI
 */
public class ConstructorDI {
	private BeanA beanA;

	public ConstructorDI(BeanA beanA) {
		this.beanA = beanA;
	}
}
