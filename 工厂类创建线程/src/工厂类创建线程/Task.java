package �����ഴ���߳�;

import java.util.concurrent.TimeUnit;

public class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			TimeUnit.SECONDS.sleep(1);//һ��TimeUnit��Ҫ����֪ͨʱ��ķ�����θ���ʱ�����Ľ���Ӧ��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	} 
//	����������У�ͨ���ؼ���extends������һ��������ࡣһ����ͨ���ؼ���implements�����Լ�ʹ��һ�����߶���ӿڡ�
//	extends �Ǽ̳�ĳ����, �̳�֮�����ʹ�ø���ķ���, Ҳ������д����ķ���; 
//	implements ��ʵ�ֶ���ӿ�, �ӿڵķ���һ��Ϊ�յ�, ������д����ʹ��
//	2.extends�Ǽ̳и��ֻ࣬Ҫ�Ǹ��಻������Ϊfinal�����Ǹ��ඨ��Ϊabstract�ľ��ܼ̳У�JAVA�в�֧�ֶ��ؼ̳У�
//	���ǿ����ýӿ� ��ʵ�֣�
//	������Ҫ�õ�implements��
//	�̳�ֻ�ܼ̳�һ���࣬��implements����ʵ�ֶ���ӿڣ��ö��ŷֿ�������

}
