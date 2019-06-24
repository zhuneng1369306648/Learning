package 抽象类;
//interface 接口名{}
/*
 * 接口注意的事项
 * 1.接口是一个特殊的类
 * 2.接口的成员变量默认修饰符为public static final ，也就是接口中的成员变量都是常量
 * 3.接口中的犯法都是抽象的方法，默认修饰符为public abstract
 * 4.就扣不能创建对象
 * 5.接口没有构造方法
 * 6.接口是给类实现使用的，必须要把接口中的所有方法全部实现*/
public class Demo6 implements A {
	public static void main(String[] args) {
		Demo6 d = new Demo6();
		d.print();
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("这个是接口中的方法");
		
	}

}
interface A{
	public static final int i = 10;
	public void print();
}
