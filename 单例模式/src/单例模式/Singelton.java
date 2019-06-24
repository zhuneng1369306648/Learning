package µ¥ÀýÄ£Ê½;

public class Singelton {
	private Singelton() {}
		private static final Singelton instance=new Singelton();
		public static Singelton getInstance() {
			return instance;
	}

}
class Singelton2{
	private Singelton2() {};
	private static Singelton2 instance = null;
	public static synchronized Singelton2 getInstance() {
		if(instance == null) {
			instance = new Singelton2();
		}
		return instance;
	}
}
class Singelton3{
	private Singelton3() {};
	private static Singelton3 instance = null;
	public static synchronized Singelton3 getInstance() {
		if(instance == null) {
			instance = new Singelton3();
		}
		return instance;
	}
}

