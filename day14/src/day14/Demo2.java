package day14;
/*
 * Java��ͬ�����ƽ�����̵߳İ�ȫ���⣬ͬʱӦ������������
 * ��������ĸ���ԭ��
 *    1.�������������������ϵ��߳�
 *    2.�������������������ϵĹ�����Դ
 *    */


class DeadLock extends Thread{
	public DeadLock(String name) {
		super(name);
	}
	@Override
	public void run() {
		if("����".equals(Thread.currentThread().getName())) {
			synchronized ("ң����") {
				System.out.println("�����õ���ң������׼��ȥ�õ��");
				synchronized ("���") {
					System.out.println("�����õ��˵�غ�ң������������");
					
				}
			}
		}else if ("����".equals(Thread.currentThread().getName())){
			synchronized ("ң����") {
				System.out.println("�����õ��˵�أ�׼��ȥ��ң����");
				synchronized ("���") {
					System.out.println("�����õ���");
					
					
				}
			}
		}
	}
}
public class Demo2 {
	public static void main(String[] args) {
		DeadLock thread1 = new DeadLock("����");
		DeadLock thread2 = new DeadLock("����");
		//�����߳�
		thread1.start();
		thread2.start();
	}

}
