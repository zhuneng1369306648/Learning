package day1300;



class Video extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("ÊÓÆµ¡£¡£¡£");
		}
	}
}


class TalkThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("ÄãºÃ");
		}
	}
}
public class Demo2 {
	public static void main(String[] args) {
		TalkThread talkThread = new TalkThread();
		talkThread.start();
		Video video = new Video();
		video.start();
		
	}

}
