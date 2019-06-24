package 队列;

public class LoopQueueTest {
	public static void main(String[] args)
	{
		LoopQueue<String> queue = new LoopQueue<String>("aaaa",3);
		queue.add("bbbb");
		queue.add("cccc");
		System.out.print(queue);
		queue.remove();
		System.out.println("删除一个元素后的队列" +queue);
		queue.add("dddd");
		System.out.println("对满时候的长度"+queue.length());
		queue.remove();
		queue.remove();
		System.out.println(queue);
		queue.clear();
		System.out.println(queue);
	}

}
