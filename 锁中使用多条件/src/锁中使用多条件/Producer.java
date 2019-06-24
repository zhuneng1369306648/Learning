package 锁中使用多条件;

public class Producer implements Runnable{
	private FileMock mock;
	private Buffer buffer;
	public Producer(FileMock mock,Buffer buffer) {
		this.mock=mock;
		this.buffer=buffer;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		buffer.setPendingLines(true);
		while(mock.hasMoreLines()) {
			String line=mock.getLine();
			buffer.insert(line);
		}
		buffer.setPendingLines(false);
	}

}
