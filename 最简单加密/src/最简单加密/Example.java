package ��򵥼���;

import java.util.Scanner;
public class Example {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ��Ӣ��֧����������ַ���");
		String password = scan.nextLine();
		char[] array = password.toCharArray();
		for(int i=0;i<array.length;i++) {
			array[i]=(char)(array[i]^1314520);
		}
		System.out.println("���ܻ��߽�������");
		System.err.println(new String(array));
	}

}
