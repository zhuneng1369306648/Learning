package �ֲ������İ�ȫʹ��;

import java.util.concurrent.TimeUnit;

public class Core {
	public static void main(String[] args)
	{
		SafeTask task=new SafeTask();
		for(int i=0;i<10;i++) {
			Thread thread=new Thread(task);
			thread.start();
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
