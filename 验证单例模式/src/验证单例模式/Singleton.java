package 验证单例模式;

public class Singleton {
	private Singleton() {};
	private static final Singleton instance = new Singleton();
	public static Singleton getInstance() {
		return instance;
		
	}

}
//饿汉模式
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