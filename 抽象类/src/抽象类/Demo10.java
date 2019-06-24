package 抽象类;
/*
 * 类与接口之间的关系：实现关系
 * 类与接口需要注意
 * 1.非抽象类实现一个借口时，必须把接口中的所有方法实现
 * 2.抽象类实现一个接口时，可以实现也可以不识闲接口中的方法。
 * 3.一个类可以实现多个接口
 *    java为什么单继承，而是多实现
 *         
 *         
 *         
 *         
 *         接口和接口时继承关系
 *         
 *         1.一个接口可以继承多个接口*/

public class Demo10 implements C{
	public static void main(String[] args) {
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("这是一个接口");
	}

}
interface C{
	public void print();
}
abstract class Animal implements C{
	
}
