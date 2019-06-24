package day14;

public class Demo7 extends Thread{
	public Demo7(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=1;i<100;i++) {
			System.out.println("守护线程");
			if(i==100) {
				System.out.println("准备完毕，准备安装");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Demo7 d = new Demo7("后台线程");
		d.setDaemon(true);
		d.start();
		for(int i=1;i<=100;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}
