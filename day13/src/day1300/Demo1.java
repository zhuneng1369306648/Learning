package day1300;
/*
 * �����̵߳ķ�ʽ
 *     ��ʽһ
 *        1.�Զ���һ����̳�Thread��
 *        2.��дThread��run����
 *        ÿ���̶߳����Լ���������룬���̵߳�����������main�����е����з���
 *          �Զ����̵߳���������д��run������
 *        3.����Thread�����෸�������ҵ���start���������߳�
 * 
 * */
public class Demo1 extends Thread{
	
	
	public void run() {
		for(int i=0;i<100;i++) {
		System.out.println("hhaha");
		}
	}
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.start();
		for(int i=0;i<100;i++) {
			System.out.println(i);
		}
	}

}
