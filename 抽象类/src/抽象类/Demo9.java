package 抽象类;

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
		System.out.println(name+"好好学习");
	}
}

//挣钱是拓展的，所以应该定义在接口上
interface Money{
	public void makeMoney();
}

//会挣钱的学生
class MoneyStudent extends Student implements Money{

	public MoneyStudent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeMoney() {
		// TODO Auto-generated method stub
		System.out.println(name+"好好挣钱，交学费!");
		
	}
	
}
