package day12;

public class Demo11 {
	public static void main(String[] args) {
		String str = new String();
		
		byte[] buf = {97,98,99};
		str = new String(buf);
		str = new String(buf,1,2);
		System.out.println(str);
		
		
	}

}
