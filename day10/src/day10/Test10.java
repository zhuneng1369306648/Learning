package day10;

public class Test10 {
	public static int numberOfOne(int n) {
		int result = 0;
		for(int i=0;i<32;i++) {
			result +=(n&1);
			n>>>=1;
		}
		return result;
	}

}
