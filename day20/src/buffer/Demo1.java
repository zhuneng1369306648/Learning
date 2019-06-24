package buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 
�����ֽ�����ϵ
---- InputStream  �����ֽ����Ļ��࣬����
--------------FileinputStream  ��ȡ�ļ����ݵ������ֽ���
--------------BufferedinputStream ���������ֽ���     ��ҪΪ������ļ����ݵ�Ч��
                                     �ڲ�ά����һ��8kb���ֽ�����
                                     
      ���ǻ��������߱���д�ļ�������
      
      ʹ��BufferedinputStream�Ĳ���
        1.�ҵ�Ŀ���ļ�
        2.�������ݵ�����ͨ��
        3.�������������ֽ���
        4.�ر���Դ
        
 * */

public class Demo1 {
	public static void main(String[] args) throws IOException {
		readTest();
	}
	
	public static void readTest2() throws IOException {
		File file = new File("F:\\a.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		bufferedInputStream.read();
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
		fileOutputStream.write(null);
		int content = 0;
		while((content = fileInputStream.read()) !=-1) {
			System.out.println((char)content);
		}
		bufferedInputStream.close();
	}
	public static void readTest() throws IOException {
		File file = new File("F:\\a.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] buf = new byte[1024*8];
		int length = 0;
		while((length = fileInputStream.read(buf))!= -1) {
			System.out.println(new String(buf,0,length));
		}
		fileInputStream.close();
	}

}
/*package cn.itcast.buffered;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
*/
/*
����ֽ���
--------| OutputStream  ��������ֽ����Ļ���  ������
------------| FileOutputStream ���ļ� ������� ������ֽ���
------------| Bufferedoutputstream  ��������ֽ���    BufferedOutputStream���ֵ�Ŀ����Ϊ�����д���ݵ�Ч�ʡ� 
        						�ڲ�Ҳ��ά����һ��8kb���ֽ�������ѡ�
 
 ʹ��BufferedOutputStream�Ĳ��裺
 	1. �ҵ�Ŀ���ļ�
 	2. �������ݵ����ͨ��

 
BufferedOutputStream Ҫע���ϸ��
	1. ʹ��BufferedOutStreamд���ݵ�ʱ������write���������Ȱ�����д�����ڲ�ά�����ֽ������С�
 	2. ʹ��BufferedOutStreamд���ݵ�ʱ������write���������Ȱ�����д�����ڲ�ά�����ֽ������У������Ҫ������������д��Ӳ�����棬��Ҫ
 	����flush����������close������ �������ڲ�ά�����ֽ������Ѿ��������ݵ�ʱ��
 	

 
 
public class Demo2 {

	public static void main(String[] args) throws IOException {
		//�ҵ�Ŀ���ļ�
		File file = new File("F:\\a.txt");
		//�������ݵ����ͨ��
		FileOutputStream  fileOutputStream = new FileOutputStream(file);
		//������������ֽ�������
		BufferedOutputStream bufferedOutputStream  = new BufferedOutputStream(fileOutputStream);
		//������д��
		bufferedOutputStream.write("hello world".getBytes()); 
		//�ѻ����������ڲ�������д��Ӳ�����档
		//bufferedOutputStream.flush();
		bufferedOutputStream.close();
	}
	
}*/

