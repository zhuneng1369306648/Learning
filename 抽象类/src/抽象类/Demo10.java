package ������;
/*
 * ����ӿ�֮��Ĺ�ϵ��ʵ�ֹ�ϵ
 * ����ӿ���Ҫע��
 * 1.�ǳ�����ʵ��һ�����ʱ������ѽӿ��е����з���ʵ��
 * 2.������ʵ��һ���ӿ�ʱ������ʵ��Ҳ���Բ�ʶ�нӿ��еķ�����
 * 3.һ�������ʵ�ֶ���ӿ�
 *    javaΪʲô���̳У����Ƕ�ʵ��
 *         
 *         
 *         
 *         
 *         �ӿںͽӿ�ʱ�̳й�ϵ
 *         
 *         1.һ���ӿڿ��Լ̳ж���ӿ�*/

public class Demo10 implements C{
	public static void main(String[] args) {
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("����һ���ӿ�");
	}

}
interface C{
	public void print();
}
abstract class Animal implements C{
	
}
