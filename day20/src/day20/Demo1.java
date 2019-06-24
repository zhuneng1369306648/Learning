package day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
  ͨ��File������Զ�ȡ�ļ��е��������ݣ�
  IO����input output��
  IO��������⣺����豸���豸֮������ݴ�������
  
  
  
  IO������
     ���������򻮷�
        ������
        �����
   ���մ���ĵ�λ����
     �ֽ������ֽ�����ȡ�ľ����ļ��ж��������ݣ���ȡ�����������ݲ����κδ���
    �ַ������ַ���Ҳ�Ƕ�ȡ�ļ��еĶ��������ݣ���������Щ����������ת��Ϊ����ʶ����ַ�
    �ַ���= �ֽ��� + ���� 
 
 �ֽ���
    �����ֽ���
    --------InputStream ���������ֽ����Ļ���
     -------------FileINputStream ��ȡ�ļ����ݵ������ֽ���
    
 
 * */
public class Demo1 {
	public static void main(String[] args) throws IOException {
		readTest3();
		
	}
	
	
	public static void readTest3() throws IOException {
		File file = new File("F:\\a.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] buf = new byte[1024];
		int length = fileInputStream.read(buf);
		System.out.println("length"+length);
		String content = new String(buf,0,length);
		System.out.println("����"+content);
		fileInputStream.close();
	}
	
	public static void readTest2() throws IOException {
		long startTime = System.currentTimeMillis();
		File file = new File("F:\\a.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		int content = 0;
		while((content = fileInputStream.read())!=-1) {
			System.out.println((char)content);
		}
		fileInputStream.close();
		long endTime = System.currentTimeMillis();
		System.out.println("��ȡ����ʱ����"+(endTime-startTime));
	}
	
	
	
	public static void readTest1() throws IOException{
		File file = new File("F:\\a.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		int content = fileInputStream.read();
		System.out.println("������������"+(char)content);
		fileInputStream.close();
		
	}

}
