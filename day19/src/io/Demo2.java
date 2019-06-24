package io;

import java.io.File;

/*
  绝对路径：该文件在硬盘生的完整路径，绝对路径一般以盘符开头

  
  相对路径：资源文件相当于当前程序的路径
  
  .当前路径
  
  ..上一级路径
   
   
  注意，程序所在路径与资源文件不在同一个盘符下面，没法写相对路径。
   
 * */

public class Demo2 {
	public static void main(String[] args) {
		File file = new File(".");
		System.out.println(file.getAbsolutePath());
		File file2 = new File("..\\..\\a.txt");
		System.out.println(file2.exists());
	}

}
