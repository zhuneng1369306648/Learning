package 在执行器中控制任务的完成;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class ExecutableTask implements Callable<String>{
	private String name;
	public String getName() {
		return name;
	}
	public ExecutableTask(String name) {
		this.name=name;
	}

	@Override
	public String call() throws Exception {
		try {
			long duration=(long)(Math.random()*10);
			System.out.printf("%s: Wairing %d seconds for results.\n", this.name,duration);
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
		}
		// TODO Auto-generated method stub
		return "Hello World.I'm" +name;
	}

}
