package day11;

import java.util.Scanner;

class Users{
	private String name;
	private String password;
	public void getName(String name) {
		this.name = name;
	}
	public void getPassword(String password) {
		this.password = password;
	}
	public String setName(String name) {
		return name;
	}
	public String setPasswprd(String password) {
		return password;
	}
}

public class User {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("请选择    A.注册，  B，查看信息 ");
			Users[] users = new Users[10];
			//String option = Scanner.next();
			
		}
	}

}

