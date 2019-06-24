package day22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
�������������� : �������������� ��Ҫ������������д�������Ϣ���ȡ�������Ϣ�� 
������Ϣһ��д���ļ�����ô�������Ϣ�Ϳ��������־û���

������������ ObjectOutputStream .

�����������: ObjectInputStream 


ObjectOutputStream��ʹ�ò��裺
	1. 

�������������Ҫע���ϸ�ڣ�
	1. ���������Ҫ��д�����ļ��ϣ���ô���������������Ҫʵ��Serializable�ӿڡ� 
	Serializable�ӿ�û���κεķ�������һ����ʶ�ӿڶ��ѡ�
	2. ����ķ����л����������ʱ�򲢲�����õ����췽���ġ�
	3. serialVersionUID �����ڼ�¼class�ļ��İ汾��Ϣ�ģ�serialVersionUID���������ͨ��һ�����������
	��Ա�������������������һ�����֡�
	4. ʹ��ObjectInputStream�����л���ʱ��ObjeectInputStream���ȶ�ȡ�ļ��е�serialVersionUID��
	Ȼ���뱾�ص�class�ļ���serialVersionUID���жԱȣ����������id��һ�£���ô�����л���ʧ���ˡ�
	5. ������л��뷴���л���ʱ����ܻ��޸���ĳ�Ա����ô���һ��ʼ�͸������ָ��һ��serialVersionUID����
	��һ���Ѿ�ָ����serialVersionUID��Ȼ�������л��뷴���л���ʱ��jvm���������Լ������ class��
	serialVersionUID�ˡ�
	6. ���һ������ĳ�����ݲ��뱻���л���Ӳ���ϣ�����ʹ�ùؼ���transient���Ρ�
	7. ���һ����ά��������һ��������ã���ô����һ����Ҳ��Ҫʵ��Serializable�ӿڡ�
	
*/
class Address implements Serializable{
	String country;
	String city;
	public Address(String country,String city) {
		this.country = country;
		this.city = city;
	}
}
class User implements Serializable{
	
	private static final long serialVersionUID = 1L;

	String userName ;
	
	String password;
	
	transient int age;  // transient ͸��
	
	Address address ;
	

	public User(String userName , String passwrod) {
		this.userName = userName;
		this.password = passwrod;
	}
	
	
	public User(String userName , String passwrod,int age,Address address) {
		this.userName = userName;
		this.password = passwrod;
		this.age = age;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "�û�����"+this.userName+ " ���룺"+ this.password+" ���䣺"+this.age+" ��ַ��"+this.address.city;
	}
}
public class Demo3 {
	public static void main(String[] args) throws IOException, Exception {
		writeObj();
		readObj();
	}
	//���ļ��еĶ�����Ϣ��ȡ����-------->����ķ����л�
		public static void readObj() throws  IOException, ClassNotFoundException{
			//�ҵ�Ŀ���ļ�
			File file = new File("F:\\obj.txt");
			//�������ݵ�����ͨ��
			FileInputStream fileInputStream = new FileInputStream(file);
			//�������������������
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			//��ȡ������Ϣ
			User user = (User) objectInputStream.readObject(); //��������϶�Ҫ������������ ��class�ļ���
			System.out.println("�������Ϣ��"+ user);
		}
	public static void writeObj() throws IOException {
		Address address = new Address("�й�","����");
		User user = new User("admin","123",15,address);
		File file = new File("F:\\obj.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(user);
		objectOutputStream.close();
	}

}
