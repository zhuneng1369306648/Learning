package 局部变量的安全使用;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SafeTask implements Runnable{
	private static ThreadLocal<Date> startDate = new
			ThreadLocal<Date>() {
		protected Date initialValue() {
			return new Date();
		}//声明一个ThreadLocal对象，这个对象是在initialValue方法中隐似实现的，这个方法将返回当前日期
	};

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.printf("Starting Thread: %s : %s\n", Thread.currentThread().getId(),startDate.get());
		try {
			TimeUnit.SECONDS.sleep((int)Math.rint(Math.random()*10));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Thread Finished: %s: %s\n", Thread.currentThread().getId(),startDate.get());
		
	}
	

}
