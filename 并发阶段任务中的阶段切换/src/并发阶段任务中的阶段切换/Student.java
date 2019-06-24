package 并发阶段任务中的阶段切换;

import java.util.concurrent.Phaser;

public class Student implements Runnable{
	private Phaser phaser;
	public Student(Phaser ohaser) {
		this.phaser=phaser;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
	}

}
