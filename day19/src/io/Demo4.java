package io;

import java.io.File;

public class Demo4 {
	public static void main(String[] args) {
		File file = new File("F:\\a.txt");
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.isHidden());
	}

}
