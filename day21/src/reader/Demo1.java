package reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		readTest();
	}
	public static void readTest() throws IOException {
		File file = new File("F:\\a.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] buf = new byte[2];
		for(int i=0;i<3;i++) {
			fileInputStream.read(buf);
			System.out.print(new String(buf));
		}
		fileInputStream.close();
	}
	public static void writeTest() throws IOException {
		File file = new File("F:\\a.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		String data = "´ó¼ÒºÃ";
		byte[] buf = data.getBytes();
		fileOutputStream.write(buf);
		fileOutputStream.close();
	}

}
