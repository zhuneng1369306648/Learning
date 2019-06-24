package day14;
/*
 * �̵߳�ֹͣ
 * 1.ֹͣһ���̣߳�һ��ͨ��һ������ȥ����
 * 2.�����Ҫֹͣһ�����ڵȴ��µ��̣߳���Ҫͨ��notify��������interrupt����*/


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
				System.out.println("���ܵ��쳣��");
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
			i++;
		}
	}
	public static void main(String[] args) {
		Demo6 d = new Demo6("���");
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
