package day11; /*
 * ģ��ģʽ
 * ģ��ģʽ�Ĳ���
 *    1.��д�����������������һ���Ľ������
 *    2.��������
 *    3.ʹ��final����ģ�巽������ֹ��д��
 * */
abstract class MyRuntime{
	public final void getTime() {
		//��¼��ʼ��ʱ��
		long startTime = System.currentTimeMillis();
		code();
		long endTime = System.currentTimeMillis();
		System.out.println("����ʱ��"+(endTime-startTime));
	}
	public abstract void code();
}

public class Demo11 extends MyRuntime{
	public static void main(String[] args) {
		Demo11 d = new Demo11();
		d.getTime();
	}

	@Override
	public void code() {
		// TODO Auto-generated method stub
		int i=0;
		while(i<100) {
			System.out.println(i);
			i++;
		}
		
	}

}
