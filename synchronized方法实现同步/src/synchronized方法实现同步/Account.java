package synchronized方法实现同步;//synchronized同步的



//一个对像的方法采用synchronized关键字进行声明，只能被一个线程访问，如果一个线程执行同步方法，另一个线程将被柱塞
//到那个线程运行完，但是如果线程访问的是同一个类的不同对象，那么两个线程都不会被柱塞。
public class Account {
	private double balance;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public synchronized void addAmount(double amount) {
		double tmp=balance;
		try {
			Thread.sleep(10);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		tmp+=amount;
		balance=tmp;
	}
	public synchronized void subtractAmount(double amount) {
		double tmp=balance;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tmp-=amount;
		balance=tmp;
	}

}
