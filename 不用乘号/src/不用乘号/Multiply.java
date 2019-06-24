package 不用乘号;

import java.util.Scanner;

public class Multiply {
	public static void main(String[] args) {
	Scanner c = new Scanner(System.in);
	System.out.println("请输入数字");
	int num1 = c.nextInt();
	System.out.println("请输入");
	int num2 = c.nextInt();
	System.out.println("乘以2等于"+(num1<<1));
	System.out.println("实现两个数字的呼唤");
	num1 = num1^num2;
	num2 = num2^num1;
	num1 = num1^num2;
	System.out.println(num1+"数字为"+num2);
	}
}
