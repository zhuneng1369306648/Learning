package 线程组不可控异常;

import java.util.Random;

public class Tsak implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int result;
		Random random=new Random(Thread.currentThread().getId());
		while(true) {
			result=1000/((int)(random.nextDouble()*1000));//返回一个双精度的随机数流，可以指定边界大小
			System.out.printf("%s: %d\n", Thread.currentThread().getId(),result);
			if(Thread.currentThread().isInterrupted()) {
				System.out.printf("%d, Intertupted\n", Thread.currentThread().getId());
				return;
			}
		}
		
	}

}
