package day14;
/*
 * �Զ����̵߳Ĵ�����ʽ
 * ��ʽһ
 *    1.�Զ���һ����̳�Thread��
 *    2.��дThread���Run���������Զ����̵߳��������д��run������
 *    3.����Thread��������󣬲��ҵ���start��������һ���߳�
 *    
 *    ע��
 *       ��Ҫֱ�ӵ���run����������start�߳̾ͻῪ����һ�������ͻ�ִ��run�еĴ���
 *       һ��ֱ�ӵ���run���������൱�ڵ�����һ����ͨ�ķ���
 *       
 * ��ʽ��
 *     1.�Զ���һ����ʵ��runnable�ӿ�
 *     2.ʵ��Runnable�ӿڵ�run���������Զ����̵߳���������run������
 *     3.����runnableʵ�������
 *     4.����Thread��Ķ��󣬲��Ұ�Runnableʵ����Ķ�����Ϊʵ�δ���
 *     5.����Thread�����start��������һ���߳�*/



public class Demo3 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
	public static void main(String[] args) {
		//Demo3 d = new Demo3();
		Thread thread = new Thread();
		thread.start();
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}
