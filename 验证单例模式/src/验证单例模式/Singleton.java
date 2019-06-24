package ��֤����ģʽ;

public class Singleton {
	private Singleton() {};
	private static final Singleton instance = new Singleton();
	public static Singleton getInstance() {
		return instance;
		
	}

}
//����ģʽ
class Singleton2{
	private Singleton2() {};
	private static Singleton2 instance = new Singleton2();
	public static synchronized Singleton2 getInstance() {
		if(instance == null) {
			instance = new Singleton2();
		} 
		return instance;
	}
}