package day14;
/*
 * 线程的停止
 * 1.停止一个线程，一般通过一个变量去控制
 * 2.如果需要停止一个处于等待下的线程，需要通过notify方法或者interrupt方法*/


public class Demo6 extends Thread{
	boolean flag = true;
	public Demo6(String name) {
		super(name);
	}
	@Override
	public void run() {
		int i=0;
		while(flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("接受到异常了");
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
			i++;
		}
	}
	public static void main(String[] args) {
		Demo6 d = new Demo6("你好");
		d.setPriority(10);
		d.start();
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			if(i==80) {
				d.flag = false;
				d.interrupt();
				synchronized (d) {
				  d.notify();	
				}
			}
		}
	}

}
