package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
            ��Java������ͨѶ����ΪSocketͨѶ��
            
     udpͨѶЭ����ص�
      1.�����ݷ�װΪ���ݰ�������������
      2.ÿ�����ݰ���С������64k��
      3.��Ϊ�����ӣ����Բ��ɿ�
      4.��Ϊ����Ҫ�������ӣ������ٶȿ�
      5.udpͨѶ���ַ���˺Ϳͻ��ˣ�ֻ�ַ��Ͷ˺ͽ��ն�
      
      udpЭ���µ�Socket
      
         DatagramSocket(udp��������)
         DatagramPacket(���ݰ���)
             DatagramPacket(buf,length,address,port)
             buf:���͵���������
             length �����������ݴ�С
             address ���͵�Ŀ��IP��ַ����
             port �˿ں�
             
    ���Ͷ˵�ʹ�ò���
       1.����udp�ķ���
       2.׼�����ݣ������ݷ�װ�����ݰ��з��ͣ����Ͷ˵����ݰ�Ҫ����IP��ַ�Ͷ˿ں�
       3.����udp�ķ��񣬷�������
       4.�ر���Դ
  
 * */

public class Demo1Sender {
	public static void main(String[] args) throws Exception {
		DatagramSocket datagramSocket = new DatagramSocket();
		String data = "����һ��Udp������";
		DatagramPacket packet = new DatagramPacket(data.getBytes(),data.getBytes().length,InetAddress.getLocalHost(),9090);
		datagramSocket.send(packet);
		datagramSocket.close();
	}

}
