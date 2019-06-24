package day20;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
  通过File对象可以读取文件夹的属性数据，
  IO流（input output）
  IO流解决问题：解决设备与设备之间的数据传输问题
  
  
  
  IO流分类
     按数据流向划分
        输入流
        输出流
   按照处理的单位划分
     字节流：字节流读取的就是文件中二进制数据，读取到二进制数据不会任何处理
    字符流：字符流也是读取文件中的二进制数据，不过吧这些二进制数据转换为我们识别的字符
    字符流= 字节流 + 解码 
 
 字节流
    输入字节流
    --------InputStream 所有输入字节流的基类
     -------------FileINputStream 读取文件数据的输入字节流
    
 
 * */
public class Demo1 {
	public static void main(String[] args) throws IOException {
		readTest3();
		
	}
	
	
	public static void readTest3() throws IOException {
		File file = new File("F:\\a.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] buf = new byte[1024];
		int length = fileInputStream.read(buf);
		System.out.println("length"+length);
		String content = new String(buf,0,length);
		System.out.println("内容"+content);
		fileInputStream.close();
	}
	
	public static void readTest2() throws IOException {
		long startTime = System.currentTimeMillis();
		File file = new File("F:\\a.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		int content = 0;
		while((content = fileInputStream.read())!=-1) {
			System.out.println((char)content);
		}
		fileInputStream.close();
		long endTime = System.currentTimeMillis();
		System.out.println("读取到的时间是"+(endTime-startTime));
	}
	
	
	
	public static void readTest1() throws IOException{
		File file = new File("F:\\a.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		int content = fileInputStream.read();
		System.out.println("读到的内容是"+(char)content);
		fileInputStream.close();
		
	}

}
