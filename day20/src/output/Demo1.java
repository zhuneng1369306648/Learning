package output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
  输出字节流
  -----------OutputStream 是所有输出字节流的父类，抽象类
                ------FileOutputStream 向文件输出数据的输出字节流
   FileOutPutStream
   1.找到目标文件
   2.建立数据的输出通道（如果没有目标文件，将在这一步创建目标文件）
   3.把数据转换为字节数组写出
   4.关闭资源
   
   FileOutputStream需要注意的细节
   1.使用FileOutputStream的时候，如果目标文件不存在，那么会自动创建目标文件对象
   2.如果目标文件已经存在，那么会先清空目标文件中的数据，然后再写入数据
   3.如果目标文件已经存在，需要在原来数据基础上最佳数据的时候应该使用
            new FileOutputStream(file,true)构造函数，第二参数为true。
   4.使用write方法写数据的时候，虽然接收的是有个int类型的数据，但是真正邪乎的只是一个字节的
      数据，只是把低八位的二进制数据写出，其他二十四位丢弃。
   
   
   
   
 * */

public class Demo1 {
	public static void main(String[] args) throws IOException {
		writeTest3();
		
	}
	
	
	
	public static void writeTest3() throws IOException {
		File file = new File("F:\\b.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		String data = "abc";
		byte[] buf = data.getBytes();
		fileOutputStream.write(buf, 0, 3);
		fileOutputStream.close();
	}
	public static void writeTest2() throws IOException {
		File file = new File("F:\\b.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file,true);
		String data = "\r\nhello world";
		fileOutputStream.write(data.getBytes());
		fileOutputStream.close();
	}
	
	
	
	
	
	public static void writeTest1() throws IOException {
		File file = new File("F:\\b.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		fileOutputStream.write('h');
		fileOutputStream.write('e');
		fileOutputStream.write('l');
		fileOutputStream.write('l');
		fileOutputStream.write('o');
		//关闭资源
		fileOutputStream.close();
		
	}

}
