package 资源的并发访问控制;

public class Job implements Runnable{
	private PrintQueue printQueue;
	public Job(PrintQueue printQueue) {
		this.printQueue=printQueue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.printf("%s: Going to print a job\n", Thread.currentThread().getName());
		printQueue.printJob(new Object());
		System.out.printf("%s: the document has been peinted\n", Thread.currentThread().getName());
	}

}
