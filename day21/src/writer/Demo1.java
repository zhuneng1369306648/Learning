package writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*FileWriter ��ʹ�ò���
    1.�ҵ�Ŀ���ļ�
    2.�����������ͨ��
    3.д������
    4.�ر���Դ
  FileWriterҪע�������
  1.ʹ��FileWriterд���ݵ�ʱ��FileWriter�ڲ�ά����һ��1024�ַ�����ģ�д���ݵ�ʱ�����д�뵽��
     �ڲ�ά�����ַ������У������Ҫ����������д��Ӳ���ϣ���Ҫ����flush������close����������������
     �ڲ����ַ����顣
  2.ʹ��FileWriter��ʱ�����Ŀ���ļ������ڣ���ô���Զ�����Ŀ���ļ�
  3.ʹ��FileWriter��ʱ�����Ŀ���ļ��Ѿ������ˣ���ôĬ�������������ļ��е����ݣ�Ȼ����д������ ��
       �����Ҫ��ԭ���Ļ�����׷�����ݣ�
	��Ҫʹ�á�new FileWriter(File , boolean)���Ĺ��췽�����ڶ�����Ϊtrue��
 
 
 
 
 * */

public class Demo1 {
	public static void main(String[] args) throws IOException {
		writeTest1();
	}
	public static void writeTest1() throws IOException {
	File file = new File("F:\\a.txt");
	FileWriter fileWriter = new FileWriter(file,true);
	String data = "��ð�";
	fileWriter.write(data);
	fileWriter.close();
	}

}
