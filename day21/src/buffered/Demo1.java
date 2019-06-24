package buffered;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*
  输入字符流
  -------Reader 所有输入字符流的基类，抽象类
  -------- FileReader 读取文件字符串的输入字符流
  -----------BufferedReader  缓冲输入字符流，缓冲 输入字符流出现的目的是为了提高读取文件 
                        的效率和拓展了FileReader的功能。  其实该类内部也是维护了一个字符数组
                        
                        
          缓冲流不具备读写文件的能力
          
      BufferedReader的使用步骤
         1.找到目标文件
         2.建立数据的输入通道

  
  
  
  
 * */

public class Demo1 {
	public static void main(String[] args) throws IOException {
		//readTest1();
		File file = new File("F:\\a.txt");
		FileReader fileReader = new FileReader(file);
		String line = null;
		while((line = myReadLine(fileReader))!= null) {
			System.out.println(line);
		}
	}
	
	
	
	public static String myReadLine(FileReader fileReader) throws IOException {
		StringBuilder sb = new StringBuilder();
		int content = 0;
		while((content = fileReader.read())!=-1) {
			if(content=='\r') {
				continue;
			}else if(content =='\n') {
				break;
			}
			else {
				sb.append((char)content);
			}
		}
		if(content == -1) {
			return null;
		}
		return sb.toString();
	}
	public static void readTest1() throws IOException {
		File file = new File("F:\\a.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = null;
		while((line=bufferedReader.readLine())!=null) {
			System.out.println(Arrays.toString("aaa".getBytes()));
		}
		bufferedReader.close();
		
	}

}
