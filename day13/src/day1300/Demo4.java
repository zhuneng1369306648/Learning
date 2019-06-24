package day1300;


class SaleTicket extends Thread{
	
	static int num = 50;
	static Object o = new Object();
	public SaleTicket(String name) {
		super(name);
	}
	@Override
	public void run() {
		while(true) {
			synchronized(o) {
				if(num> 0) {
					System.out.println(Thread.currentThread().getName()+"�ѳ��˵�"+num+"��Ʊ");
					try {
						Thread.sleep(100);
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
					num--;
				}else {
					System.out.println("�����ˡ�����");
					break;
				}
			}
		}
		
	}
}

public class Demo4 {
	public static void main(String[] args) {
		SaleTicket thread1 = new SaleTicket("����1");
		SaleTicket thread2 = new SaleTicket("����2");
		SaleTicket thread3 = new SaleTicket("����3");
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
