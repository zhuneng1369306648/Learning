package tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//tcp�ķ����
/*
	java.net.BindException:   �˿ڱ�ռ�á�

ServerSocket��ʹ�� ����
	1. ����tcp����� �ķ���
	2. ���ܿͻ��˵����Ӳ���һ��Socket.
	3. ��ȡ��Ӧ���������ȡ����д�����ݡ�
	4. �ر���Դ��


ΪʲôServerSocket�����һ��getInputStream��getOutputStream �أ� 

*/
//�����
public class Demo1Server {

	public static void main(String[] args) throws Exception {
		//����Tcp�ķ����,���Ҽ���һ���˿ڡ�
		ServerSocket serverSocket = new ServerSocket(9090);
		//���ܿͻ��˵�����
		Socket socket  =  serverSocket.accept(); //accept()  ���ܿͻ��˵����� �÷���Ҳ��һ�������͵ķ�����û�пͻ�����������ʱ����һֱ�ȴ���ȥ��
		//��ȡ���������󣬶�ȡ�ͻ��˷��͵����ݡ�
		InputStream inputStream = socket.getInputStream();
		byte[] buf = new byte[1024];
		int length = 0;
		length = inputStream.read(buf);
		System.out.println("����˽��գ�"+ new String(buf,0,length));
		
		//��ȡsocket�����������ͻ��˷�������
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("�ͻ�����ð���".getBytes());
		
		
		//�ر���Դ
		serverSocket.close();
		
	}
	
}
