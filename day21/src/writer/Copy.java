package writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("F:1.jpg"));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\Test.exe"));
		String line=null;
		while((line = bufferedReader.readLine())!=null){
		bufferedWriter.write(line);
		}
		bufferedWriter.close();
		bufferedReader.close();

	}

}
