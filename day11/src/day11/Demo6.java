package day11;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo6 {
	public static void main(String[] args) {
		FileReader fileReader = null;
		try {
		//找到目标文件
		File file = new File("f:\\a.txt");
		//建立程序与文件的数据通道，
		fileReader = new FileReader(file);
		char[] buf = new char[1024];
		int length = 0;
		 length = fileReader.read(buf);
		 System.out.println(new String(buf,0,length));
		 }
		catch(IOException e){
			System.out.println("读出志愿失败");
		}finally {
			try {
		      fileReader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
