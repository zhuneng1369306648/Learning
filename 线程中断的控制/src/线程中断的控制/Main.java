package �߳��жϵĿ���;

import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		FileSearch searcher = new FileSearch("G:\\","1");
		Thread thread = new Thread(searcher);
		thread.start();
		try {
			TimeUnit.SECONDS.sleep(10);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		thread.interrupt();
	}

}
