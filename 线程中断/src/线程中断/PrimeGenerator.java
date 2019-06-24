package �߳��ж�;

public class PrimeGenerator extends Thread{
	public void run()
	{
		long number = 1l;
		while(true) {
			if(isPrime(number)) {
				System.out.printf("Number %d is Prime", number);
			}
			if(isInterrupted()) {
				System.out.printf("The Prime Generator has been Interrupted");
				return;
			}
			number++;
		}
	}

	private boolean isPrime(long number) {
		// TODO Auto-generated method stub
		if(number <= 2) {
			return true;
		}
		for(long i=2;i<number;i++) {
			if((number%i)==0) {
				return false;
			}
		}
		return true;
	}

}
