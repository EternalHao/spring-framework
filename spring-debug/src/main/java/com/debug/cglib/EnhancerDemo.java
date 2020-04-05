//package com.debug.cglib;
//
//import net.sf.cglib.proxy.Enhancer;
//
//import net.sf.cglib.proxy.MethodInterceptor;
//
//import net.sf.cglib.proxy.MethodProxy;
//import org.aopalliance.intercept.MethodInvocation;
//
//import java.lang.reflect.Method;
//
///**
// * @author sky
// * @date 2020/4/5 - 8:48 上午
// */
//public class EnhancerDemo {
//	public static void main(String[] args) {
//		Enhancer enhancer = new Enhancer();
//		enhancer.setSuperclass(EnhancerDemo.class);
//		enhancer.setCallback(new MethodInterceptorImpl());
//		EnhancerDemo demo = (EnhancerDemo) enhancer.create();
//		demo.test();
//		System.out.println(demo);
//	}
//
//	public void test() {
//		System.out.println("EnhancerDemo test()");
//	}
//
//	private static class MethodInterceptorImpl implements MethodInterceptor {
//		@Override
//		public Object intercept(Object obj, Method method, Object[] args,
//		                        MethodProxy proxy) throws Throwable {
//			System.err.println("Before invoke " + method);
//			Object result = proxy.invokeSuper(obj, args);
//			System.err.println("After invoke" + method);
//			return result;
//		}zx
//
//		@Override
//		public Object invoke(MethodInvocation invocation) throws Throwable {
//			return null;
//		}
//	}
//}
