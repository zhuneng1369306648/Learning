package 循环过滤;

public class CycFilter {
	public static void main(String[] args) {
		Person a = new Person();
		Person b = new Person();
		Person c = new Person();
		a.Run();
	}

}
class Person{
	static int count;
	String name;
	{
		count++;
	}
	public void Run() {
		System.out.println("调用"+count);
	}
}

