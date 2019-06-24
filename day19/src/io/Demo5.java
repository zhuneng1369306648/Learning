package io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5 {
	public static void main(String[] args) {
		File file = new File("F:\\a.txt");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length());
		System.out.println(file.getParent());
		System.out.println(file.lastModified());
		//ʹ�ú���ֵת��ΪDate����
		long lastModified = file.lastModified();
		Date date = new Date(lastModified);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		System.out.println(dateFormat.format(date));
	}

}
