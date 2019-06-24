package day14;
/*
 * �߳�ͨѶ��һ���߳�������Լ�������ʱ��Ҫ֪ͨ����һ���߳�ȥ�������һ������
 * 
 * ��������������
 *  
 *  wait():   �ȴ�������߳�ִ����wait���������޸��߳̾ͻ����ȴ���״̬���ȴ�״̬�µ��߳�
 *  ����Ҫ������
 *  notify()   �����̳߳صȴ��߳����е�һ��������ģ������󲿷���FIFO��
 *  notifyAll()  �����̳߳����еĵȴ��߳�
 *  
 *  wait ��notify����ע������
 *     1.���׷�����notify��������object�����
 *     2.���׷�����notify����������ͬ������������ͬ�������в���ʹ��
 *     3.���׷�����notify��������Ҫ�����������*/


class Product{
	String name;
	double price;
	boolean flag = false;
}
class Producer extends Thread{
	Product p;
	public Producer(Product p) {
		this.p = p;
	}
	@Override
	public void run() {
		int i=0;
		while(true) {
			synchronized (p) {
				if(p.flag ==false) {
					if(i%2==0) {
						p.name = "ƻ��";
						p.price = 6.5;
					}else {
						p.name="�㽶";
						p.price=2.0;
					}
					System.out.println("�������������ˣ�"+p.name+"j�۸���"+p.price);
					p.flag=true;
					i++;
					p.notifyAll();
				}else {
					try {
						p.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}
	}
}



class Customer extends Thread{
	Product p;
	public Customer(Product p) {
		this.p = p;
	}
	@Override
	public void run() {
		while(true){
			synchronized (p) {	
				if(p.flag==true){  //��Ʒ�Ѿ��������
					System.out.println("������������"+p.name+" �۸�"+ p.price);
					p.flag = false; 
					p.notifyAll(); // ����������ȥ����
				}else{
					//��Ʒ��û������,Ӧ�� �ȴ���������������
					try {
						p.wait(); //������Ҳ�ȴ���...
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}	
	}
}

public class Demo5 {
	public static void main(String[] args) {
		Product p = new Product();  //��Ʒ
		//������������
		Producer producer = new Producer(p);
		//����������
		Customer customer = new Customer(p);
		//����start���������߳�
		producer.start();
		customer.start();
	}

}
