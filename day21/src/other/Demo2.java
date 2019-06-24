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
class BufferedSemi2 extends BufferedReader{  //ΪʲôҪ�̳�?  ��Ϊ������Щװ����Ķ��������Ϊ�������д��ݣ��ﵽ����װ�� ��Ч����

	//���ڲ�ά��һ����װ��������á�
	BufferedReader bufferedReader;
		
	
	public BufferedSemi2(BufferedReader bufferedReader){ // new BuffereLineNum();
		super(bufferedReader);// ע�⣺ �����û���κε����ã�ֻ������Ϊ���ô��벻����
		this.bufferedReader = bufferedReader;
	}
	
	public String readLine() throws IOException{
		String line = bufferedReader.readLine();  //��������ReadLine�����ǵ�����buffereLineNum��readLine�������������Ͻ����
		if(line==null){
			return null;
		}
		line = line +";";
		return line;
	}
	
}

//�������˫����
class BufferedQuto2 extends BufferedReader{
	
	//���ڲ�ά��һ����װ�ε���
	BufferedReader bufferedReader;
	
	public BufferedQuto2(BufferedReader bufferedReader){  //new  BufferedSemi2();
		super(bufferedReader) ; //ֻ��Ϊ���ô��벻����..
		this.bufferedReader = bufferedReader;
	}
	
	public String readLine() throws IOException{
		String line = bufferedReader.readLine();  //��������ReadLine�����ǵ�����buffereLineNum��readLine�������������Ͻ����
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
