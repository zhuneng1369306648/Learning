package 工厂类创建线程;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadFactory;

public class MyThreadFactory implements ThreadFactory{
//	声明3个属性，整形数字counter，用来存储线程对象的数量，字符串name，用来存放每个线程的名称，字符串列表stats，
//	用来存放线程对象的统计数据，同事实现3个构造器来初始化这3个属性
    private int counter;
    private String name;
    private List<String> stats;
    public MyThreadFactory(String name) {
    	counter=0;
    	this.name=name;
    	stats=new ArrayList<String>();
    }
	@Override
	public Thread newThread(Runnable r) {//以Runnable接口对象为参数，并且返回参数对应的线程对象，这里创建一个
		//线程对象生成线程名称，保存统计数据
		// TODO Auto-generated method stub
		Thread t=new Thread(r,name+"-Thread_"+counter);
		counter++;
		stats.add(String.format("Created thread %d with name %s on %s\n", t.getId(),t.getName(),new Date()));
		return t;
	}
	public String getStats() {//返回一个字符串对象，用来表示所有线程对象的统计数据
		StringBuffer buffer=new StringBuffer();
		Iterator<String> it=stats.iterator();
		while(it.hasNext()) {
			buffer.append(it.next());//append连接一个对象到末尾
			buffer.append("\n");
		}
		return buffer.toString();
	}

}
