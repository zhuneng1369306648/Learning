package 锁中使用多条件;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Buffer {
	//设置buffer的6个属性
	//linkedList<String>属性buffer，用来存放共享数据
	//int属性maxsize，用来存放buffer的长度
	//reentrantLock对象lock，用来对修改buffer的代码块进行控制
	//两个condition属性lines和space
	//Boolean类型pendingLines，用来表明缓冲区是否还有数据
	private LinkedList<String> buffer;
	private int maxSize;
	private ReentrantLock lock;
	private Condition lines;
	private Condition space;
	private boolean pendingLines;
	public Buffer(int maxSize) {
		this.maxSize=maxSize;
		buffer=new LinkedList<>();
		lock=new ReentrantLock();
		lines=lock.newCondition();
		space=lock.newCondition();
		pendingLines=true;
	}
	public void insert(String line) {
		lock.lock();
		try {
			while(buffer.size() == maxSize) {
				space.await();
			}
			buffer.offer(line);
			System.out.printf("%s:Inserted Line: %d\n", Thread.currentThread().getName(),buffer.size());
			lines.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		} 
	}
	public String get() {
		String line=null;
		lock.lock();
		try {
			while((buffer.size()==0) && (hasPendingLines())) {
				lines.await();
			}
			if(hasPendingLines())
			{
				line = buffer.poll();
				System.out.printf("%s: line Readed: %d\n", Thread.currentThread().getName(),buffer.size());
				space.signalAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		return line;
	}
	public void setPendingLines(boolean pendingLines) {
		this.pendingLines=pendingLines;
	}
	public boolean hasPendingLines() {
		return pendingLines || buffer.size() > 0;
	}

}
