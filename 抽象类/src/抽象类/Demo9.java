package ������;

public class Demo9 {
	public static void main(String[] args) {
		Student s = new Student("m");
		s.study();
		MoneyStudent m = new MoneyStudent("d");
		m.study();
		m.makeMoney();
	}

}
class Student{
	String name;
	public Student(String name) {
		this.name = name;
	}
	public void study() {
		System.out.println(name+"�ú�ѧϰ");
	}
}

//��Ǯ����չ�ģ�����Ӧ�ö����ڽӿ���
interface Money{
	public void makeMoney();
}

//����Ǯ��ѧ��
class MoneyStudent extends Student implements Money{

	public MoneyStudent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeMoney() {
		// TODO Auto-generated method stub
		System.out.println(name+"�ú���Ǯ����ѧ��!");
		
	}
	
}
