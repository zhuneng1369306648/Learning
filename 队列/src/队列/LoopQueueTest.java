package ����;

public class LoopQueueTest {
	public static void main(String[] args)
	{
		LoopQueue<String> queue = new LoopQueue<String>("aaaa",3);
		queue.add("bbbb");
		queue.add("cccc");
		System.out.print(queue);
		queue.remove();
		System.out.println("ɾ��һ��Ԫ�غ�Ķ���" +queue);
		queue.add("dddd");
		System.out.println("����ʱ��ĳ���"+queue.length());
		queue.remove();
		queue.remove();
		System.out.println(queue);
		queue.clear();
		System.out.println(queue);
	}

}
