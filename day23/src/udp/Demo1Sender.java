package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
            在Java中网络通讯称作为Socket通讯，
            
     udp通讯协议的特点
      1.将数据封装为数据包，面向无连接
      2.每个数据包大小限制在64k中
      3.因为无连接，所以不可靠
      4.因为不需要建立连接，所以速度快
      5.udp通讯部分服务端和客户端，只分发送端和接收端
      
      udp协议下的Socket
      
         DatagramSocket(udp插座服务)
         DatagramPacket(数据包类)
             DatagramPacket(buf,length,address,port)
             buf:发送的数据内容
             length 发送数据内容大小
             address 发送的目的IP地址对象
             port 端口号
             
    发送端的使用步骤
       1.建立udp的服务
       2.准备数据，将数据封装到数据包中发送，发送端的数据包要带上IP地址和端口号
       3.调用udp的服务，发送数据
       4.关闭资源
  
 * */

public class Demo1Sender {
	public static void main(String[] args) throws Exception {
		DatagramSocket datagramSocket = new DatagramSocket();
		String data = "这是一个Udp的例子";
		DatagramPacket packet = new DatagramPacket(data.getBytes(),data.getBytes().length,InetAddress.getLocalHost(),9090);
		datagramSocket.send(packet);
		datagramSocket.close();
	}

}
