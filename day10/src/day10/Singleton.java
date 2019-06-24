package day10;

public class Singleton {
	public static class Singleton1{
	private final static Singleton INSTANCE = new Singleton();
	private Singleton1() {
		
	}
	public static Singleton getInstance() {
		return INSTANCE;
	}
	}
	
	public static class Singleton2{
		private static Singleton2 INSTANCE = null;
		private Singleton2() {}
		public static Singleton2 getInstance() {
			if(INSTANCE == null) {
				INSTANCE = new Singleton2();
			}
			return INSTANCE;
		}
	}

}
