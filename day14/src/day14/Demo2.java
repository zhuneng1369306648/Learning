package day14;
/*
 * Java中同步机制解决了线程的安全问题，同时应发了死锁现象
 * 死锁现象的根本原因
 *    1.存在两个或者两个以上的线程
 *    2.存在两个或者两个以上的共享资源
 *    */


class DeadLock extends Thread{
	public DeadLock(String name) {
		super(name);
	}
	@Override
	public void run() {
		if("张三".equals(Thread.currentThread().getName())) {
			synchronized ("遥控器") {
				System.out.println("张三拿到了遥控器，准备去拿电池");
				synchronized ("电池") {
					System.out.println("张三拿到了电池和遥控器，美滋滋");
					
				}
			}
		}else if ("狗娃".equals(Thread.currentThread().getName())){
			synchronized ("遥控器") {
				System.out.println("狗娃拿到了电池，准备去拿遥控器");
				synchronized ("电池") {
					System.out.println("狗娃拿到了");
					
					
				}
			}
		}
	}
}
public class Demo2 {
	public static void main(String[] args) {
		DeadLock thread1 = new DeadLock("张三");
		DeadLock thread2 = new DeadLock("狗娃");
		//开启线程
		thread1.start();
		thread2.start();
	}

}
