package 线程的休眠和恢复;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FileClock implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0;i<10;i++) {
			System.out.printf("%s\n", new Date());
			try {
				TimeUnit.SECONDS.sleep(1);
			}catch (InterruptedException e) {
				System.out.printf("The FileClock has been interrupted");
			}//如果休眠中线程被中断，该方法就会立即抛出interruptrdException异常，而不需要等待线程休眠时间结束
		}
		
	}

}
