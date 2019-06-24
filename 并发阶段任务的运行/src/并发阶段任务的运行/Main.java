package 并发阶段任务的运行;

import java.util.concurrent.Phaser;

public class Main {
	public static void main(String[] args) {
		Phaser phaser=new Phaser(3);
		FileSearch system=
				new FileSearch("C:\\Windows","log",phaser);
		FileSearch apps=
				new FileSearch("C:\\Program Files","log",phaser);
		FileSearch documents=
				new FileSearch("C:\\Documents And Settings","log",phaser);
		Thread systemThread=new Thread(system,"System");
		systemThread.start();
		Thread documentsThread=new Thread(documents,"Documents");
		documentsThread.start();
		Thread appsThread=new Thread(apps,"Apps");
		appsThread.start();
		try {
			systemThread.join();
			appsThread.join();
			documentsThread.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Terminated:"+phaser.isTerminated());
	}//一个phaser对象有两种状态，活跃态和终止态，
     //当参与同步的线程时，Phaser就是活跃的，并且在每个阶段结束的时候进行同步
	//终止态，当所有参与同步的线程都取消注册的时候，phaser就出去终止状态，在这种情况下，phaser没有任何参与者，
	//phaser重大特征就是不必对他的方法进行异常处理，被phaser置于休眠的线程不会相应中断事件。也不会抛出异常
}
