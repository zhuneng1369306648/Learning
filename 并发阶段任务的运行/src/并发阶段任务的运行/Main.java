package �����׶����������;

import java.util.concurrent.Phaser;

public class Main {
	public static void main(String[] args) {
		Phaser phaser=new Phaser(3);
		FileSearch system=
				new FileSearch("C:\\Windows","log",phaser);
		FileSearch apps=
				new FileSearch("C:\\Program Files","log",phaser);
		FileSearch documents=
				new FileSearch("C:\\Documents And Settings","log",phaser);
		Thread systemThread=new Thread(system,"System");
		systemThread.start();
		Thread documentsThread=new Thread(documents,"Documents");
		documentsThread.start();
		Thread appsThread=new Thread(apps,"Apps");
		appsThread.start();
		try {
			systemThread.join();
			appsThread.join();
			documentsThread.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Terminated:"+phaser.isTerminated());
	}//һ��phaser����������״̬����Ծ̬����ֹ̬��
     //������ͬ�����߳�ʱ��Phaser���ǻ�Ծ�ģ�������ÿ���׶ν�����ʱ�����ͬ��
	//��ֹ̬�������в���ͬ�����̶߳�ȡ��ע���ʱ��phaser�ͳ�ȥ��ֹ״̬������������£�phaserû���κβ����ߣ�
	//phaser�ش��������ǲ��ض����ķ��������쳣������phaser�������ߵ��̲߳�����Ӧ�ж��¼���Ҳ�����׳��쳣
}
