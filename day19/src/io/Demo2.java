package io;

import java.io.File;

/*
  ����·�������ļ���Ӳ����������·��������·��һ�����̷���ͷ

  
  ���·������Դ�ļ��൱�ڵ�ǰ�����·��
  
  .��ǰ·��
  
  ..��һ��·��
   
   
  ע�⣬��������·������Դ�ļ�����ͬһ���̷����棬û��д���·����
   
 * */

public class Demo2 {
	public static void main(String[] args) {
		File file = new File(".");
		System.out.println(file.getAbsolutePath());
		File file2 = new File("..\\..\\a.txt");
		System.out.println(file2.exists());
	}

}
