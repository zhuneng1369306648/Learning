package other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

class BufferedLineNum2 extends BufferedReader{
	BufferedReader bufferedReader;
	int count = 1;

	public BufferedLineNum2(BufferedReader bufferedReader) {
		super(bufferedReader);
		// TODO Auto-generated constructor stub
		this.bufferedReader = bufferedReader;
	}
	public String readLine() throws IOException {
		String line = bufferedReader.readLine();
		if(line == null) {
			return null;
		}
		line = count+ " " + line;
		count++;
		return line;
	}
	
}
class BufferedSemi2 extends BufferedReader{  //为什么要继承?  是为了让这些装饰类的对象可以作为参数进行传递，达到互相装饰 的效果。

	//在内部维护一个被装饰类的引用。
	BufferedReader bufferedReader;
		
	
	public BufferedSemi2(BufferedReader bufferedReader){ // new BuffereLineNum();
		super(bufferedReader);// 注意： 该语句没有任何的作用，只不过是为了让代码不报错。
		this.bufferedReader = bufferedReader;
	}
	
	public String readLine() throws IOException{
		String line = bufferedReader.readLine();  //如果这里的ReadLine方法是调用了buffereLineNum的readLine方法，问题马上解决。
		if(line==null){
			return null;
		}
		line = line +";";
		return line;
	}
	
}

//缓冲类带双引号
class BufferedQuto2 extends BufferedReader{
	
	//在内部维护一个被装饰的类
	BufferedReader bufferedReader;
	
	public BufferedQuto2(BufferedReader bufferedReader){  //new  BufferedSemi2();
		super(bufferedReader) ; //只是为了让代码不报错..
		this.bufferedReader = bufferedReader;
	}
	
	public String readLine() throws IOException{
		String line = bufferedReader.readLine();  //如果这里的ReadLine方法是调用了buffereLineNum的readLine方法，问题马上解决。
		if(line==null){
			return null;
		}
		line = "\""+line +"\"";
		return line;
	}
	
}



public class Demo2 {
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\Demo1.java");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		BufferedLineNum2 bufferedLineNum = new BufferedLineNum2(bufferedReader);
		BufferedSemi2 bufferedSemi2 = new BufferedSemi2(bufferedLineNum);
        BufferedQuto2 bufferedQuto2 = new  BufferedQuto2(bufferedSemi2);
		
		String line = null;
		while((line = bufferedQuto2.readLine())!=null){
			System.out.println(line);
		}
		
	}

}
