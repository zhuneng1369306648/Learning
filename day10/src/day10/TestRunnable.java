package day10;

public class TestRunnable extends Thread{
	private String name;
	public TestRunnable(String name) {
		this.name = name;
	}
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println(name + "运行  :" + i);
			try {
				sleep((int) Math.random()*10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static class Main{
		public static void main(String[] args) {
			TestRunnable m1 = new TestRunnable("A");
			TestRunnable m2 = new TestRunnable("B");
			m1.start();
			m2.start();
		}
	}

}
