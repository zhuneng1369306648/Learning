package day22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		mergeFile();
		cutFile();
	}
	public static void mergeFile() throws IOException {
		File dir = new File("F:\\music");
		Vector<FileInputStream> vector = new Vector<FileInputStream>();
		File[] files = dir.listFiles();
		for(File file :files) {
			if(file.getName().endsWith(".mp3")) {
				vector.add(new FileInputStream(file));
			}
		}
		Enumeration<FileInputStream> e = vector.elements();
		SequenceInputStream inputStream = new SequenceInputStream(e);
		FileOutputStream fileOutputStream = new FileOutputStream("F:\\2.MP3");
		byte[] buf = new byte[1024];
		int length =0;
		while((length = inputStream.read(buf))!= -1) {
			fileOutputStream.write(buf,0,length);
		}
		fileOutputStream.close();
		inputStream.close();
	}
	public static void cutFile() throws IOException{
		File file = new File("F:\\1.mp3");
		//目标文件夹
		File dir = new File("F:\\music");
		//建立数据的输入通道
		FileInputStream fileInputStream = new FileInputStream(file);
		//建立缓冲数组读取
		byte[] buf = new byte[1024*1024];
		int length = 0;
		for(int i = 0 ;  (length = fileInputStream.read(buf))!=-1 ; i++){
			FileOutputStream fileOutputStream =	new FileOutputStream(new File(dir,"part"+i+".mp3"));
			fileOutputStream.write(buf,0,length);
			fileOutputStream.close();
		}
		//关闭资源
		fileInputStream.close();
	}
	

}
