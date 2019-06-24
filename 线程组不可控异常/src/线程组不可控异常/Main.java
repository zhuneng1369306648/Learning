package 线程组不可控异常;

public class Main {
	public static void main(String[] args) {
	MyThreadGroup threadGroup = new MyThreadGroup("MyThreadGroup");
	Tsak task = new Tsak();
	for(int i=0;i<2;i++) {
		Thread t=new Thread(threadGroup,task);
		t.start();
	}
	}

}
