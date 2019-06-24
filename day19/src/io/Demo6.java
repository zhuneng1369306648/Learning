package io;

import java.io.File;

public class Demo6 {
	public static void main(String[] args) {
		File dir = new File("G:\\day»ù´¡\\day19\\´úÂë\\day19\\src\\cn\\itcast\\file");
		listJava(dir);
	}
	public static void listJava(File dir) {
		File[] files = dir.listFiles();
		for(File file: files) {
			String fileName = file.getName();
			/*if(fileName.endsWith(".java")) {
				System.out.println(fileName);
			}*/
			if(fileName.matches(".+\\.java")&&file.isFile()) {
				System.out.println(fileName);
			}
		}
	}

}
