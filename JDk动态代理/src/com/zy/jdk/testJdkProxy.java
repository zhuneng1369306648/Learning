package com.zy.jdk;

public class testJdkProxy {
	public static void main(String[] args) {
		testJdkProxy();
		//tesCGLIBProxy();
	}

	public static void testJdkProxy() {
		JdkProxyExample jdk = new JdkProxyExample();
		// �󶨹�ϵ����Ϊ���ڽӿ�HelloWorld�£����������������HelloWorld proxy
		HelloWorld proxy = (HelloWorld) jdk.bind(new HelloWorldImp1());
		// ע�⣬��ʱHelloWorld�����Ѿ���һ���������������������߼�����invoke��
		proxy.sayHelloWorld();
	}
	
	/*public static void tesCGLIBProxy() {
	    CglibProxyExample cpe = new CglibProxyExample();
	    ReflectServiceImpl obj = (ReflectServiceImpl)cpe.getProxy(ReflectServiceImpl.class);
	    obj.sayHello("����");
	}*/
}
