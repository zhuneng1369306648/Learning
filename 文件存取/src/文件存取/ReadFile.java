package ÎÄ¼þ´æÈ¡;

import java.io.FileInputStream;

public class ReadFile {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("G:\\a.txt");
			byte[] data = new byte[1024];
			int i=0;
			int n=fis.read();
			while(n!=-1) {
				data[i]=(byte)n;
				i++;
				n=fis.read();
			}
			String s = new String(data,0,i);
			System.out.println(s);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			}catch(Exception e) {}
		}
	}

}
