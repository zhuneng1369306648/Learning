package 并发阶段任务的运行;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

public class FileSearch implements Runnable{
	private String initPath;//用来存储查找的文件夹
	private String end;//用来存储查找的扩展名
	private List<String> results;
	private Phaser phaser;
	public FileSearch(String initPath,String end,Phaser phaser) {
		this.initPath=initPath;
		this.end=end;
		this.phaser=phaser;
		results=new ArrayList<>();
	}
	private void directoryProcess(File file) {
		File list[] = file.listFiles();
		if(list != null) {
			for(int i=0;i<list.length;i++) {
				if(list[i].isDirectory()) {
					directoryProcess(list[i]);
				}else {
					fileProcess(list[i]);
				}
			}
		}
	}
	

	private void fileProcess(File file) {//用于检查我们需要的文件扩展名是不是我们需要的
		// TODO Auto-generated method stub
		if(file.getName().endsWith(end)) {
			results.add(file.getAbsolutePath());
		}
		
	}
	private void fileterResults() {
		List<String> newResults=new ArrayList<>();
		long actualDate=new Date().getTime();
		for(int i=0;i<results.size();i++) {
			File file=new File(results.get(i));
			long fileDate=file.lastModified();
			if(actualDate-fileDate< TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS)) {
				newResults.add(results.get(i));
			}
		}
		results=newResults;
	}
	private boolean checkResults() {
		if(results.isEmpty()) {
			System.out.printf("%s Phase %d: 0 results.\n", Thread.currentThread().getName(),
					phaser.getPhase());
			System.out.printf("%s Phase %d: End \n", Thread.currentThread().getName(),phaser.getPhase());
			phaser.arriveAndDeregister();//实现对phaser对象的通知，没有理由继续执行，不再等待
			return false;                  //撤销了对phaser的注册，
		}else {
			System.out.printf("%s: phase %d: %d results.\n", Thread.currentThread().getName(),
					phaser.getPhase(),results.size());
			phaser.arriveAndAwaitAdvance();//来到这个相位和等待别人
			return true;
		}
	}
	private void showInfo() {
		for(int i=0;i<results.size();i++) {
			File file=new File(results.get(i));
			System.out.printf("%s : %s\n", Thread.currentThread().getName(),file.getAbsolutePath());
		}
		phaser.arriveAndAwaitAdvance();//调用这个方法，保证3个进程都已经完成.
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		phaser.arriveAndAwaitAdvance();//知道我们需要的同步进程数，来一个就减1，使其进入休眠状态，
		//直到所有其他进程完成这个阶段
		System.out.printf("%s Starting \n", Thread.currentThread().getName());
		File file = new File(initPath);
		if(file.isDirectory()) {
			directoryProcess(file);
		}
		if(!checkResults()) {
			return;
		}
		fileterResults();
		if(!checkResults()) {
			return;
		}
		showInfo();
		phaser.arriveAndAwaitAdvance();
		System.out.printf("%s: work completed \n",Thread.currentThread().getName());
	}

}
