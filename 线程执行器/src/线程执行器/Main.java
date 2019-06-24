package Ïß³ÌÖ´ĞĞÆ÷;

public class Main {
	public static void main(String[] args) {
		Server server=new Server();
		for(int i=0;i<100;i++) {
			Task task=new Task("Task"+i);
			server.execute(task);
		}
		server.endServer();
	}

}
 