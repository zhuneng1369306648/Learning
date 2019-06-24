package buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 
输入字节流体系
---- InputStream  输入字节流的基类，抽象
--------------FileinputStream  读取文件数据的输入字节流
--------------BufferedinputStream 缓冲输入字节流     主要为了提高文件数据的效率
                                     内部维护了一个8kb的字节数组
                                     
      凡是缓冲流不具备读写文件的能力
      
      使用BufferedinputStream的步骤
        1.找到目标文件
        2.建立数据的输入通道
        3.建立缓冲输入字节流
        4.关闭资源
        
 * */

public class Demo1 {
	public static void main(String[] args) throws IOException {
		readTest();
	}
	
	public static void readTest2() throws IOException {
		File file = new File("F:\\a.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		bufferedInputStream.read();
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
		fileOutputStream.write(null);
		int content = 0;
		while((content = fileInputStream.read()) !=-1) {
			System.out.println((char)content);
		}
		bufferedInputStream.close();
	}
	public static void readTest() throws IOException {
		File file = new File("F:\\a.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] buf = new byte[1024*8];
		int length = 0;
		while((length = fileInputStream.read(buf))!= -1) {
			System.out.println(new String(buf,0,length));
		}
		fileInputStream.close();
	}

}
/*package cn.itcast.buffered;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
*/
/*
输出字节流
--------| OutputStream  所有输出字节流的基类  抽象类
------------| FileOutputStream 向文件 输出数据 的输出字节流
------------| Bufferedoutputstream  缓冲输出字节流    BufferedOutputStream出现的目的是为了提高写数据的效率。 
        						内部也是维护了一个8kb的字节数组而已。
 
 使用BufferedOutputStream的步骤：
 	1. 找到目标文件
 	2. 建立数据的输出通道

 
BufferedOutputStream 要注意的细节
	1. 使用BufferedOutStream写数据的时候，它的write方法是是先把数据写到它内部维护的字节数组中。
 	2. 使用BufferedOutStream写数据的时候，它的write方法是是先把数据写到它内部维护的字节数组中，如果需要把数据真正的写到硬盘上面，需要
 	调用flush方法或者是close方法、 或者是内部维护的字节数组已经填满数据的时候。
 	

 
 
public class Demo2 {

	public static void main(String[] args) throws IOException {
		//找到目标文件
		File file = new File("F:\\a.txt");
		//建立数据的输出通道
		FileOutputStream  fileOutputStream = new FileOutputStream(file);
		//建立缓冲输出字节流对象
		BufferedOutputStream bufferedOutputStream  = new BufferedOutputStream(fileOutputStream);
		//把数据写出
		bufferedOutputStream.write("hello world".getBytes()); 
		//把缓冲数组中内部的数据写到硬盘上面。
		//bufferedOutputStream.flush();
		bufferedOutputStream.close();
	}
	
}*/

