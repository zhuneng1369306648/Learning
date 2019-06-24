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
			System.out.println("请选择功能： A(注册)   B(登录)");
			String option = scanner.next();
			if("a".equalsIgnoreCase(option)) {
				reg();
			}else if("b".equalsIgnoreCase(option)) {
				login();
			}else {
				System.out.println("您的输入有误，请重新输入。。。。");
			}
		}
	}
	private static void login() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("请输入用户名");
		String userName = scanner.next();
		System.out.println("请输入密码");
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
			System.out.println("欢迎"+userName+"登陆成功");
		}else {
			System.out.println("不存在该用户信息，请注册。。");
		}
		
		
	}
	public static void reg() throws IOException{
		System.out.println("请输入用户名：");
		String userName = scanner.next();
		System.out.println("请 输入密码：");
		String password = scanner.next();
		String info = userName+" "+ password;
		//把用户的注册的信息写到文件上
		File file = new File("F:\\users.txt");
		FileWriter fileWriter = new FileWriter(file,true);
		//建立缓冲输出字符流
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		//把用户信息写出
		
		bufferedWriter.write(info);
		bufferedWriter.newLine();
		//关闭资源
		bufferedWriter.close();
		
	}

}
