package day11;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo6 {
	public static void main(String[] args) {
		FileReader fileReader = null;
		try {
		//�ҵ�Ŀ���ļ�
		File file = new File("f:\\a.txt");
		//�����������ļ�������ͨ����
		fileReader = new FileReader(file);
		char[] buf = new char[1024];
		int length = 0;
		 length = fileReader.read(buf);
		 System.out.println(new String(buf,0,length));
		 }
		catch(IOException e){
			System.out.println("����־Ըʧ��");
		}finally {
			try {
		      fileReader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
