package day10;
/*Throwable
 *     Error
 *     Exception
 *     
 *     
 *     Throwable���÷���
 *     toString()   //����throwable�ļ��������������ص�ǰ�쳣�������������+��̬��Ϣ��
 *     getMessage()  //���ش���throwable������ַ�����Ϣ
 *     printStackTrice() //��ӡ�쳣��ջ��Ϣ
 * */
public class Demo8 {
	public static void main(String[] args) {
		/*Throwable t = new Throwable("����");
		String info = t.toString();
		String message = t.getMessage();
		 //stack = t.printStackTrace();
		System.out.println(info); //����      ����+���� = ��������
		System.out.println(message);*/
		test();
	}
	public static void test() {
		Throwable t = new Throwable();
		t.printStackTrace();
	}

}
