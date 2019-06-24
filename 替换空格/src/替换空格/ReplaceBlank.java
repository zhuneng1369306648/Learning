package 替换空格;

import java.util.Scanner;

/*public class ReplaceBlank{
	static String input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入");
		String input = sc.nextLine();
		sc.close();
		return input;
	}
	static String replace(String input) {
		if(input == null) {
			return null;
		}
		StringBuffer output = new StringBuffer();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==' ') {
				output.append("%20");
			}else {
				output.append(input.charAt(i));
			}
		}
		return new String(output);
	}
	public static void main(String[] args) {
		System.out.println(replace(input()));
	}
}


public class ReplaceBlank{
	static String input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入");
		String input = sc.nextLine();
		sc.close();
		return input;
	}
	static  String replace(String input) {
		if(input==null) {
			return null;
		}
		StringBuffer output = new StringBuffer();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)== ' ') {
				output.append("%20");
			}else {
				output.append(input.charAt(i));
			}
		}return new String(output);
	}
	public static void main(String[] args) {
		System.out.println(replace(input()));
	}
}
*/
public class ReplaceBlank{
	static String input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入");
		String input = sc.nextLine();//结束输入。sc.next退出的时候不会保存空格，nextline可以保存空格
		sc.close();
		return input;
	}
	static String replace(String input) {
		if(input==null) {
			return null;
		}
		StringBuffer output = new StringBuffer();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==' ') {//能够用来检索特定索引下的字符的String实例的方法，charAt()方法返回指定索引位置的字符值。
				output.append("%20");
			}else
			{
				output.append(input.charAt(i));
			}
		}return new String(output);
	}public static void main(String[] args) {
		System.out.println(replace(input()));
	}
}