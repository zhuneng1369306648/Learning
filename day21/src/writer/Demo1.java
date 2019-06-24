package writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*FileWriter 的使用步骤
    1.找到目标文件
    2.建立数据输出通道
    3.写出数据
    4.关闭资源
  FileWriter要注意的事项
  1.使用FileWriter写数据的时候，FileWriter内部维护了一个1024字符数组的，写数据的时候会先写入到它
     内部维护的字符数组中，如果需要把数据真正写到硬盘上，需要调用flush或者是close方法或者是填满了
     内部的字符数组。
  2.使用FileWriter的时候，如果目标文件不存在，那么会自动创建目标文件
  3.使用FileWriter的时候，如果目标文件已经存在了，那么默认情况会先情况文件中的数据，然后再写入数据 ，
       如果需要在原来的基础上追加数据，
	需要使用“new FileWriter(File , boolean)”的构造方法，第二参数为true。
 
 
 
 
 * */

public class Demo1 {
	public static void main(String[] args) throws IOException {
		writeTest1();
	}
	public static void writeTest1() throws IOException {
	File file = new File("F:\\a.txt");
	FileWriter fileWriter = new FileWriter(file,true);
	String data = "你好啊";
	fileWriter.write(data);
	fileWriter.close();
	}

}
