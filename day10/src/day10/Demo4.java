package day10;
/*�ڲ����class�ļ����ⲿ��$�ڲ��࣬�ô����������ָ�class�ļ��Ǵ����ĸ��ⲿ���
 *�ڲ���ô�
 *  1.�ڲ������ֱ�ӷ����ⲿ������г�Ա
 *Ӧ�ó�����
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
	//��Ա�ڲ���
	static class Inner{
		static  int i =10;
		public void print() {
			System.out.println("����ǳ�Ա�ڲ����print����!");
		}
	}
	public void instance() {
		System.out.println(x);
		Inner inner = new Inner();
		inner.print();
	}
}
