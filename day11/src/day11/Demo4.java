package day11;
/*
 * Exception���쳣����Ϊ
 *                     ����ʱ�쳣(�����Ա��ⷢ��)��һ�������ڲ����׳�����ʱ�쳣�������Ͽ�������Ҳ���Բ�����
 *                                
 *                     ����ʱ�쳣��������ʱ�쳣���ܼ��쳣�����������������봦��
 *                     
 *                     
 *    RuntimeException ���������඼��������ʱ�쳣
 *    ��������ʱһ�����Ǳ���ʱ�쳣��
 *    
 *    ����ʱ�쳣���ǿ���ͨ�����õı��ϰ��ȥ����ģ�����Java����������Ҫһ������*/

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

