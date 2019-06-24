package day10;

import java.util.Stack;

public class Test07 {
	public static class MList<T>{
		private Stack<T> stack1 = new Stack<>();
		private Stack<T> stack2 = new Stack<>();
		public MList() {}
		public void appendTail(T t) {
			stack1.add(t);
		}
		public T deleteHead() {
			if(stack2.isEmpty()) {
				while(!stack1.isEmpty()) {
					stack2.add(stack1.pop());
				}
			}
			if(stack2.isEmpty()) {
				throw new RuntimeException("No more element");
			}
			return stack2.pop();
		}
	}

}
