package 等待多个并发事件完成;

import java.util.concurrent.CountDownLatch;

public class Videoconference implements Runnable{
	private final CountDownLatch controller;
	public Videoconference(int number) {
		controller=new CountDownLatch(number);
	}
	public void arrive(String name) {
		System.out.printf("%s has arrived", name);
		controller.countDown();
	}
		public void run() {
			// TODO Auto-generated method stub
			
		System.out.printf("VideoConference: Initialization : %d participants\n", controller.getCount());
		try {
			controller.await();
			System.out.printf("VideoConference: ALL the participants have come\n");
			System.out.printf("VideoConference:lets start.....\n");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
