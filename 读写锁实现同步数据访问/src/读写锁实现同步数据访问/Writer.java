package 读写锁实现同步数据访问;

public class Writer implements Runnable{
	private PricesInfo pricesInfo;
	public Writer(PricesInfo pricesInfo) {
		this.pricesInfo=pricesInfo;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			System.out.printf("Writer: Attempt to mpdify the prices\n");
			pricesInfo.setPrices(Math.random()*10, Math.random()*8);
			System.out.printf("Writer: Prices have been modd.\n");
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
