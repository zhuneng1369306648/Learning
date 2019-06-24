package tcp;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 
 UDPͨѶЭ����ص㣺
	1. �����ݼ���װΪ���ݰ������������ӡ�
	2. ÿ�����ݰ���С������64K��
	3.��Ϊ�����ӣ����Բ��ɿ�
	4. ��Ϊ����Ҫ�������ӣ������ٶȿ�
	5.udp ͨѶ�ǲ��ַ������ͻ��˵ģ�ֻ�ַ��Ͷ�����նˡ�
	
TCPͨѶЭ���ص㣺
	1. tcp�ǻ���IO���������� �Ĵ��� �ģ��������ӡ�
 	2. tcp�������ݴ����ʱ����û�д�С���Ƶġ�
 	3. tcp���������ӣ�ͨ���������ֵĻ��Ʊ�֤���ݵ������ԡ� �ɿ�Э�顣
 	4. tcp���������ӵģ������ٶ�����
 	5. tcp�����ֿͻ��������� �ġ�
 	
 	���磺 ��绰�� QQ\feiQ���ļ����䡢 Ѹ������.... 
 	
tcpЭ���µ�Socket��
	Socket(�ͻ���) , tcp�Ŀͻ���һ����������Ҫ�����˽������ӡ�
	ServerSocket(�������)

tcp�Ŀͻ���ʹ�ò��裺
	1. ����tcp�Ŀͻ��˷���
	2. ��ȡ����Ӧ��������
	3.д�����ȡ����
	4. �ر���Դ��


 */

//tcp�ͻ���
public class Demo1Client {
	
	public static void main(String[] args) throws IOException{
		//����tcp�ķ���
		Socket socket  = new Socket(InetAddress.getLocalHost(),9090);
		//��ȡ��Socket�����������
		OutputStream outputStream = socket.getOutputStream();
		//������������������д�����ɡ�
		outputStream.write("��������".getBytes());
		
		//��ȡ�����������󣬶�ȡ����˻��͵����ݡ�
		InputStream inputStream = socket.getInputStream();
		byte[] buf = new byte[1024];
		int length = inputStream.read(buf);
		System.out.println("�ͻ��˽��յ������ݣ�"+ new String(buf,0,length));
		
		//�ر���Դ
		socket.close();		
	}
}
