package �滻�ո�;

import java.util.Scanner;

/*public class ReplaceBlank{
	static String input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("������");
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
		System.out.println("������");
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
		System.out.println("������");
		String input = sc.nextLine();//�������롣sc.next�˳���ʱ�򲻻ᱣ��ո�nextline���Ա���ո�
		sc.close();
		return input;
	}
	static String replace(String input) {
		if(input==null) {
			return null;
		}
		StringBuffer output = new StringBuffer();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==' ') {//�ܹ����������ض������µ��ַ���Stringʵ���ķ�����charAt()��������ָ������λ�õ��ַ�ֵ��
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