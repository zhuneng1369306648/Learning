package ���ó˺�;

import java.util.Scanner;

public class Multiply {
	public static void main(String[] args) {
	Scanner c = new Scanner(System.in);
	System.out.println("����������");
	int num1 = c.nextInt();
	System.out.println("������");
	int num2 = c.nextInt();
	System.out.println("����2����"+(num1<<1));
	System.out.println("ʵ���������ֵĺ���");
	num1 = num1^num2;
	num2 = num2^num1;
	num1 = num1^num2;
	System.out.println(num1+"����Ϊ"+num2);
	}
}
