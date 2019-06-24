package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Demo1Receive {
	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket(9090);
		byte[] buf = new byte[1024];
		DatagramPacket datagramPacket = new DatagramPacket(buf,buf.length);
		socket.receive(datagramPacket);
		System.out.println("及手段接收到的信息"+new String(buf,0,datagramPacket.getLength()));
		socket.close();
	}

}
