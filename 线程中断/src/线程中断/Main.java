package œﬂ≥Ã÷–∂œ;

public class Main {
	public static void main(String[] args) {
		Thread task=new PrimeGenerator();
		task.start();
		try {
			Thread.sleep(50000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		task.interrupt();
	}

}
