package other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;


/*
 ͨ���̳�ʵ��һ����ǿ��Ĺ��ܵ��ŵ㣬����ṹ������ͨ���׶�
 ȱ�㣬ʹ�ò����ᵼ�¼̳е���ϵ�����Ӵ�
  
  
  
 * 
 */
class BufferedLineNum extends BufferedReader{
    int count =1;
	public BufferedLineNum(Reader in) {
		super(in);
		
	}
	@Override
	public String readLine() throws IOException {
		// TODO Auto-generated method stub
		String line = super.readLine();
		if(line == null) {
			return null;
		}
		line = count + " "+ line;
		count++;
		return line;
	}
	
}
//���ֺŵĻ��������ַ���
class BufferedSemi extends BufferedReader{

	public BufferedSemi(Reader in) {
		super(in);
	}
	
	@Override
	public String readLine() throws IOException {
		String line =  super.readLine();
		if(line==null){
			return null;
		}
		line = line+";";
		return line;
	}
}


//��˫���ŵĻ��������ַ���
class  BufferedQuto extends BufferedReader{

	public BufferedQuto(Reader in) {
		super(in);
	}
	
	@Override
	public String readLine() throws IOException {
		String line = super.readLine();
		if(line==null){
			return null;
		}
		line = "\""+line+"\"";
		return line;
	}
}


public class Demo1 {
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\Demo1.java");
		FileReader fileReader = new FileReader(file);
		BufferedLineNum bufferedLineNum = new BufferedLineNum(fileReader);
		BufferedSemi bufferedSemi = new BufferedSemi(fileReader);
        BufferedQuto bufferedQuto = new BufferedQuto(fileReader);
		String line = null;
		while((line = bufferedQuto.readLine())!=null){
			System.out.println(line);
		}
	}

}
