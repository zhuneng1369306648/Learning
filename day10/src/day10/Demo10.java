package day10;

/*
 * �쳣�Ĵ���
 * ��ʽһ��������
 *       ������ĸ�ʽ
 *        try{
 *        ���ܷ����쳣�Ĵ���
 *        }catch��������쳣���� ��������{
 *        �����쳣�Ĵ��롣
 *        }
 * ��ʽ���� �׳�����*/

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
			System.out.println("�����˿�ָ���쳣������");
		}
		System.out.println("c="+c);
	}

}*/
