package output;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\a\\1.jpg");
		File desFile = new File("F:\\2.jpg");
		FileInputStream fileInputStream = new FileInputStream(file);
		FileOutputStream fileOutputStream = new FileOutputStream(desFile);
		byte[] buf = new byte[1024];
		int length = 0;
		while((length=fileInputStream.read(buf))!=-1) {
			fileOutputStream.write(buf, 0, length);
		}
		fileInputStream.close();
		fileOutputStream.close();
	}
}
