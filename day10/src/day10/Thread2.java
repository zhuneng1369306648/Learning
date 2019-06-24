package day10;

class Thread2 implements Runnable{
	
	private String name;
	public Thread2(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println(name+"运行"+i);
			try {
				Thread.sleep((int) Math.random() * 10);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	public static class Main{
		public static void main(String[] args) {
			new Thread(new Thread2("c")).start();
			new Thread(new Thread2("d")).start();
		}
	}

}
