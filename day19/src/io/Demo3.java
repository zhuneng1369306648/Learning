package io;

import java.io.File;
import java.io.IOException;

public class Demo3 {
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\b.txt");
		System.out.println("�����ɹ�����"+file.createNewFile());
		File dir = new File("F:\\aaa");
		dir.mkdir();//����һ���������ļ���
		File destFile = new File("F:\\abc.txt");
		file.renameTo(destFile);
	}

}
