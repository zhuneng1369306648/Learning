package �߳����ȼ�;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Thread.State;

public class Main {
	public static void main(String[] args) throws IOException
	{
		Thread threads[] = new Thread[10];
		Thread.State status[]=new Thread.State[10];
		for(int i=0;i<=10;i++) {
			threads[i]=new Thread(new Calculator(i));
			if(i%2==0) {
				threads[i].setPriority(Thread.MAX_PRIORITY);
			}else
			{
				threads[i].setName("Thread"+i);
			}
			try (FileWriter file = new FileWriter("E:\\log.txt");
					PrintWriter pw = new PrintWriter(file);){
				for (i=0;i<10;i++) {
					pw.println("Main:Status of Thread "+i+":" + 
				threads[i].getState());
					status[i]=threads[i].getState();
				}
				for(i=0;i<10;i++){
					threads[i].start();
				}
				
				boolean finish=false;
				while(!finish){
					for(i=0;i<10;i++) {
						if(threads[i].getState()!=status[i]) {
							writeThreadInfo(pw,threads[i],status[i]);
							status[i]=threads[i].getState();
						}
					}
					finish=true;
					for(i=0;i<10;i++) {
						finish=finish &&(threads[i].getState()==State.TERMINATED);
					}
				}
			}
		}
		
	}

	private static void writeThreadInfo(PrintWriter pw, Thread thread, State state) {
		// TODO Auto-generated method stub
		pw.printf("Main :Id %d- %s\n",thread.getId(),thread.getName());
		pw.printf("Main : priority: %d\n", thread.getPriority());
		pw.printf("Main : old state :%s\n", state);
		pw.printf("Main : new State: %s\n", thread.getState());
	}

}
