package day11; /*
 * 模板模式
 * 模板模式的步骤
 *    1.先写出解决该类事情其中一件的解决方案
 *    2.分析代码
 *    3.使用final修饰模板方法，防止重写。
 * */
abstract class MyRuntime{
	public final void getTime() {
		//记录开始的时间
		long startTime = System.currentTimeMillis();
		code();
		long endTime = System.currentTimeMillis();
		System.out.println("运行时间"+(endTime-startTime));
	}
	public abstract void code();
}

public class Demo11 extends MyRuntime{
	public static void main(String[] args) {
		Demo11 d = new Demo11();
		d.getTime();
	}

	@Override
	public void code() {
		// TODO Auto-generated method stub
		int i=0;
		while(i<100) {
			System.out.println(i);
			i++;
		}
		
	}

}
