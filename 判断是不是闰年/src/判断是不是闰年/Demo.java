package �ж��ǲ�������;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ�����");
		long year;
		try {
			year = scan.nextLong();
			if(year%4==0 && year %100 !=0||year %400 ==0) {
				System.out.println(year+"������");
			}else {
				System.out.println("��������");
			}
		}catch (Exception e) {
			System.out.println("������Ĳ�����Ч���!");
		}
	}

}
