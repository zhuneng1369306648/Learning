package 兔子;

import java.util.Scanner;

public class Rabbit {
	public static void main(String[] args) {
		int sum=1;
		int month;
		int temp=1;
		int temp1 = 1;
		Scanner c = new Scanner(System.in);
		System.out.println("请输入几个月");
		month = c.nextInt();
		for(int i=1;i<=month;i++) {
			if(i<=2) {
				sum =1;
			}
			else {
				sum= temp + temp1;
				temp = temp1;
				temp1 = sum;
			}
			System.out.println("第" + i + "个月的兔子数是：" + sum);
			
		}
	}
}
