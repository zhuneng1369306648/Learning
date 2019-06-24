package day10;

public class Test09 {
	public static long fibonacci(int n) {
		if(n<=0) {
			return 0;
		}
		if(n==1 || n==2) {
			return 1;
		}
		long prePre = 1;
		long pre = 1;
		long current = 2;
		for(int i=3;i<=n;i++) {
			current = prePre + pre;
			prePre = pre;
			pre = current;
		}
		return current;
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(5));
		System.out.println(fibonacci(6));
		System.out.println(fibonacci(4));
		System.out.println(fibonacci(3));
		System.out.println(fibonacci(2));
	}

}
