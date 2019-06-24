package �����ഴ���߳�;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadFactory;

public class MyThreadFactory implements ThreadFactory{
//	����3�����ԣ���������counter�������洢�̶߳�����������ַ���name���������ÿ���̵߳����ƣ��ַ����б�stats��
//	��������̶߳����ͳ�����ݣ�ͬ��ʵ��3������������ʼ����3������
    private int counter;
    private String name;
    private List<String> stats;
    public MyThreadFactory(String name) {
    	counter=0;
    	this.name=name;
    	stats=new ArrayList<String>();
    }
	@Override
	public Thread newThread(Runnable r) {//��Runnable�ӿڶ���Ϊ���������ҷ��ز�����Ӧ���̶߳������ﴴ��һ��
		//�̶߳��������߳����ƣ�����ͳ������
		// TODO Auto-generated method stub
		Thread t=new Thread(r,name+"-Thread_"+counter);
		counter++;
		stats.add(String.format("Created thread %d with name %s on %s\n", t.getId(),t.getName(),new Date()));
		return t;
	}
	public String getStats() {//����һ���ַ�������������ʾ�����̶߳����ͳ������
		StringBuffer buffer=new StringBuffer();
		Iterator<String> it=stats.iterator();
		while(it.hasNext()) {
			buffer.append(it.next());//append����һ������ĩβ
			buffer.append("\n");
		}
		return buffer.toString();
	}

}
