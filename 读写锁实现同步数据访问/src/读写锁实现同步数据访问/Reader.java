package 读写锁实现同步数据访问;

public class Reader implements Runnable{
	private PricesInfo pricesInfo;
	public Reader(PricesInfo pricesInfo) {
		this.pricesInfo=pricesInfo;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.printf("%s: prices 1: %f\n", Thread.currentThread().getName(),pricesInfo.getPrice1());
			System.out.printf("%s:prices 2 :%f\n", Thread.currentThread().getName(),pricesInfo.getPrice2());
		}
	}

}
