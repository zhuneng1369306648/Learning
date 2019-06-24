package 在执行器中控制任务的完成;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ResultTask extends FutureTask<String>{
	private String name;

	public ResultTask(Callable<String> callable) {
		super(callable);
		// TODO Auto-generated constructor stub
		this.name=((ExecutableTask)callable).getName();
	}
	protected void done() {
		if(isCancelled()) {
			System.out.printf("%s: Has been canceled\n", name);
		} else {
			System.out.printf("%s: finished\n", name);
		}
	}

}
