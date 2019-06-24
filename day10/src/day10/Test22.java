package day10;

import java.util.Stack;

public class Test22 {
	public static boolean isPopOrder(int[] push,int[] pop) {
		if(push==null || pop ==null||pop.length==0||push.length==0||push.length != pop.length) {
			return false;
		}
		Stack<Integer> stack = new Stack<>();
		int pushIndex = 0;
		int popIndex = 0;
		while(popIndex < pop.length) {
			while(pushIndex < push.length && (stack.isEmpty() || stack.peek() != pop[popIndex])) {
				stack.push(push[pushIndex]);
				pushIndex++;
			}
			if(stack.peek()==pop[popIndex]) {
				stack.pop();
				popIndex++;
			}else {
				return false;
			}
		}
		return true;
	}

}
