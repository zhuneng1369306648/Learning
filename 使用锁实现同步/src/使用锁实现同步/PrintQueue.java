package ʹ����ʵ��ͬ��;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintQueue {
	private final Lock queueLock=new ReentrantLock();
	public void printJob(Object document) {
		queueLock.lock();
		try {
			Long duration=(long)(Math.random()*10000);
			System.out.println(Thread.currentThread().getName()+ "PrintQueue: Printing a "
					+ "Job during "+(duration/1000)+"seconds");
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		finally {
			queueLock.unlock();//�߳��뿪�ٽ�����ʱ�򣬱������unlock���ͷų��е���������������
		}
	}

}
//ʹ����ʵ��һ���ٽ��������ұ�֤ͬһʱ��ֻ��һ��ִ���̷߳�������ٽ������봴��һ��reentrantLock����
//������ٽ����Ŀ�ʼ������ͨ��lock��������������Ŀ��ƣ����߳�A�����������ʱ�����û�������̶߳�������Ŀ���
//lock���������߳�A��ȡ������������ִ���ٽ������룬������������߳�B����ִ��������������ٽ������룬��
//lock���������߳�A����ֱ��Bִ�����ٽ������롣
//trylock�����������߳��������ߣ����ǻ���������һ������ֵ��true��ʾ���������