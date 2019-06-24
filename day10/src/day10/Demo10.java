package day10;

/*
 * 异常的处理
 * 方式一：捕获处理
 *       捕获处理的格式
 *        try{
 *        可能发生异常的代码
 *        }catch（捕获的异常类型 变量名）{
 *        处理异常的代码。
 *        }
 * 方式二： 抛出处理*/

public class Demo10 {
	public static void main(String[] args) {
		A aa = new A();
		A ab = new B();
		B b = new B();
		C c = new C();
		D d = new D();
		
	}
}
class A{
	public String run(D obj) {
		return ("A& D");
	}
	public String run(A obj) {
		return ("A& A");
	}
}
class B extends A{
	public String run(B obj) {
		return ("B & B");
	}
	public String run(A obj) {
		return ("B & A");
	}
}
class C extends B{}
class D extends B{}



/*
	public static void div(int a,int b ,int [] arr) {
		int c = 0;
		try {
		 c = a/b;
		 System.out.println(arr.length);
		}catch (ArithmeticException e) {
			System.out.println("toString"+e.toString());
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println("出现了空指针异常。。。");
		}
		System.out.println("c="+c);
	}

}*/
