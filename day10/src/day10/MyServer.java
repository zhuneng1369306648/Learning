package day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*对于一个功能齐全的Socket，都要包含以下基本结构，其工作过程包含以下四个基本的步骤：

（1） 创建Socket；

（2） 打开连接到Socket的输入/出流；

（3） 按照一定的协议对Socket进行读/写操作；

（4） 关闭Socket.（在实际应用中，并未使用到显示的close，虽然很多文章都推荐如此，不过在我的程序中，
可能因为程序本身比较简单，要求不高，所以并未造成什么影响。）
*/
public class MyServer {
	public static void main(String[] args) throws IOException{
		ServerSocket server = new ServerSocket(5678);
		Socket client = server.accept();
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		PrintWriter out = new PrintWriter(client.getOutputStream());
		while(true) {
			String str = in.readLine();
			System.out.println(str);
			out.println("has receive...");
			out.flush();
			if(str.equals("end")) {
				break;
			}
		}
		client.close();
	}

}
