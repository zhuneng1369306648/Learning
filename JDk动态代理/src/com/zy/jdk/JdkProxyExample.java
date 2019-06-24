package com.zy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyExample implements InvocationHandler{
	private Object target = null;
	public Object bind(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("��������߼�����");
		System.out.println("�ڵ�����ʽ����ǰ�ķ���");
		Object obj = method.invoke(target, args);
		System.out.println("�ڵ�����ʽ����֮��ķ���");
		return obj;
	}

}
