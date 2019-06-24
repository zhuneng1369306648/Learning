package 等待线程的终止;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		DataSourceLoader dsLoader = new DataSourceLoader();
		Thread thread1 = new Thread(dsLoader,"DataSourceThread");
		NetworkConnectionsLoader ncLoader = new NetworkConnectionsLoader();
		Thread thread2 = new Thread(ncLoader,"NetworkConnectionLoader");
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Main: configuration has been loaded:%s\n", new Date());
	}

}
