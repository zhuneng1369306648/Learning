package 队列实现站;

import java.util.Stack;

/*public class CQueue {
	private Stack<Integer> stack1 = new Stack<>();
	private Stack<Integer> stack2 = new Stack<>();
	public void appendTail(int elem) {
		stack1.push(elem);
		System.out.println("Stack1:" + stack1.toString());
		}
	public void deleteHead() {
		if(!stack2.isEmpty()) {
			stack2.pop();
		}else if(!stack1.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			stack2.pop();
		}else {
			System.out.printf("两个站都空了");
		}
		System.out.println("stack1:"+stack1.toString());
		System.out.println("stack2:"+stack2.toString());
	}
	public static void main(String[] args) {
		CQueue test = new CQueue();
		test.appendTail(1);
		test.appendTail(2);
		test.appendTail(3);
		test.deleteHead();
		test.deleteHead();
		test.deleteHead();
		test.appendTail(4);
		test.deleteHead();
	}
	}

public class CQueue{
	private Stack<Integer> stack1 = new Stack<>();
	private Stack<Integer> stack2 = new Stack<>();
	public void appendTail(int elem) {
		stack1.push(elem);
		System.out.println("Stack1:"+ stack1.toString());
	}
	public void deleteHead() {
		if(!stack2.isEmpty()) {
			stack2.pop();
		}else if(!stack1.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}stack2.pop();
		}else {
			System.out.printf("两个站都为空");
		}
		System.out.println("stack1:" +stack1.toString());
		System.out.println("stack2:" +stack2.toString());
	}
	public static void main(String[] args) {
		CQueue test = new CQueue();
		test.appendTail(1);
		test.appendTail(2);
		test.appendTail(3);
		test.deleteHead();
		test.deleteHead();
		test.deleteHead();
		test.appendTail(4);
		test.deleteHead();
	}
	
}
public class CQueue{
	private Stack<Integer> stack1 = new Stack<>();
	private Stack<Integer> stack2 = new Stack<>();
	public void appendTail(int elem) {
		stack1.push(elem);
		System.out.println("Stack1:" +stack1.toString());
	}
	public void deleteHead() {
		if(!stack2.isEmpty()) {
			stack2.pop();
		}else if(!stack1.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}stack2.pop();
		}else {
			System.out.println("两个站都为空");
		}
		System.out.println();
	}
}*/
public class CQueue{
	private Stack<Integer> stack1 = new Stack<>();
	private Stack<Integer> stack2 = new Stack<>();
	public void appendTail(int elem) {
		stack1.push(elem);
		System.out.println("Stack1:" +stack1.toString());
	}
	public void deleteHead(){
		if(!stack2.isEmpty()) {
			stack2.pop();
		}else if(!stack1.isEmpty()) {
				while(!stack1.isEmpty()) {
					stack1.push(stack2.pop());
				}
				stack2.pop();
			}else {
				System.out.println("站为空");
				
			}
		
	}
}
	