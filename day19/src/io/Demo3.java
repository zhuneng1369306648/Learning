package io;

import java.io.File;
import java.io.IOException;

public class Demo3 {
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\b.txt");
		System.out.println("创建成功了吗"+file.createNewFile());
		File dir = new File("F:\\aaa");
		dir.mkdir();//创建一个单机的文件夹
		File destFile = new File("F:\\abc.txt");
		file.renameTo(destFile);
	}

}
