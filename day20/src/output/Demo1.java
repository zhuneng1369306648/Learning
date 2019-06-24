package output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
  ����ֽ���
  -----------OutputStream ����������ֽ����ĸ��࣬������
                ------FileOutputStream ���ļ�������ݵ�����ֽ���
   FileOutPutStream
   1.�ҵ�Ŀ���ļ�
   2.�������ݵ����ͨ�������û��Ŀ���ļ���������һ������Ŀ���ļ���
   3.������ת��Ϊ�ֽ�����д��
   4.�ر���Դ
   
   FileOutputStream��Ҫע���ϸ��
   1.ʹ��FileOutputStream��ʱ�����Ŀ���ļ������ڣ���ô���Զ�����Ŀ���ļ�����
   2.���Ŀ���ļ��Ѿ����ڣ���ô�������Ŀ���ļ��е����ݣ�Ȼ����д������
   3.���Ŀ���ļ��Ѿ����ڣ���Ҫ��ԭ�����ݻ�����������ݵ�ʱ��Ӧ��ʹ��
            new FileOutputStream(file,true)���캯�����ڶ�����Ϊtrue��
   4.ʹ��write����д���ݵ�ʱ����Ȼ���յ����и�int���͵����ݣ���������а����ֻ��һ���ֽڵ�
      ���ݣ�ֻ�ǰѵͰ�λ�Ķ���������д����������ʮ��λ������
   
   
   
   
 * */

public class Demo1 {
	public static void main(String[] args) throws IOException {
		writeTest3();
		
	}
	
	
	
	public static void writeTest3() throws IOException {
		File file = new File("F:\\b.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		String data = "abc";
		byte[] buf = data.getBytes();
		fileOutputStream.write(buf, 0, 3);
		fileOutputStream.close();
	}
	public static void writeTest2() throws IOException {
		File file = new File("F:\\b.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file,true);
		String data = "\r\nhello world";
		fileOutputStream.write(data.getBytes());
		fileOutputStream.close();
	}
	
	
	
	
	
	public static void writeTest1() throws IOException {
		File file = new File("F:\\b.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		fileOutputStream.write('h');
		fileOutputStream.write('e');
		fileOutputStream.write('l');
		fileOutputStream.write('l');
		fileOutputStream.write('o');
		//�ر���Դ
		fileOutputStream.close();
		
	}

}
