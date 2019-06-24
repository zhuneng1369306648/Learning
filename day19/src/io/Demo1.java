package io;

import java.io.File;

/*
 * IO技术主要用于解决设备与设备之间的数据传输问题。比如：硬盘---》内存
   数据保存到硬盘上，该数据就可以永久性保存，数据以文件的形式存在。
   File类描述文件或者一个文件夹
   
   
   目录分隔符：
   Windows及去上目录分隔符是\。在Linux机器目录分隔符是/。
   
   注意：在Windows上\与/都可以使用作为目录分隔符，而且如果写/只需要写一个。
        
        
        
 * */

public class Demo1 {
	public static void main(String[] args) {
		File file = new File("F:\\a.txt");  //Linux
		
		File ParentFile = new File("F:\\");
		File file1 = new File(ParentFile,"a.txt");
		System.out.println("存在不？"+file.exists());//判断存在不存在
		System.out.println(File.separator);
	}

}
