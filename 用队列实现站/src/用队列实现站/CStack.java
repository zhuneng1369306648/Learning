package 用队列实现站;



import java.util.LinkedList;
import java.util.Queue;

public class CStack {
	private static Queue<Integer> queue1 = new LinkedList<>();
	private static Queue<Integer> queue2 = new LinkedList<>();
	private void appendTail(int elem) {
		if(!queue2.isEmpty()) {
			queue2.offer(elem);
		}else {
			queue1.offer(elem);
		}
		System.out.println("queue1"+queue1.toString());
		System.out.println("queue2: "+queue2.toString());
	}
	private void deleteHead() {
		Queue<Integer> emptyQueue = queue1;
		Queue<Integer> notEmptyQueue = queue2;
		if(!emptyQueue.isEmpty()) {
			emptyQueue = queue2;
			notEmptyQueue = queue1;
		}
		while(notEmptyQueue.size()!=1) {
			emptyQueue.offer(notEmptyQueue.poll());
		}
		notEmptyQueue.poll();
		System.out.println("Queue1:" + queue1.toString());
		System.out.println("Queue2:" +queue2.toString());
	}
	public static void main(String[] args) {
		CStack test = new CStack();
		test.appendTail(1);
		test.appendTail(2);
		test.appendTail(3);
		test.deleteHead();
		test.appendTail(4);
		test.deleteHead();
	}

}
