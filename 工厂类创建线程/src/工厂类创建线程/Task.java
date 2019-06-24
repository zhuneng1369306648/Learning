package 工厂类创建线程;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			TimeUnit.SECONDS.sleep(1);//一个TimeUnit主要用来通知时间的方法如何给定时参数的解释应。
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	} 
//	在类的声明中，通过关键字extends来创建一个类的子类。一个类通过关键字implements声明自己使用一个或者多个接口。
//	extends 是继承某个类, 继承之后可以使用父类的方法, 也可以重写父类的方法; 
//	implements 是实现多个接口, 接口的方法一般为空的, 必须重写才能使用
//	2.extends是继承父类，只要那个类不是声明为final或者那个类定义为abstract的就能继承，JAVA中不支持多重继承，
//	但是可以用接口 来实现，
//	这样就要用到implements，
//	继承只能继承一个类，但implements可以实现多个接口，用逗号分开就行了

}
