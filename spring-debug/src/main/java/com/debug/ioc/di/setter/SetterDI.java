package com.debug.ioc.di.setter;

import com.debug.ioc.di.construct.BeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

/**
 * 基于Setter的依赖注入
 */
public class SetterDI {
//	@Autowired //类型匹配
//	@Qualifier("exampleBean") //进一步的限定


    @Resource(name = "exampleBean") // 名称匹配
	private ExampleBean exampleBean;

	public void sayHello(){
		System.out.println("SetterDI 注入 "+ exampleBean);
	}
}
