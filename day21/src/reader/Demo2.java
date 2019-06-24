package reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		readTest2();
	}
	public static void readTest2() throws IOException {
		File file = new File("f:\\a.txt");
		FileReader fileReader = new FileReader(file);
		char[] buf = new char[1024];
		int length = 0;
		while((length = fileReader.read(buf))!=-1) {
			System.out.println(new String(buf,0,length));
		}
	}

}
