package day1300;
/*
 * 创建线程的方式
 *     方式一
 *        1.自定义一个类继承Thread类
 *        2.重写Thread的run方法
 *        每个线程都有自己的任务代码，主线程的任务代码就是main方法中的所有方法
 *          自定义线程的任务代码就写在run方法中
 *        3.创建Thread的子类犯法，并且调用start方法开启线程
 * 
 * */
public class Demo1 extends Thread{
	
	
	public void run() {
		for(int i=0;i<100;i++) {
		System.out.println("hhaha");
		}
	}
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.start();
		for(int i=0;i<100;i++) {
			System.out.println(i);
		}
	}

}
