package synchronized方法实现同步;

//使用synchronized关键字会降低程序应用的性能，，可以通过synchronized关键字的方法来保护代码块（而不是整个方法）的访问

public class Main {
	public static void main(String[] args) {
		Account account=new Account();
		account.setBalance(1000);
		Company company=new Company(account);
		Thread companyThread=new Thread(company);
		Bank bank=new Bank(account);
		Thread bankThread=new Thread(bank);
		System.out.printf("Account:initial Balance:%f\n", account.getBalance());
		companyThread.start();
		bankThread.start();
		try {
			companyThread.join();
			bankThread.join();
			System.out.printf("Account:final Balance: %f\n", account.getBalance());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
