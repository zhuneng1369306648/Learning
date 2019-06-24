 package day1300;

public class Demo3 extends Thread{
	
	
	public Demo3(String name) {
		super(name);
	}
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(this.getName()+i);
		}
	}
	public static void main(String[] args) {
		Demo3 d = new Demo3("gouwa");
		d.setName("wawo");
		d.start();
		System.out.println("线程的名字"+d.getName());
		Demo3 d2 = new Demo3("heihie");
		System.out.println("线程的名字"+d2.getName());
	}

}
