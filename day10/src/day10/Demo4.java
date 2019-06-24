package day10;
/*内部类的class文件，外部类$内部类，好处，便于区分该class文件是处于哪个外部类的
 *内部类好处
 *  1.内部类可以直接访问外部类的所有成员
 *应用场景：
 *  
 * */
public class Demo4 {
	public static void main(String[] args) {
		/*Outer outer = new Outer();
		outer.instance();*/
		//Outer.Inner inner = new Outer().new Inner();
		//inner.print();
	}

}
class Outer{
	int x = 100;
	//成员内部类
	static class Inner{
		static  int i =10;
		public void print() {
			System.out.println("这个是成员内部类的print方法!");
		}
	}
	public void instance() {
		System.out.println(x);
		Inner inner = new Inner();
		inner.print();
	}
}
