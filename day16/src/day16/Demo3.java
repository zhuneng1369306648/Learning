package day16;

import java.util.HashSet;
import java.util.Scanner;

class User{
	String userName;
	String password;
	public User(String userName,String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String toString() {
		return "{�û�����"+this.userName+"���룺"+this.password+"}";
		
	}
	public boolean equals(Object obj) {
		User user = (User)obj;
		return this.userName.equals(userName)&&this.password.equals(password);
		}
	public int hashCode() {
		return userName.hashCode()+password.hashCode();
		
	}
    }

    


public class Demo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashSet set = new HashSet();
		while(true) {
			System.out.println("�������û���");
			String userName = scanner.next();
			System.out.println("����������");
			String password = scanner.next();
			User user = new User(userName,password);
			if(set.add(user)) {
				System.out.println("ע��ɹ�");
			}else {
				System.out.println("ע��ʧ��");
			}
		}
	}

}
