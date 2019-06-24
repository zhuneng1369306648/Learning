package io;

import java.io.File;
import java.io.FilenameFilter;

class MyFilter implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(".java");
	}
	
}

public class Demo7 {
	public static void main(String[] args) {
		File dir = new File("G:\\day基础\\day19\\代码\\day19\\src\\cn\\itcast");
		listJava2(dir);
	}

	public static void listJava2(File dir) {
		// TODO Auto-generated method stub
		File[] files = dir.listFiles(new MyFilter());
		for(File file:files) {
			System.out.println(file.getName());
		}
		
	}
	public static void listJava(File dir) {
		File[] files = dir.listFiles();
		for(File file: files) {
			String fileName = file.getName();
			if(fileName.matches(".+\\.java")&&file.isFile()) {
				System.out.println(fileName);
			}
		}
	}
	
	public static void listFile(File dir) {
		File[] files = dir.listFiles();
		System.out.println("文件：");
		for(File fileItem:files) {
			if(fileItem.isFile()) {
				System.out.println("\t"+fileItem.getName());
				
			}
		}
		System.out.println("文件夹");
		for(File fileItem : files) {
			if(fileItem.isDirectory()) {
				System.out.println("\t"+fileItem.getName());
			}
		}
	}

}
