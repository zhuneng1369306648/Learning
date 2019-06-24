package day11;
/*
 * Exception（异常）分为
 *                     运行时异常(都可以避免发生)：一个方法内部，抛出运行时异常，方法上可以声明也可以不声明
 *                                
 *                     编译时异常（非运行时异常，受检异常）：必须声明，必须处理
 *                     
 *                     
 *    RuntimeException 和他的子类都属于运行时异常
 *    除了运行时一场都是编译时异常，
 *    
 *    运行时异常都是可以通过良好的编程习惯去避免的，所以Java编译器不必要一定处理*/

public class Demo4 {
	public static void main(String[] args) {
		div(4,0);
	}

	public static void div(int a, int b) throws ArithmeticException{
		if(b==0) {
			throw new ArithmeticException();
		}
		int c = a/b;
		System.out.println("c="+c);
	}
}

