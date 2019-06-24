package buffered;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*
  �����ַ���
  -------Reader ���������ַ����Ļ��࣬������
  -------- FileReader ��ȡ�ļ��ַ����������ַ���
  -----------BufferedReader  ���������ַ��������� �����ַ������ֵ�Ŀ����Ϊ����߶�ȡ�ļ� 
                        ��Ч�ʺ���չ��FileReader�Ĺ��ܡ�  ��ʵ�����ڲ�Ҳ��ά����һ���ַ�����
                        
                        
          ���������߱���д�ļ�������
          
      BufferedReader��ʹ�ò���
         1.�ҵ�Ŀ���ļ�
         2.�������ݵ�����ͨ��

  
  
  
  
 * */

public class Demo1 {
	public static void main(String[] args) throws IOException {
		//readTest1();
		File file = new File("F:\\a.txt");
		FileReader fileReader = new FileReader(file);
		String line = null;
		while((line = myReadLine(fileReader))!= null) {
			System.out.println(line);
		}
	}
	
	
	
	public static String myReadLine(FileReader fileReader) throws IOException {
		StringBuilder sb = new StringBuilder();
		int content = 0;
		while((content = fileReader.read())!=-1) {
			if(content=='\r') {
				continue;
			}else if(content =='\n') {
				break;
			}
			else {
				sb.append((char)content);
			}
		}
		if(content == -1) {
			return null;
		}
		return sb.toString();
	}
	public static void readTest1() throws IOException {
		File file = new File("F:\\a.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = null;
		while((line=bufferedReader.readLine())!=null) {
			System.out.println(Arrays.toString("aaa".getBytes()));
		}
		bufferedReader.close();
		
	}

}
