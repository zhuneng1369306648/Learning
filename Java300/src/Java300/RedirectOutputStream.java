package Java300;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class RedirectOutputStream {
	public static void main(String[] args) {
		try {
			PrintStream out = System.out;
			PrintStream ps = new PrintStream("./log.txt");
			System.setOut(ps);
			int age = 18;
			System.out.println("��������ɹ����壬��ʼֵΪ18");
			String sex = "Ů";
			System.out.println("�Ա��������ɹ�����ʼֵΪŮ");
			String info = "���Ǹ�"+ sex+"����,Ӧ����"+age+"����";
			System.out.println("���Ϊ"+info);
			System.setOut(out);
			System.out.println("����������ϣ��鿴�����ļ�");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
