package com.debug.aop.design;

import com.debug.aop.StudentService;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.stereotype.Component;

//@Component("orderDao")
public class OrderDao {
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(StudentService.class);
		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
		enhancer.setCallback(new ProxyHandler());
		StudentService studentService = (StudentService) enhancer.create();
		studentService.addStudent();
	}
}
