package buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Login {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		while(true) {
			System.out.println("��ѡ���ܣ� A(ע��)   B(��¼)");
			String option = scanner.next();
			if("a".equalsIgnoreCase(option)) {
				reg();
			}else if("b".equalsIgnoreCase(option)) {
				login();
			}else {
				System.out.println("���������������������롣������");
			}
		}
	}
	private static void login() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�������û���");
		String userName = scanner.next();
		System.out.println("����������");
		String password = scanner.next();
		String info = userName+" "+password;
		BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\a.txt"));
		String line = null;
		boolean isLogin = false;
		while((line = bufferedReader.readLine())!=null) {
			if(info.equals(line)) {
				isLogin = true;
				break;
			}
		}
		if(isLogin) {
			System.out.println("��ӭ"+userName+"��½�ɹ�");
		}else {
			System.out.println("�����ڸ��û���Ϣ����ע�ᡣ��");
		}
		
		
	}
	public static void reg() throws IOException{
		System.out.println("�������û�����");
		String userName = scanner.next();
		System.out.println("�� �������룺");
		String password = scanner.next();
		String info = userName+" "+ password;
		//���û���ע�����Ϣд���ļ���
		File file = new File("F:\\users.txt");
		FileWriter fileWriter = new FileWriter(file,true);
		//������������ַ���
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		//���û���Ϣд��
		
		bufferedWriter.write(info);
		bufferedWriter.newLine();
		//�ر���Դ
		bufferedWriter.close();
		
	}

}
