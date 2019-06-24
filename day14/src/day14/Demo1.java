package day14;



class BankThread extends Thread{
	static int count = 5000;
	public BankThread(String name) {
		super(name);
	}
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		while(true) {
			synchronized ("��") {
				if(count > 0) {
					System.out.println(Thread.currentThread().getName()+"ȡ����1000�顣��ʣ"+(count-1000));
					count = count - 1000;
				}else {
					System.out.println("ȡ����");
					break;
				}
			}
		}
	}
}

public class Demo1 {
	public static void main(String[] args) {
		BankThread thread1 = new BankThread("�Ϲ�");
		BankThread thread2 = new BankThread("����");
		thread1.start();
		thread2.start();
	}

}
