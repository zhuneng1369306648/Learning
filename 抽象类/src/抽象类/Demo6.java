package ������;
//interface �ӿ���{}
/*
 * �ӿ�ע�������
 * 1.�ӿ���һ���������
 * 2.�ӿڵĳ�Ա����Ĭ�����η�Ϊpublic static final ��Ҳ���ǽӿ��еĳ�Ա�������ǳ���
 * 3.�ӿ��еķ������ǳ���ķ�����Ĭ�����η�Ϊpublic abstract
 * 4.�Ϳ۲��ܴ�������
 * 5.�ӿ�û�й��췽��
 * 6.�ӿ��Ǹ���ʵ��ʹ�õģ�����Ҫ�ѽӿ��е����з���ȫ��ʵ��*/
public class Demo6 implements A {
	public static void main(String[] args) {
		Demo6 d = new Demo6();
		d.print();
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("����ǽӿ��еķ���");
		
	}

}
interface A{
	public static final int i = 10;
	public void print();
}
