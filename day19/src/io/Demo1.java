package io;

import java.io.File;

/*
 * IO������Ҫ���ڽ���豸���豸֮������ݴ������⡣���磺Ӳ��---���ڴ�
   ���ݱ��浽Ӳ���ϣ������ݾͿ��������Ա��棬�������ļ�����ʽ���ڡ�
   File�������ļ�����һ���ļ���
   
   
   Ŀ¼�ָ�����
   Windows��ȥ��Ŀ¼�ָ�����\����Linux����Ŀ¼�ָ�����/��
   
   ע�⣺��Windows��\��/������ʹ����ΪĿ¼�ָ������������д/ֻ��Ҫдһ����
        
        
        
 * */

public class Demo1 {
	public static void main(String[] args) {
		File file = new File("F:\\a.txt");  //Linux
		
		File ParentFile = new File("F:\\");
		File file1 = new File(ParentFile,"a.txt");
		System.out.println("���ڲ���"+file.exists());//�жϴ��ڲ�����
		System.out.println(File.separator);
	}

}
