/*package other;


interface Work {
	public void work();
}
class Son implements Work{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("�ử��");
	}
	
}
class Mother implements Work{
      Work worker;
      public Mother(Work worker) {
    	  this.worker = worker;
      }
	@Override
	public void work() {
		worker.work();
		// TODO Auto-generated method stub
		System.out.println("��Ϳ��ɫ...");
	}
	
}
class Father implements Work{
	Work worker;
	public Father(Work worker) {
		this.worker = worker;
	}

	@Override
	public void work() {
		worker.work();
		// TODO Auto-generated method stub
		System.out.println("��װ����");
	}
	
}

public class Demo3 {
	public static void main(String[] args) {
		Son s = new Son();
		Mother m = new Mother(s);
		m.work();
		Father f = new Father(s);
		f.work();
	}

}
*/
package other;

/*��ϰ��
	һ������ÿ���˶��Ṥ�������ӵĹ������ǻ�����ĸ�׵Ĺ��������ڶ��ӵĻ�������һ����ǿ������ֹ���Ի�������������Ϳ�ϡ�
	�ְֵĹ������������������������ǿ�������ϻ���
*/

interface Work{
	
	public void work();
}

class Son implements Work{

	@Override
	public void work() {
		System.out.println("����...");
	}
}


class Mather implements Work{

	//��Ҫ����ǿ���ࡣ
	Work worker;
	
	public Mather(Work worker){
		this.worker = worker;
	}
	
	@Override
	public void work() {
		worker.work();
		System.out.println("��������ɫ..");
	}
}


class Father implements Work{

	//��Ҫ����ǿ���������
	Work worker;
	
	public Father(Work worker){
		this.worker = worker;
	}
	
	
	@Override
	public void work() {
		worker.work();
		System.out.println("�ϻ���...");
	}
	
}


public class Demo3 {
	
	public static void main(String[] args) {
		Son s = new Son();
//		s.work();
		Mather m = new Mather(s);
//		m.work();
		Father f = new Father(m);
		f.work();
		
		
	}
}
