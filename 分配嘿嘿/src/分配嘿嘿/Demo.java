package 分配嘿嘿;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入员工的姓名");
		String name = scan.nextLine();
		System.out.println("请输入新员工会的编程语言");
		String language = scan.nextLine();
		switch(language.hashCode()){
			case 3254818:
			case 2301506:
			case 2269730:
				System.out.println("员工"+name+"被分配到Java程序开发部门");
				break;
			default:
					System.out.println("不需要");
		}
	}

}
