package day130;

import java.util.Random;

public class Demo4 {
	public static void main(String[] args) {
		System.out.println(Math.abs(-3));
		System.out.println(Math.ceil(-3.55));//向上取整
		System.out.println(Math.floor(-3.86));//向下取整
		Random random = new Random();
		int randomNum = random.nextInt(11);
		System.out.println(randomNum);
		
	}

}
