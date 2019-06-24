package day14;
/*
 * 线程通讯，一个线程完成了自己的任务时，要通知另外一个线程去完成另外一个任务
 * 
 * 生产者与消费者
 *  
 *  wait():   等待，如果线程执行了wait方法，南无该线程就会进入等待的状态，等待状态下的线程
 *  必须要被唤醒
 *  notify()   唤醒线程池等待线程其中的一个（随机的，不过大部分是FIFO）
 *  notifyAll()  唤醒线程池所有的等待线程
 *  
 *  wait 与notify方法注意事项
 *     1.外套方法与notify方法属于object对象的
 *     2.外套方法与notify方法必须在同步代码块或者是同步函数中才能使用
 *     3.外套方法与notify方法必须要由锁对象调用*/


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
						p.name = "苹果";
						p.price = 6.5;
					}else {
						p.name="香蕉";
						p.price=2.0;
					}
					System.out.println("生产者生产出了："+p.name+"j价格是"+p.price);
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
				if(p.flag==true){  //产品已经生产完毕
					System.out.println("消费者消费了"+p.name+" 价格："+ p.price);
					p.flag = false; 
					p.notifyAll(); // 唤醒生产者去生产
				}else{
					//产品还没有生产,应该 等待生产者先生产。
					try {
						p.wait(); //消费者也等待了...
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
		Product p = new Product();  //产品
		//创建生产对象
		Producer producer = new Producer(p);
		//创建消费者
		Customer customer = new Customer(p);
		//调用start方法开启线程
		producer.start();
		customer.start();
	}

}
