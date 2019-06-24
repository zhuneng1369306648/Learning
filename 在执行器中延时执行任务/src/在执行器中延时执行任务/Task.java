package 在执行器中延时执行任务;

import java.util.Date;
import java.util.concurrent.Callable;

public class Task implements Callable<String>{
	private String name;
	public Task(String name) {
		this.name=name;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.printf("%s: Starting at : %s\n",name,new Date());
		return "Hello,World";
	}

}
