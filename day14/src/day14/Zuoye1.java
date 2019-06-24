package day14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

class User{
	int id;
	String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(int Id, String password) {
		this.id = id;
		this.password = password;
	}
	@Override
	public boolean equals(Object obj) {
		User user = (User)obj;
		return this.id == user.id;
	}
	public String toString() {
		return "{�˺ţ�"+this.id +"����:"+this.password+"}";
	}
	
}
public class Zuoye1 {
	static Scanner scanner = new Scanner(System.in);
	static Collection users = new ArrayList();
	public static void main(String[] args) {
		while(true) {
			System.out.println("��ѡ����    A(ע��)    B(��¼)");
			String option = scanner.next();
			if("a".equalsIgnoreCase(option))
			{
				reg();
			}else if("b".equalsIgnoreCase(option)) {
				login();
			}else {
				System.out.println("������������������");
			}
			}
	}
	public static void login() {
		System.out.println("�������˺ţ�");
		int id = scanner.nextInt();
		System.out.println("����������:");
		String password = scanner.next();
		//�жϼ��ϵ��û��Ƿ���ڸ��û���������
		//�������ϵ�Ԫ�أ��鿴�Ƿ���ڸ��û���Ϣ
		
		boolean isLogin = false; 	//����������ڼ�¼�Ƿ��½�ɹ�����Ϣ  , Ĭ����û�е�½�ɹ���
		Iterator it = users.iterator();
		while(it.hasNext()){
			User user = (User) it.next();
			if(user.id==id&&user.password.equals(password)){
				//���ڸ��û���Ϣ����½�ɹ�...
				isLogin = true;
			}
		}
		
		if(isLogin==true){
			System.out.println("��ӭ��½...");
		}else{
			System.out.println("�û�������������󣬵�½ʧ��...");
		}
	}
	
	

	public static void reg() {
		//110  , 220
		User user = null;
		while(true){
				System.out.println("�������˺�:");
				int id = scanner.nextInt();  //220 
				user = new User(id,null);
				if(users.contains(user)){  // contains�ײ�������equals������
					//�������
					System.out.println("���˺��Ѿ����ڣ������������˺�");
				}else{
					//������
					break;
				}
		}
		
		System.out.println("���������룺");
		String password = scanner.next();
		user.setPassword(password);
		//��user���󱣴浽������
		users.add(user);
		System.out.println("ע��ɹ�!");
		System.out.println("��ǰע�����Ա��"+users);
	}

}
