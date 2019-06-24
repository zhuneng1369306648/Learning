package 最简单加密;

import java.util.Scanner;
public class Example {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个英文支付穿或加密字符串");
		String password = scan.nextLine();
		char[] array = password.toCharArray();
		for(int i=0;i<array.length;i++) {
			array[i]=(char)(array[i]^1314520);
		}
		System.out.println("加密或者解密如下");
		System.err.println(new String(array));
	}

}
