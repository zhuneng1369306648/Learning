package ����ٺ�;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������Ա��������");
		String name = scan.nextLine();
		System.out.println("��������Ա����ı������");
		String language = scan.nextLine();
		switch(language.hashCode()){
			case 3254818:
			case 2301506:
			case 2269730:
				System.out.println("Ա��"+name+"�����䵽Java���򿪷�����");
				break;
			default:
					System.out.println("����Ҫ");
		}
	}

}
