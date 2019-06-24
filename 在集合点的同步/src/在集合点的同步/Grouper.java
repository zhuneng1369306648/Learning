package 在集合点的同步;

public class Grouper implements Runnable{
	private Results results;
	public Grouper(Results results) {
		this.results=results;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int finalResult=0;
		System.out.printf("Grouper: processing results..\n");
		int data[]=results.getData();
		for(int number:data) {
			finalResult+=number;
		}System.out.printf("Grouper: Total result : %d.\n", finalResult);
		
	}

}
