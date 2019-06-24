package 使用锁实现同步;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintQueue {
	private final Lock queueLock=new ReentrantLock();
	public void printJob(Object document) {
		queueLock.lock();
		try {
			Long duration=(long)(Math.random()*10000);
			System.out.println(Thread.currentThread().getName()+ "PrintQueue: Printing a "
					+ "Job during "+(duration/1000)+"seconds");
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			queueLock.unlock();//线程离开临界区的时候，必须调用unlock来释放持有的锁，避免死锁。
		}
	}

}
//使用锁实现一个临界区，并且保证同一时间只有一个执行线程访问这个临界区必须创建一个reentrantLock对象
//在这个临界区的开始，必须通过lock（）方法获得锁的控制，当线程A访问这个方法时，如果没有其他线程对这个锁的控制
//lock方法将让线程A获取锁并且允许他执行临界区代码，否则，如果其他线程B正在执行这个锁保护的临界区代码，，
//lock方法将让线程A休眠直到B执行完临界区代码。
//trylock方法不会让线程陷入休眠，而是会立即返回一个布尔值，true表示获得了锁。