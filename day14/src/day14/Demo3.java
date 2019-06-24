package day14;
/*
 * 自定义线程的创建方式
 * 方式一
 *    1.自定义一个类继承Thread类
 *    2.重写Thread类的Run方法，吧自定义线程的任务代码写在run方法上
 *    3.创建Thread的子类对象，并且调用start方法启动一个线程
 *    
 *    注意
 *       不要直接点用run方法，调用start线程就会开启，一旦开启就会执行run中的代码
 *       一旦直接调用run方法就是相当于调用了一个普通的方法
 *       
 * 方式二
 *     1.自定义一个类实现runnable接口
 *     2.实现Runnable接口的run方法，把自定义线程的任务定义在run方法上
 *     3.创建runnable实现类对象
 *     4.创建Thread类的对象，并且把Runnable实现类的对象作为实参传递
 *     5.调用Thread对象的start方法开启一个线程*/



public class Demo3 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
	public static void main(String[] args) {
		//Demo3 d = new Demo3();
		Thread thread = new Thread();
		thread.start();
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}
