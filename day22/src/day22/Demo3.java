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
对象的输入输出流 : 对象的输入输出流 主要的作用是用于写对象的信息与读取对象的信息。 
对象信息一旦写到文件上那么对象的信息就可以做到持久化了

对象的输出流： ObjectOutputStream .

对象的输入流: ObjectInputStream 


ObjectOutputStream的使用步骤：
	1. 

对象输入输出流要注意的细节：
	1. 如果对象需要被写出到文件上，那么对象所属的类必须要实现Serializable接口。 
	Serializable接口没有任何的方法，是一个标识接口而已。
	2. 对象的反序列化创建对象的时候并不会调用到构造方法的、
	3. serialVersionUID 是用于记录class文件的版本信息的，serialVersionUID这个数字是通过一个类的类名、
	成员、包名、工程名算出的一个数字。
	4. 使用ObjectInputStream反序列化的时候，ObjeectInputStream会先读取文件中的serialVersionUID，
	然后与本地的class文件的serialVersionUID进行对比，如果这两个id不一致，那么反序列化就失败了。
	5. 如果序列化与反序列化的时候可能会修改类的成员，那么最好一开始就给这个类指定一个serialVersionUID，如
	果一类已经指定的serialVersionUID，然后在序列化与反序列化的时候，jvm都不会再自己算这个 class的
	serialVersionUID了。
	6. 如果一个对象某个数据不想被序列化到硬盘上，可以使用关键字transient修饰。
	7. 如果一个类维护了另外一个类的引用，那么另外一个类也需要实现Serializable接口。
	
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
	
	transient int age;  // transient 透明
	
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
		return "用户名："+this.userName+ " 密码："+ this.password+" 年龄："+this.age+" 地址："+this.address.city;
	}
}
public class Demo3 {
	public static void main(String[] args) throws IOException, Exception {
		writeObj();
		readObj();
	}
	//把文件中的对象信息读取出来-------->对象的反序列化
		public static void readObj() throws  IOException, ClassNotFoundException{
			//找到目标文件
			File file = new File("F:\\obj.txt");
			//建立数据的输入通道
			FileInputStream fileInputStream = new FileInputStream(file);
			//建立对象的输入流对象
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			//读取对象信息
			User user = (User) objectInputStream.readObject(); //创建对象肯定要依赖对象所属 的class文件。
			System.out.println("对象的信息："+ user);
		}
	public static void writeObj() throws IOException {
		Address address = new Address("中国","广州");
		User user = new User("admin","123",15,address);
		File file = new File("F:\\obj.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(user);
		objectOutputStream.close();
	}

}
