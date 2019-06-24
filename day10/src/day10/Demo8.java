package day10;
/*Throwable
 *     Error
 *     Exception
 *     
 *     
 *     Throwable常用方法
 *     toString()   //返回throwable的剪短描述，，返回当前异常对象的完整类名+病态信息。
 *     getMessage()  //返回创建throwable传入的字符串信息
 *     printStackTrice() //打印异常的栈信息
 * */
public class Demo8 {
	public static void main(String[] args) {
		/*Throwable t = new Throwable("生病");
		String info = t.toString();
		String message = t.getMessage();
		 //stack = t.printStackTrace();
		System.out.println(info); //返回      包名+类名 = 完整类名
		System.out.println(message);*/
		test();
	}
	public static void test() {
		Throwable t = new Throwable();
		t.printStackTrace();
	}

}
