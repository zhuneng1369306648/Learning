package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/*
 Properties�������ļ��ࣩ: ��Ҫ�������������ļ����ȡ�����ļ�����Ϣ��


PropertiesҪע���ϸ�ڣ�
	1. ��������ļ�����Ϣһ��ʹ�������ģ���ô��ʹ��store�������������ļ���ʱ��ֻ��ʹ���ַ�����������ʹ���ֽ������������ļ��Ļ���
	Ĭ��ʹ�õ���iso8859-1�����б���洢����ʱ���������롣
	2. ���Properties�е����ݷ����˱仯��һ��Ҫ����ʹ��Properties���������ļ������������ļ���Ϣ���ᷢ���仯��
	
	
	
	
 */

public class Demo4 {
	
	public static void main(String[] args) throws IOException {
		creatProperties();
		
//		readProperties();
	}
	
	//��ȡ�����ļ��������Ϣ 
	public static void readProperties() throws IOException{
		//����Properties����
		Properties properties = new Properties();
		//���������ļ���Ϣ��Properties��
		properties.load(new FileReader("F:\\persons.properties"));
		//����
		Set<Entry<Object, Object>> entrys = properties.entrySet();
		for(Entry<Object, Object> entry  :entrys){
			System.out.println("����"+ entry.getKey() +" ֵ��"+ entry.getValue());
		}
		//�޸Ĺ��޵�����
		//���޸ĺ��Properties������һ�������ļ�
		properties.setProperty("����", "007");
		properties.store(new FileWriter("F:\\persons.properties"), "hehe");
		
		
	}
	
	
	
	//���������ļ��ļ�����Ϣ��
	public static void creatProperties() throws IOException{
		//����Properties
		Properties properties = new Properties();
		properties.setProperty("����", "123");
		properties.setProperty("��ʣ","234");
		properties.setProperty("����","345");
		// ����Properties
		/*Set<Entry<Object, Object>> entrys = properties.entrySet();
		for(Entry<Object, Object> entry  :entrys){
			System.out.println("����"+ entry.getKey() +" ֵ��"+ entry.getValue());
		}*/
		
		//ʹ��Properties���������ļ���
		//properties.store(new FileOutputStream("F:\\persons.properties"), "haha"); //��һ��������һ����������󣬵ڶ�������ʹ��һ���ַ���������������ļ�����Ϣ��
		properties.store(new FileWriter("F:\\persons.properties"), "hehe");
	}

}
